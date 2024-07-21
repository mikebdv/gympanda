package com.Gympanda.model;

public class Cliente {
    private String nombre;
    private int edad;

    private String tipoMenbresia;

    public Cliente() {


    }

    public Cliente(String nombre, int edad, String tipoMenbresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMenbresia = tipoMenbresia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoMenbresia() {
        return tipoMenbresia;
    }

    public void setTipoMenbresia(String tipoMenbresia) {
        this.tipoMenbresia = tipoMenbresia;
    }
}



