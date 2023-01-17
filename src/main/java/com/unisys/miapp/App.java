package com.unisys.miapp;

public class App {
    public static void main(String[] args) {


        // while
        int i = 0;
        while (i < 10) {
            System.out.println("Vuelta while: " +i);
            i++;
        }

        // do while
        i=0;
        do{
            System.out.println("Vuelta do while: " +i);
            i++;
        }while (i<10);

        // for de tipo simple
        for (i=0;i<10;i++){
            System.out.println("Vuelta for: " +i);
        }

        // Crea una sentencia condicional para que dependiendo de si el valor de la edad (int) de una persona, imprima por pantalla si puede o no conducir un coche
        i=29;
        if (i<18){
            System.out.println("No puede conducir. Edad: "+i);
        }
        else{
            System.out.println("Puede conducir. Edad: "+i);
        }

        /* Crea una sentencia condicional múltiple, para que dependiendo de la edad de una persona,
        si tiene 18, puede conducir,
        su tiene 21 podria beber en USA
        y si es cualquier otro valor, simplemente imprima la edad por pantalla.
         */
        i=198;
        switch(i){
            case 18:
                System.out.println("Puede conducir. Edad: "+i);
                break;
            case 21:
                System.out.println("Puede pillarse un pedo en USA. Edad: "+i);
                break;
            default:
                System.out.println("La edad es "+i);
                break;
        }

        /* Crea un bucle de tipo While que de 10 vueltas e imprima el número de vuelta por pantalla.
        Dentro del bucle, su el valor que utilizas de contador de vueltas es 5,
        haz que se salga con un break, si es 2 que haga un continue.
        */

        i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                break;
            }
            if (i == 2) {
                continue;
            }
            System.out.println("Vuelta while: " +i);
        }
    }
}
