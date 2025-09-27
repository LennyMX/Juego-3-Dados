package com.example.juegodados;
import javafx.application.Application;
import javafx.stage.Stage;

public class MainJuego3Dados extends Application {

    @Override
    public void start(Stage stage) {
        ControlJuego3Dados control = new ControlJuego3Dados(stage);
    }

    public static void main(String[] args) {
        launch();
    }
}
