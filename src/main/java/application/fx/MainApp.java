package application.fx;

import application.requests.RequestsHandler;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Control Panel");

        StackPane root = new StackPane();

        VBox content = new VBox();

        content.setAlignment(Pos.CENTER);
        content.setSpacing(10);
        LightStatus.init(content);

        Button doorbellButton = new Button();
        doorbellButton.setText("toggle doorbell");
        content.getChildren().add(doorbellButton);

        root.getChildren().add(content);

        primaryStage.setScene(new Scene(root, 150, 200));
        primaryStage.show();

        try {
            RequestsHandler.POST("http://postman-echo.com/post", "{\"message\"=\"TEST\"}", "application/json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
