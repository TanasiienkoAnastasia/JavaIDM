package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DownloadManager {

    @FXML
    private TextField urlTextField;

    @FXML
    void downloadButtonClicked(ActionEvent event) {
        String text = this.urlTextField.getText();
        System.out.println("Field text is = " + text);
    }
}
