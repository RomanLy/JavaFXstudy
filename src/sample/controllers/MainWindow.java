package sample.controllers;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class MainWindow {

    public Button button;
    public Label label;
    public TextField input;


    public void button(ActionEvent actionEvent) {
        String text = input.getText();
        label.setText(text);
        System.out.println(text);
    }
}
