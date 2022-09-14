package com.josekisystems.java8.lambda;

import com.josekisystems.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num < 10;
        boolean r1 = test.test(7);
        boolean r2 = test.test(11);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        BiPredicate<String,String> t3 = String::equals;
        System.out.println(t3.test("Rorro","Bibi"));

        BiPredicate<Integer,Integer> t5 = (i,j) -> j > i;
        boolean r3 = t5.test(5,10);
        System.out.println(r3);

        Usuario a = new Usuario();
        Usuario b = new Usuario();

        a.setNombre("Laika");
        b.setNombre("Bibi");

        BiPredicate<Usuario,Usuario> t6 =(ua,ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println( t6.test(a,b));


    }
    
}
