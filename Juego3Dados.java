package com.example.juegodados;

public class Juego3Dados {

    private Dado d1;
    private Dado d2;
    private Dado d3;

    private int dadosSumados=0;

    public Juego3Dados(){
        d1=new Dado();
        d2=new Dado();
        d3=new Dado();
    }

    public void lanzar3Dados(){
        d1.lanzar();
        d2.lanzar();
        d3.lanzar();
    }

    public boolean sonLos3Iguales(){
        return d1.getCaraActual()==d2.getCaraActual() &&
                d1.getCaraActual()==d3.getCaraActual();
    }

    public int suma3Dados(){
        dadosSumados= d1.getCaraActual()+d2.getCaraActual()+d3.getCaraActual();
        return dadosSumados;
    }

    public int getSuma(){
        return dadosSumados;
    }

    public boolean Ganador(){
        return getSuma()>14 || sonLos3Iguales();
    }

    public void jugar(){
        lanzar3Dados();
        System.out.println("Tus dados son: ");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println("La suma es: "+suma3Dados());
        String resultado=Ganador()?"Felicidades es un ganador":"Has perdido";
        System.out.println(resultado);
    }

    public int getValorDado1(){
        return d1.getCaraActual();
    }
    public int getValorDado2(){
        return d2.getCaraActual();
    }
    public int getValorDado3(){
        return d3.getCaraActual();
    }
    public String misDados() {
        return "Dado1: " + d1.getCaraActual() +
                ", Dado2: " + d2.getCaraActual() +
                ", Dado3: " + d3.getCaraActual();
    }
}
