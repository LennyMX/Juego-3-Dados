package com.example.juegodados;

import com.example.juegodados.Juego3Dados;
import com.example.juegodados.Jugador;

public class ManejadorJuego {

    private Juego3Dados juego3Dados;
    private Jugador jugador1;
    private Jugador jugador2;
    private Jugador jugador3;
    private Jugador jugador4;
    private int numeroDeRondas;   
    private int rondaActual;      
    private int turnoJugador;     

    public ManejadorJuego() {
        this(3); 
    }

    public ManejadorJuego(int numeroDeRondas) {
        juego3Dados = new Juego3Dados();
        jugador1 = new Jugador("Susanita");
        jugador2 = new Jugador("Manolito");
        jugador3 = new Jugador("Mafalda");
        jugador4 = new Jugador("Libertad");
        this.numeroDeRondas = numeroDeRondas;
        this.rondaActual = 1;
        this.turnoJugador = 0;
    }
    public Jugador jugar() {
        Jugador jugador = null;
        switch (turnoJugador) {
            case 0: jugador = jugador1; break;
            case 1: jugador = jugador2; break;
            case 2: jugador = jugador3; break;
            case 3: jugador = jugador4; break;
        }

        if (jugador != null) {
            juego3Dados.lanzar3Dados();
            jugador.setPuntos(jugador.getPuntos() + juego3Dados.suma3Dados());
            System.out.println(jugador.getNombre() + " lanzó: " + juego3Dados.misDados() +
                    " -> Total puntos: " + jugador.getPuntos());
        }
        turnoJugador = (turnoJugador + 1) % 4;
        if (turnoJugador == 0) {
            rondaActual++;
        }

        return jugador;
    }
    public boolean juegoTerminado() {
        return rondaActual > numeroDeRondas;
    }
    public Jugador getGanadorFinal() {
        Jugador ganador = jugador1;
        if (jugador2.getPuntos() > ganador.getPuntos()) ganador = jugador2;
        if (jugador3.getPuntos() > ganador.getPuntos()) ganador = jugador3;
        if (jugador4.getPuntos() > ganador.getPuntos()) ganador = jugador4;

        return ganador;
    }
    public Juego3Dados getJuego3Dados() {
        return juego3Dados;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public Jugador getJugador3() {
        return jugador3;
    }

    public Jugador getJugador4() {
        return jugador4;
    }

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public int getRondaActual() {
        return rondaActual;
    }
}
