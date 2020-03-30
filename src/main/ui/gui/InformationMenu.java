package ui.gui;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextBuilder;
import javafx.stage.Stage;
import ui.Information;

// Represents an alert box that alerts the user
public class InformationMenu {
    Button caseInfo = new Button("         Case        ");
    Button keycapsInfo = new Button("      Keycaps      ");
    Button plateInfo = new Button("         Plate         ");
    Button pcbInfo = new Button("          PCB          ");
    Button switchesInfo = new Button("       Switches       ");

    Scene infoScene;

    TextField textField = new TextField();

    String text = "Please click on what you would like to learn more about";
    Text infoHeader = TextBuilder.create().text(text).build();

    // EFFECTS: Displays the information menu to user
    public void displayInformationMenu() {
        Stage window = new Stage();

        window.setTitle("Information");
        window.setMinWidth(800);

        caseInfo.setOnAction(event -> infoHeader.setText(Information.CASE_INFO));

        keycapsInfo.setOnAction(event -> infoHeader.setText(Information.KEYCAPS_INFO));
        plateInfo.setOnAction(event -> infoHeader.setText(Information.PLATE_INFO));
        pcbInfo.setOnAction(event -> infoHeader.setText(Information.PRINTEDCIRCUITBOARD_INFO));
        switchesInfo.setOnAction(event -> infoHeader.setText(Information.SWITCHES_INFO));

        Button closeButton = new Button("Close this window");
        closeButton.setOnAction(e -> window.close());

        VBox infoButtonsLayout = new VBox(30);

        infoButtonsLayout.setPadding(new Insets(0, -20, 0, 25));
        infoButtonsLayout.getChildren().addAll(caseInfo, keycapsInfo, plateInfo, pcbInfo, switchesInfo, closeButton);
        infoButtonsLayout.setAlignment(Pos.CENTER);

        BorderPane infoMenuLayout = new BorderPane();
        infoMenuLayout.setCenter(infoHeader);
        infoMenuLayout.setLeft(infoButtonsLayout);

        infoScene = new Scene(infoMenuLayout, 600, 350);
        window.setScene(infoScene);
        window.showAndWait();
    }
}

