/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result.set.gui;

//Bishoy

import javafx.scene.layout.AnchorPane;



//Sara
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
/**
 *
 * @author Bishoy
 */
public class ViewData extends AnchorPane {

    //Bishoy

    //Sara
    protected final TextField actorIdTF;
    protected final TextField lastUpdateTF;
    protected final TextField lastNameIdTF;
    protected final TextField firstNameTF;
    protected final Label label;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Button updateButton;
    protected final Button deleteButton;
    protected final Button firstButton;
    protected final Button lastButton;
    protected final Button nextButton;
    protected final Button previousButton;
    protected final Button newButton;

    protected boolean newActor = false;
    protected boolean hasNext = false;
    protected boolean hasPrevious = false;

    public ViewData() {
        //Bishoy

        //Sara
        actorIdTF = new TextField();
        lastUpdateTF = new TextField();
        lastNameIdTF = new TextField();
        firstNameTF = new TextField();
        label = new Label();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        updateButton = new Button();
        deleteButton = new Button();
        firstButton = new Button();
        lastButton = new Button();
        nextButton = new Button();
        previousButton = new Button();
        newButton = new Button();

        setId("AnchorPane");
        setPrefHeight(400.0);
        setPrefWidth(600.0);

        actorIdTF.setLayoutX(151.0);
        actorIdTF.setLayoutY(30.0);

        lastUpdateTF.setLayoutX(151.0);
        lastUpdateTF.setLayoutY(145.0);

        lastNameIdTF.setLayoutX(151.0);
        lastNameIdTF.setLayoutY(102.0);

        firstNameTF.setLayoutX(151.0);
        firstNameTF.setLayoutY(64.0);

        label.setLayoutX(49.0);
        label.setLayoutY(34.0);
        label.setText("Actor ID");

        label0.setLayoutX(49.0);
        label0.setLayoutY(68.0);
        label0.setText("First Name");

        label1.setLayoutX(49.0);
        label1.setLayoutY(106.0);
        label1.setText("Last Name");

        label2.setLayoutX(49.0);
        label2.setLayoutY(149.0);
        label2.setText("Last Update");

        updateButton.setLayoutX(133.0);
        updateButton.setLayoutY(359.0);
        updateButton.setMnemonicParsing(false);
        updateButton.setText("Update");

        deleteButton.setLayoutX(212.0);
        deleteButton.setLayoutY(359.0);
        deleteButton.setMnemonicParsing(false);
        deleteButton.setText("Delete");

        firstButton.setLayoutX(291.0);
        firstButton.setLayoutY(359.0);
        firstButton.setMnemonicParsing(false);
        firstButton.setText("First");

        lastButton.setLayoutX(370.0);
        lastButton.setLayoutY(359.0);
        lastButton.setMnemonicParsing(false);
        lastButton.setText("Last");

        nextButton.setLayoutX(449.0);
        nextButton.setLayoutY(359.0);
        nextButton.setMnemonicParsing(false);
        nextButton.setText("Next");

        previousButton.setLayoutX(526.0);
        previousButton.setLayoutY(359.0);
        previousButton.setMnemonicParsing(false);
        previousButton.setText("Previous");

        newButton.setLayoutX(52.0);
        newButton.setLayoutY(359.0);
        newButton.setMnemonicParsing(false);
        newButton.setText("New");

        getChildren().add(actorIdTF);
        getChildren().add(lastUpdateTF);
        getChildren().add(lastNameIdTF);
        getChildren().add(firstNameTF);
        getChildren().add(label);
        getChildren().add(label0);
        getChildren().add(label1);
        getChildren().add(label2);
        getChildren().add(updateButton);
        getChildren().add(deleteButton);
        getChildren().add(firstButton);
        getChildren().add(lastButton);
        getChildren().add(nextButton);
        getChildren().add(previousButton);
        getChildren().add(newButton);
        
        DataSourceConnection dataSource = new DataSourceConnection();

        try {
            dataSource.resultSet.next();
            actorIdTF.setText(dataSource.resultSet.getString(1));
            firstNameTF.setText(dataSource.resultSet.getString(2));
            lastNameIdTF.setText(dataSource.resultSet.getString(3));
            lastUpdateTF.setText(dataSource.resultSet.getString(4));
        } catch (SQLException ex) {
            Logger.getLogger(ViewData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Bishoy
        firstButton.setOnAction((event) -> {
            try {
                dataSource.resultSet.first();
                actorIdTF.setText(dataSource.resultSet.getString(1));
                firstNameTF.setText(dataSource.resultSet.getString(2));
                lastNameIdTF.setText(dataSource.resultSet.getString(3));
                lastUpdateTF.setText(dataSource.resultSet.getString(4));
            } catch (SQLException ex) {
                Logger.getLogger(ViewData.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        lastButton.setOnAction((event) -> {
            try {
                dataSource.resultSet.last();
                actorIdTF.setText(dataSource.resultSet.getString(1));
                firstNameTF.setText(dataSource.resultSet.getString(2));
                lastNameIdTF.setText(dataSource.resultSet.getString(3));
                lastUpdateTF.setText(dataSource.resultSet.getString(4));
            } catch (SQLException ex) {
                Logger.getLogger(ViewData.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        //Sara
        
    }

}
