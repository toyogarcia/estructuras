package com.ejemplos.clases;

import java.util.Date;

public class DatoLombokApp {
    public static void main(String[] args) {
        DatoLombok datoLombok = new DatoLombok();
        datoLombok.setAge(29);
        datoLombok.setName("Toyo");
        //datoLombok.setFecha(); PENDIENTE
        System.out.println(datoLombok);

        //datoLombok = new DatoLombok("Pedro", 632);
        //System.out.println(datoLombok);
    }
}