package com.example.juegodados;

import java.util.Random;

/**
 * Write a description of class Dado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dado
{
    private int caras;
    private String colorDado;
    private String colorPuntos;
    private int caraActual;

    public Dado(){
        caras=6;
    }
    public Dado(int cantidadCaras){
        caras=cantidadCaras;
        lanzar();
    }

    public int getCaras(){
        return caras;
    }

    public int lanzar(){
        Random rmd=new Random();
        caraActual=rmd.nextInt(6)+1;
        return caraActual;

    }

    public int getCaraActual(){
        return caraActual;
    }
    public String toString(){
        return ("Dado: "+caraActual);
    }
}
