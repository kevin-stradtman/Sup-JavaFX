package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/sample.fxml"));
        /*Group root = new Group();
        Text txt = new Text("Sup?");
        txt.setFont(new Font("Papyrus", 80));
        Label label = new Label("Name:");
        GridPane gridPane = new GridPane();
        TextField textField = new TextField();
        Button btn = new Button();
        gridPane.add(label, 0, 0);
        gridPane.add(textField, 1, 0);
        gridPane.add(btn, 1, 1);
        gridPane.setHgap(20);
        txt.setY(50);
        btn.setText("Say Sup!");
        btn.setOnAction(evt -> System.out.printf("Sup %s!%n", textField.getText()));
        VBox box = new VBox();
        box.getChildren().addAll(txt, gridPane);
        root.getChildren().add(box);*/
        primaryStage.setTitle("Sup");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
