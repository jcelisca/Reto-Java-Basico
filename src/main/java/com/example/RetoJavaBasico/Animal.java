package com.example.RetoJavaBasico;

public class Animal {
    private String nombre;
    private String especie;
    private String habitat;

    public String getNombre() {
        return nombre;
    }

    public Animal(String nombre, String especie, String habitat){
        this.nombre = nombre;
        this.especie = especie;
        this.habitat = habitat;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}
