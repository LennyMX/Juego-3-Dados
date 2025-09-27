package com.example.juegodados;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControlJuego3Dados {

    private ManejadorJuego manejadorJuego;
    private Tablero tablero;

    public ControlJuego3Dados(Stage stage) {
        manejadorJuego = new ManejadorJuego(); 

        tablero = new Tablero(
                manejadorJuego.getJugador1(),
                manejadorJuego.getJugador2(),
                manejadorJuego.getJugador3(),
                manejadorJuego.getJugador4(),
                manejadorJuego.getJuego3Dados()
        );

        Scene scene = new Scene(tablero, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Juego 3 Dados");
        stage.show();

        tablero.getCentroTablero().getBotonLanzar().setOnAction(event -> {
            Jugador jugador = manejadorJuego.jugar(); 
            if (jugador == manejadorJuego.getJugador1()) {
                tablero.getUi1().setPuntos(jugador.getPuntos());
            } else if (jugador == manejadorJuego.getJugador2()) {
                tablero.getUi2().setPuntos(jugador.getPuntos());
            } else if (jugador == manejadorJuego.getJugador3()) {
                tablero.getUi3().setPuntos(jugador.getPuntos());
            } else if (jugador == manejadorJuego.getJugador4()) {
                tablero.getUi4().setPuntos(jugador.getPuntos());
            }
            tablero.getCentroTablero().actualizarDados(
                    manejadorJuego.getJuego3Dados().getValorDado1(),
                    manejadorJuego.getJuego3Dados().getValorDado2(),
                    manejadorJuego.getJuego3Dados().getValorDado3()
            );
            if (manejadorJuego.juegoTerminado()) {
                Jugador ganador = manejadorJuego.getGanadorFinal();
                javafx.scene.control.Alert alert = new javafx.scene.control.Alert(
                        javafx.scene.control.Alert.AlertType.INFORMATION
                );
                alert.setTitle("Fin del juego");
                alert.setHeaderText("El ganador es " + ganador.getNombre() +
                        " con " + ganador.getPuntos() + " puntos.");
                alert.showAndWait();
                tablero.getCentroTablero().getBotonLanzar().setDisable(true);
            }
        });
    }
}
