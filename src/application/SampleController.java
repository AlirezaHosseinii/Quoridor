package application;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.io.IOException;

import javafx.event.ActionEvent;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SampleController {
	@FXML
	private Button NewGameButton;
	@FXML
	private Button TournamnetButton;
	@FXML
	private Button LoadButton;
	@FXML
	private Label WelcomeTitle;
	@FXML
	private Button ExitButton;

	// Event Listener on Button[#NewGameButton].onAction
	@FXML
	public void StartGame(ActionEvent event) throws IOException {
		Parent rootGame = FXMLLoader.load(getClass().getClassLoader().getResource("Game.fxml"));
		//A stage obj for a new window
		Stage stageGame = new Stage();
		Scene sceneGame = new Scene(rootGame);
		stageGame.setTitle("Let's play!");
		stageGame.setScene(sceneGame);
		stageGame.show();
	}
	// Event Listener on Button[#TournamnetButton].onAction
	@FXML
	public void StartTournamnet(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#LoadButton].onAction
	@FXML
	public void OpenLoadPage(ActionEvent event) {
		// TODO Autogenerated
	}
	// Event Listener on Button[#ExitButton].onAction
	@FXML
	public void Exit(ActionEvent event) {
		// TODO Autogenerated
	}
}
