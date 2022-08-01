//importing everything that i need for the code to run
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import java.net.URISyntaxException;

public class MyJavaFX extends Application 
{

    @Override
    public void start(Stage primaryStage) throws Exception 
    {
         // creating media for the auido file
         Media media = new Media(getClass().getResource("audio/theme.mp3.mp3").toExternalForm());
         MediaPlayer mediaP1 = new MediaPlayer(media);
         MediaView mediaView = new MediaView(mediaP1);
         // creating buttons for play and pause
         Button playButton = new Button(">");
         playButton.setOnAction( e -> {
         if(playButton.getText().equals(">"))
         {
            mediaP1.play();
            playButton.setText("||");
         }
         else
         {
            mediaP1.pause();
            playButton.setText(">");
         }
      
         });
         // creating buttonm for rewind 
         Button rewindButton = new Button("<<");
         rewindButton.setOnAction(e -> mediaP1.seek(Duration.ZERO));
         // creating button slider for the volume 
         Slider slVolume = new Slider();
         slVolume.setPrefWidth(150);
         slVolume.setMaxWidth(Region.USE_PREF_SIZE);
         slVolume.setMinWidth(30);
         slVolume.setValue(50);
         mediaP1.volumeProperty().bind(slVolume.valueProperty().divide(100));
         //creating label to name the sldier "volume"
         HBox hboxx = new HBox(10);
         hboxx.setAlignment(Pos.BOTTOM_CENTER);
         hboxx.getChildren().addAll(playButton, rewindButton, new Label ("Volume") , slVolume);
         //creating the title to be above to the buttons 
         Label promptLabel = new Label("Select an Avenger");
         //creating button for Avengers logo
         Button avengers = new Button("Avengers");
         avengers.setOnAction(event -> {
             Action(getClass().getResource("avangers.jpeg").toExternalForm());
         });
         //creating button for Captain America logo
         Button cap = new Button("Captain America");
         cap.setOnAction(event -> {
             Action(getClass().getResource("cap1.jpg").toExternalForm());
         });
         //creating button for Hulk logo
         Button hulk = new Button("Hulk");
         hulk.setOnAction(event -> {
             Action(getClass().getResource("hulk3.jpg").toExternalForm());
         });
         //creating button for Iron Man logo
         Button iron = new Button("Iron Man");
         iron.setOnAction(event -> {
             Action(getClass().getResource("iron.jpg").toExternalForm());
         });
         //creating button for Spider Man logo
         Button spider = new Button("Spider Man");
         spider.setOnAction(event -> {
             Action(getClass().getResource("spider.jpg").toExternalForm());
         });

      
        //Creating an HBox
         HBox hbox = new HBox(10, promptLabel);
         hbox.setAlignment(Pos.CENTER);

         //creating an HBox for each of the button titles
         HBox hbox1 = new HBox(10, avengers);
         hbox1.setAlignment(Pos.CENTER);

         HBox hbox2 = new HBox(10, cap);
         hbox2.setAlignment(Pos.CENTER);
   
         HBox hbox3 = new HBox(10, hulk);
         hbox3.setAlignment(Pos.CENTER);

         HBox hbox4 = new HBox(10, iron);
         hbox4.setAlignment(Pos.CENTER);

         HBox hbox5 = new HBox(10, spider);
         hbox5.setAlignment(Pos.CENTER);
         
        //Creating a VBox with the HBox as the parameters so the button will be labeled correctly
         VBox vbox = new VBox(10, hbox, hbox1, hbox2, hbox3, hbox4,hbox5);
         vbox.setPadding(new Insets(10));
         
         BorderPane pane = new BorderPane();
         pane.setRight(mediaView);
         pane.setBottom(hboxx);
         //creating VBox container so that both the slider and buttons are displayed
         VBox container = new VBox(60, vbox, pane);
         //setting the scene so it will display
         Scene scene1 = new Scene(container, 650, 500);
         primaryStage.setScene(scene1);
         primaryStage.show();
         
    }

    private void Action(String filePath){
        ImageView imageView = new ImageView(new Image(filePath));

        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().add(imageView);

        Stage stage = new Stage();
        stage.setScene(new Scene(vBox));
        stage.show();
    }
   public static void main(String[] args)
   {
      Application.launch(args);
   }  
}