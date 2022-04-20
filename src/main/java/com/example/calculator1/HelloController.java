package com.example.calculator1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {

        @FXML
        private TextField SecondN;

        @FXML
        private Button calculate;


        @FXML
        private TextField firstN;

        @FXML
        private TextField result;


        @FXML
    private void Calc(){
            double first= Double.parseDouble(firstN.getText());
            double second= Float.parseFloat(SecondN.getText());
            double answer= first+second;
            result.setText(""+answer);


        }


    }
