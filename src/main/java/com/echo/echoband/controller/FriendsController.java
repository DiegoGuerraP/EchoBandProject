package com.echo.echoband.controller;

import com.echo.echoband.Friends;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class FriendsController {

    @FXML private MFXButton entrenar;
    @FXML private MFXButton estadisticas;
    @FXML private MFXButton amigos;
    @FXML private MFXButton perfil;
    @FXML private MFXButton liga;
    @FXML private MFXButton config;
    @FXML private MFXButton cerrar;

    public void irAConfig() throws IOException {
        Stage stage = (Stage) config.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "configurationView.fxml");
        stage.setTitle("Configuración");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/configurationStyle.css").toExternalForm());
    }

    public void irAAmigos() throws IOException {
        Stage stage = (Stage) amigos.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "friendsView.fxml");
        stage.setTitle("Amigos");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/friendsStyle.css").toExternalForm());
    }

    public void irALiga() throws IOException {
        Stage stage = (Stage) liga.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "leagueView.fxml");
        stage.setTitle("Liga");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/leagueStyle.css").toExternalForm());
    }

    public void irAEntrenar() throws IOException {
        Stage stage = (Stage) entrenar.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "trainingView.fxml");
        stage.setTitle("Entrenamiento");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/trainingStyle.css").toExternalForm());
    }

    public void irAEstadisticas() throws IOException {
        Stage stage = (Stage) estadisticas.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "statisticsView.fxml");
        stage.setTitle("Estadísticas");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/statisticsStyle.css").toExternalForm());
    }

    public void irAPerfil() throws IOException {
        Stage stage = (Stage) perfil.getScene().getWindow();
        Friends app = new Friends();
        app.cambiarEscena(stage, "userProfileView.fxml");
        stage.setTitle("Perfil de Usuario");
        Scene scene = stage.getScene();
        scene.getStylesheets().clear();
        scene.getStylesheets().add(Friends.class.getResource("/com/echo/echoband/userProfileStyle.css").toExternalForm());
    }

    public void irALogOut() throws IOException {
        Platform.exit();
    }
}
