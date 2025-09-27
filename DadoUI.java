package com.example.juegodados;

import javafx.scene.control.Label;
import javafx.scene.text.Font;

public class DadoUI extends Label {

    public DadoUI(){
        Font font = new Font("Arial", 80);
        setFont(font);
        setText("⚀"); 
    }

    public void cambiarEmoji(int valor)
        String emoji = new String(Character.toChars(0x267F + valor));
        setText(emoji);
    }
}
