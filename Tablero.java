package com.example.juegodados;

import javafx.scene.layout.BorderPane;

public class Tablero extends BorderPane {
    private JugadorUI ui1;
    private JugadorUI ui2;
    private JugadorUI ui3;
    private JugadorUI ui4;
    Juego3Dados juego3Dados;
    private CentroTablero centroTablero;

    public Tablero(Jugador j1, Jugador j2, Jugador j3, Jugador j4, Juego3Dados juego) {
        ui1 = new JugadorUI(j1);
        ui2 = new JugadorUI(j2);
        ui3 = new JugadorUI(j3);
        ui4 = new JugadorUI(j4);

        juego3Dados = juego;
        centroTablero = new CentroTablero(juego3Dados);
        this.setCenter(centroTablero);



        this.setTop(ui1);
        this.setBottom(ui3);
        this.setLeft(ui2);
        this.setRight(ui4);

    }

    public JugadorUI getUi1()
    {
        return ui1;
    }
    public JugadorUI getUi2()
    {
        return ui2;

    }
    public JugadorUI getUi3()
    {
        return ui3;
    }
    public  JugadorUI getUi4()
    {
        return ui4;
    }
    public CentroTablero getCentroTablero() {
        return centroTablero;
    }

}
