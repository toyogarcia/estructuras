package com.unisys.miapp;

public class ProgramaClases {
    public static void main(String[] args) {

        Perro toby = new Perro();
        toby.raza = "Terrier";

        Perro otto = new Perro();
        otto.raza = "Pastor Aleman";

        System.out.println(toby);
        System.out.println(toby.raza);

        System.out.println(otto);
        System.out.println(otto.raza);

        Perro tara = new Perro();
        System.out.println(tara);
        System.out.println(tara.raza);

        Perro fluky = new Perro("Pastor de Aguas");
        System.out.println(fluky);
        System.out.println(fluky.raza);

        fluky.setRaza("Bulldog");
        System.out.println(fluky.getRaza());

        System.out.println(fluky.toString());

    }
}
