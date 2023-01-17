package com.unisys.miapp;

public class AppArrays {
    public static void main(String[] args) {
        int[] miArray = new int[4];

        miArray[0] = 1;
        miArray[1] = 2;
        miArray[2] = 3;
        miArray[3] = 4;

        // Bucle for
        for (int cont: miArray) {
            System.out.println("Bucle for: elemento del array miArray "+cont);
        }

        // Bucle while
        int i = 0;
        while (i < miArray.length) {
            System.out.println("Bucle while: elemento del array miArray "+miArray[i]);
            i++;
        }

        // Bucle do while
        i=0;
        do{
            System.out.println("Bucle do while: elemento del array miArray "+miArray[i]);
            i++;
        }while (i<miArray.length);

        // Array de floats inicializado a 0
        float[] flotantes = new float[2000];

        i = 0;
        while (i < flotantes.length) {
            flotantes[i] = 0;
            i++;
        }

        flotantes[1] = 7.3f;
        System.out.println("Primer elemento del array flotantes: "+flotantes[0]);
        System.out.println("Segundo elemento del array flotantes: "+flotantes[1]);
        System.out.println("Tercero elemento del array flotantes: "+flotantes[2]);

        System.out.println("Numero de elementos del array flotantes: "+flotantes.length);

    }
}
