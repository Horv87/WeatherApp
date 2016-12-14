package main;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.WeatherModel;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));


        primaryStage.setTitle("Weather");
        primaryStage.setScene(new Scene(root, 400, 400));
        primaryStage.show();

        Controller controller = new Controller();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
