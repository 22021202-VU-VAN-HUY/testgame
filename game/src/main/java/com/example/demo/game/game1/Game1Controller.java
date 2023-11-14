package com.example.demo.game.game1;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game1Controller {

    private Parent game1;
    private Stage window;

    public Game1Controller() {

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


    @FXML
    private Label questiongame;
    @FXML
    private CheckBox a;
    @FXML
    private CheckBox b;
    @FXML
    private CheckBox c;
    @FXML
    private CheckBox d;
    @FXML
    private Label score;
//    @FXML
//    private Button next_question;

    private int count_question = 1;

    public void innitialize() {
        questiongame = (Label) game1.lookup("#questiongame");
        a = (CheckBox) game1.lookup("#a");
        b = (CheckBox) game1.lookup("#b");
        c = (CheckBox) game1.lookup("#c");
        d = (CheckBox) game1.lookup("#d");
        score = (Label) game1.lookup("#score");
        //next_question = (Button) game1.lookup("#next_question");
    }

    public void Playgame1(MouseEvent mouseEvent) throws Exception {
        try {
            game1 = FXMLLoader.load(getClass().getResource("/game/game1/Playgame1.fxml"));
            Scene playgame1 = new Scene(game1);
            window = (Stage) ((Node) mouseEvent.getSource()).getScene().getWindow();
            window.setScene(playgame1);
            window.setTitle("Game 1");
            readFileQuestion();
            innitialize();
            ShowQuestion(1);
            window.show();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public List<Question> questions = new ArrayList<>();

    // đọc file game
    public void readFileQuestion() {
        String path = "src\\main\\java\\com\\example\\demo\\game\\game1\\game1.txt";
        //String path = "com.example.demo.game1.txt";
        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = bf.readLine()) != null) {
                String q = line;
                String a = bf.readLine();
                String b = bf.readLine();
                String c = bf.readLine();
                String d = bf.readLine();
                String correctAnswer = bf.readLine();
                Question question = new Question(q, a, b, c, d, correctAnswer);
                questions.add(question);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file " + path);
        }
    }

    public void ChooseanswerA(MouseEvent mouseEvent) {
        if (a.isSelected()) {
            b.setSelected(false);
            c.setSelected(false);
            d.setSelected(false);
        }
    }

    public void ChooseanswerB(MouseEvent mouseEvent) {
        if (b.isSelected()) {
            a.setSelected(false);
            c.setSelected(false);
            d.setSelected(false);
        }
    }

    public void ChooseanswerC(MouseEvent mouseEvent) {
        if (c.isSelected()) {
            a.setSelected(false);
            b.setSelected(false);
            d.setSelected(false);
        }
    }

    public void ChooseanswerD(MouseEvent mouseEvent) {
        if (d.isSelected()) {
            a.setSelected(false);
            b.setSelected(false);
            c.setSelected(false);
        }
    }

    // private List<Question> questions = new ArrayList<>();
    @FXML
    public void ShowQuestion(int i) {
        System.out.println("check bug 1");
        Question q = questions.get(i - 1); // bug
        System.out.println("check bug 2");
        System.out.println(q.getQuestion());
        try {
            questiongame.setText(i + ". " + q.getQuestion());
            a.setText("A. " + q.getA());
            b.setText("B. " + q.getB());
            c.setText("C. " + q.getC());
            d.setText("D. " + q.getD());
            score.setText("Score: " + 0);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
    }


    public void Back_question(MouseEvent mouseEvent) throws Exception {
        try {
            if (count_question > 1) {
                ShowQuestion(--count_question);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void Submitanswer(MouseEvent mouseEvent) {
    }

    @FXML
    public void Next_question(MouseEvent mouseEvent) {
        try {
            System.out.println(questiongame.getText());
            count_question = 2;
            //questiongame.setText("hello");
            ShowQuestion(count_question); // bug
        } catch (Exception e) {
            //throw new RuntimeException(e);
            System.out.println("lỗi next_question");
        }
    }
}
