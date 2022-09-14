package com.josekisystems.java8.lambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Ve por la pelota " + param;
        String resultado = f1.apply("Laika");
        System.out.println(resultado);


        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("Laika"));

        BiFunction<String,String,String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("Bibi","Rorro");
        System.out.println(r2);

        BiFunction<String,String,Integer> f4 = String::compareTo;
        System.out.println(f4.apply("Dua","Dua"));

        BiFunction<String,String,String> f5 = String::concat;
        System.out.println(f5.apply("Dua","Lipa"));

    }
}
