package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    Stage stage;

    void initialize(Stage stage) {
        this.stage = stage;
    }

    @FXML
    private void switchToPaneA(ActionEvent event) {
        // Button was clicked, do something…
        System.out.println("Click!");
        switchToPane("paneA");
    }

    @FXML
    private void switchToPaneB(ActionEvent event) {
        // Button was clicked, do something…
        System.out.println("Click!");
        switchToPane("paneB");
    }

    private void switchToPane(String sPane) {
        Parent pane = null;

        try {
            pane = FXMLLoader.load(getClass().getResource(sPane + ".fxml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene( pane );
        stage.setScene(scene);
        stage.setTitle( "Calculator" );
        stage.show();
    }

}
