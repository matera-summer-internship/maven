package com.matera.foo;

public class BarTest {

    static public void teste(final String arg) {
        System.out.println("Classe de teste.");
        System.out.println(arg);
        if ("Luis".equals(arg)) {
            System.out.println("sim");
        } else {
            System.out.println("nao");
        }
    }

    public static void main(final String... args) {
        teste(args[0]);
    }
}