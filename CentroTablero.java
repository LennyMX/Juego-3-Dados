package com.example.juegodados;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

import java.awt.*;

public class CentroTablero extends HBox {
    private Juego3Dados juego3Dados;
    private DadoUI dadoUI1;
    private DadoUI dadoUI2;
    private DadoUI dadoUI3;
    private Button lanzar = new Button("Lanzar");

    public CentroTablero(Juego3Dados juego3Dados) {
        this.juego3Dados = juego3Dados;
        dadoUI1 = new DadoUI();
        dadoUI2 = new DadoUI();
        dadoUI3 = new DadoUI();

        this.getChildren().addAll(dadoUI1, dadoUI2, dadoUI3, lanzar);
    }

    public Button getBotonLanzar() {
        return lanzar;
    }

    public void actualizarDados(int v1, int v2, int v3) {
        dadoUI1.cambiarEmoji(v1);
        dadoUI2.cambiarEmoji(v2);
        dadoUI3.cambiarEmoji(v3);
    }
}
