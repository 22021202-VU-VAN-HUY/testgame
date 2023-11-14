module com.example.demo.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    //requires org.controlsfx.controls;
    //requires com.dlsc.formsfx;
    //requires net.synedra.validatorfx;
    //requires org.kordamp.ikonli.javafx;
    //requires org.kordamp.bootstrapfx.core;
    //requires eu.hansolo.tilesfx;
    //requires com.almasb.fxgl.all;

    opens com.example.demo.game to javafx.fxml;
    exports com.example.demo.game;
    exports com.example.demo.game.game1;
    opens com.example.demo.game.game1 to javafx.fxml;
    exports com.example.demo.game.game2;
    opens com.example.demo.game.game2 to javafx.fxml;
}