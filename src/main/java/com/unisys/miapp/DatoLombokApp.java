package com.ejemplos.clases;

public class DatoLombokApp {
    public static void main(String[] args) {
        DatoLombok datoLombok = new DatoLombok();
        datoLombok.setAge(52);
        datoLombok.setName("Toyo");
        System.out.println(datoLombok);
        datoLombok = new DatoLombok("Toyo", 52);
        System.out.println(datoLombok);
    }
}