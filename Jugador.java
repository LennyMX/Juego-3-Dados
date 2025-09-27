package com.example.juegodados;

public class Jugador {
    private String nombre;
    private int puntos;
    private int rondasGanadas; 

    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntos = 0;
        this.rondasGanadas = 0;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntos() {
        return puntos;
    }
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void incrementarRondasGanadas() {
        rondasGanadas++;
    }

    public int getRondasGanadas() {
        return rondasGanadas;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre +
                ", puntos: " + puntos +
                ", rondas ganadas: " + rondasGanadas;
    }
}
