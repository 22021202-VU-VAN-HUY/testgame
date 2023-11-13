package com.example.demo.game.game1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Game1Controller {

    private Parent game1;
    private Stage window;

    public Game1Controller(){

    }
    public void BacktoChoosegame(MouseEvent mouseEvent) {
        try {
            game1 = FXMLLoader.load(getClass().getResource("/game/Choosegame.fxml"));
            Scene playgame1 = new Scene(game1);
            window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(playgame1);
            window.setTitle("Game !!!");

            window.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Playgame1(MouseEvent mouseEvent) throws Exception {
        try {
            game1 = FXMLLoader.load(getClass().getResource("/game/game1/Playgame1.fxml"));
            Scene playgame1 = new Scene(game1);
            window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(playgame1);
            window.setTitle("Game 1");

            window.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Howtoplaygame1(MouseEvent mouseEvent) {
        try {
            game1 = FXMLLoader.load(getClass().getResource("/game/game1/Howtoplaygame1.fxml"));
            Scene playgame1 = new Scene(game1);
            window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(playgame1);
            window.setTitle("Game 1");

            window.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public void Settinggame1(MouseEvent mouseEvent) {
        try {
            game1 = FXMLLoader.load(getClass().getResource("/game/game1/Settinggame1.fxml"));
            Scene playgame1 = new Scene(game1);
            window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(playgame1);
            window.setTitle("Game 1");

            window.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Backtogame1(MouseEvent mouseEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/game/game1/Game1.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Game 1");

            stage.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("lỗi");
        }
    }
}
