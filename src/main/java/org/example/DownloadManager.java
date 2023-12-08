package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.models.FileInfo;

public class DownloadManager {

    @FXML
    private TextField urlTextField;

    public int index = 0;
    @FXML
    void downloadButtonClicked(ActionEvent event) {

        String url = urlTextField.getText().trim();
        String filename = url.substring(url.lastIndexOf("/")+1);
        String status = "STARTING";
        String action = "OPEN";
        FileInfo file = new FileInfo((index+1), filename, url, status, action);
    }
}
