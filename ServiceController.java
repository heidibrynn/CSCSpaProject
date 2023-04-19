package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.time.LocalDate;
import java.io.IOException;
import java.util.Objects;


public class ServiceController {
// instance variables
    private Stage stage;
    private Scene scene;
    private Parent root;

    String name;

    String choice;

    String type;


// setting the fxids of the menu buttons and items
    @FXML
    private MenuButton serviceButton;

    @FXML
    MenuItem maniButton = new MenuItem("Manicure");


    @FXML
    MenuItem pediButton = new MenuItem("Pedicure");

    @FXML
    MenuItem massageButton = new MenuItem("Massage");

    @FXML
    MenuItem facialButton = new MenuItem("Facial");

    @FXML
    MenuItem waxButton = new MenuItem("Waxing");

    @FXML
    private MenuButton typeButton;
    @FXML
    MenuItem tanButton = new MenuItem("Tanning");

    @FXML
    MenuItem type1Button = new MenuItem("type 1");

    @FXML
    MenuItem type2Button = new MenuItem("type 2");

    @FXML
    MenuItem type3Button = new MenuItem("type 3");





    @FXML
    private Label myLabel;


    @FXML
    private DatePicker datePicker;


    @FXML
    private TextField nameTextField;


// this button returns the confirmation of the appointment
    public void submit(ActionEvent event) {
        name = nameTextField.getText();
        LocalDate myDate = datePicker.getValue();
        myLabel.setText(name + " has booked a " + type + " " + serviceButton.getText() + " for " + myDate.toString());

    }
// these methods set the service options
    public void maniClick() {
        choice = "manicure";
    }
    public void tanClick() {
        choice = "tan";
    }
    public void pediClick() {
        choice = "pedicure";
    }
    public void massageClick() {
        choice = "massage";
    }
    public void facialClick() {
        choice = "facial";
    }
    public void waxClick() {
        choice = "wax";
    }

// these 3 methods set the specific type chosen
    public void type1Click() {
        type = type1Button.getText();
        typeButton.setText(type);
    }

    public void type2Click() {
        type = type2Button.getText();
        typeButton.setText(type);
    }

    public void type3Click() {
        type = type3Button.getText();
        typeButton.setText(type);
    }


//this method sets the service selected and the possible types for that service
    public void initialize() {
        maniButton.setOnAction(event -> {
            serviceButton.setText("Manicure");
            type1Button.setText("Regular");
            type2Button.setText("Gel");
            type3Button.setText("Acrylic");
        });
        pediButton.setOnAction(event -> {
            serviceButton.setText("Pedicure");
            type1Button.setText("Regular");
            type2Button.setText("Gel");
            type3Button.setText(" ");
        });
        massageButton.setOnAction(event -> {
            serviceButton.setText("Massage");
            type1Button.setText("Deep Tissue");
            type2Button.setText("Swedish");
            type3Button.setText("Couples");
        });
        facialButton.setOnAction(event -> {
            serviceButton.setText("Facial");
            type1Button.setText("Basic");
            type2Button.setText("Hydrating");
            type3Button.setText("Luxury");
        });
        waxButton.setOnAction(event -> {
            serviceButton.setText("Wax");
            type1Button.setText("Eyebrows");
            type2Button.setText("Legs");
            type3Button.setText("Bikini");
        });
        tanButton.setOnAction(event -> {
            serviceButton.setText("Tan");
            type1Button.setText("Light");
            type2Button.setText("Medium");
            type3Button.setText("Dark");
        });
    }

// this method loads the main page/home page
    public void mainPage (ActionEvent event) throws IOException {
        root = FXMLLoader.load((getClass().getResource("mainPage.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the make an appointment page
    public void makeApptPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load((Objects.requireNonNull(getClass().getResource("serviceSelector.fxml"))));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the manicure information page
    public void getManiPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Manicure.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the pedicure information page
    public void getPediPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Pedicure.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the waxing information page
    public void getWaxPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Waxing.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the massage information page
    public void getMassagePage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Massage.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the tanning information page
    public void getTanPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Tan.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

// this method loads the facial information page
    public void getFacialPage(ActionEvent event) throws IOException {
        root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Facial.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
