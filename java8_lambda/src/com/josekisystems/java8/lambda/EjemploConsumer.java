package com.josekisystems.java8.lambda;

import com.josekisystems.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(f.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String,Integer> consumidorBi = (nombre, edad) -> {
            System.out.println(nombre + " tiene " + edad + " años!");
        };

        consumidorBi.accept("Dua Lipa",27);

        Consumer<String> consumidor2 =  System.out::println;
        consumidor2.accept("Future Nostalgia");

        List<String> nombres = Arrays.asList("Dua","Rorro", "Bibi", "Laika");
        nombres.forEach(consumidor2);

        Supplier<Usuario> creaUsuario = Usuario::new;

        //Usuario usuario = new Usuario();
        Usuario usuario = creaUsuario.get();

        BiConsumer<Usuario,String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Rorro");
        System.out.println("Nombre del usuario = " + usuario.getNombre());

        Supplier<String> provedor = () -> "Hola Bibi, how you doing?";
        System.out.println(provedor.get());
    }

}
