package com.unisys.miapp;

public class AppCadenas {

    public static void main(String[] args) {
        String saludo = "Buongiorno bafanculo";
        System.out.println("Contenido de variable saludo: "+saludo);
        System.out.println("Longuitud de variable saludo: "+saludo.length());
        System.out.println("Cuarto caracter de variable saludo: "+saludo.substring(3,4));
        System.out.println("Variable saludo en mayusculas: "+saludo.toUpperCase());
        System.out.println("Variable saludo en minusculas: "+saludo.toLowerCase());
        System.out.println("Posicion del caracter l en la variable saludo: "+saludo.indexOf("l"));
        String saludo2 = "Buongiorno bafanculo";
        if (saludo == saludo2) {
            System.out.println("Objetos iguales");
        }
        else {
            System.out.println("Objetos distintos");
        }

        if (saludo.equals(saludo2)) {
            System.out.println("cadenas iguales");
        }
        else {
            System.out.println("cadenas distintas");
        }

    }
}
