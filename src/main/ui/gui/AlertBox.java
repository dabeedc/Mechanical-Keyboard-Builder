package ui.gui;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

// Represents an alert box that alerts the user
public class AlertBox extends DialogBox {

    // EFFECTS: Displays the alert box to user
    @Override
    public void displayDialog(String title, String message, int width) {
        Stage window = new Stage();

        //This blocks the events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(width);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close this window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(25);
        layout.getChildren().addAll(label, closeButton);
        layout.setPadding(new Insets(25));
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }





}
