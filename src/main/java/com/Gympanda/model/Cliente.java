package com.Gympanda.model;

public class Cliente {

    private int cedula;
    private String nombre;
    private int edad;

    private String tipoMenbresia;

    public Cliente() {


    }

    public Cliente(int cedula, String nombre, int edad, String tipoMenbresia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoMenbresia = tipoMenbresia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
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



