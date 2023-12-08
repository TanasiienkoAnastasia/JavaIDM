package org.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.config.AppConfig;
import org.example.models.FileInfo;

import java.io.File;

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
        String path = AppConfig.DOWNLOAD_PATH + File.separator + filename;
        FileInfo file = new FileInfo((index+1), filename, url, status, action, path);
        DownloadThread thread = new DownloadThread(file, this);
        thread.start();
    }

    public void updateUI(FileInfo metaFile) {
        System.out.println(metaFile);
        System.out.println("_________________________");
    }
}
