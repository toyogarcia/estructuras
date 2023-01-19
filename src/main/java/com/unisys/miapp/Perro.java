package com.unisys.miapp;

public class Perro {
    public String raza;

    Perro(){
        raza = "";
    }
    Perro(String raza){
        this.raza = raza;
    }
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
