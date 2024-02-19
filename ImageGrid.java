import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ImageGridPane extends Application {

  @Override
  public void start(Stage primaryStage) {
  
    GridPane gridPane = new GridPane();
    gridPane.setHgap(10);
    gridPane.setVgap(10);
    
    String[] imagePaths = {
        "C:/Users/kayla/OneDrive/Desktop/School/Java/14-1 Images.zip/Images/flag2.gif",
        "C:/Users/kayla/OneDrive/Desktop/School/Java/14-1 Images.zip/Images/flag1.gif",
        "C:/Users/kayla/OneDrive/Desktop/School/Java/14-1 Images.zip/Images/flag6.gif",
        "C:/Users/kayla/OneDrive/Desktop/School/Java/14-1 Images.zip/Images/flag7.gif"
    };


  for(

  int i = 0;i<imagePaths.length;i++)
  {
    Image image = new Image("file:" + imagePaths[i]);
    ImageView imageView = new ImageView(image);
    imageView.setFitWidth(200);
    imageView.setFitHeight(200);
    gridPane.add(imageView, i % 2, i / 2);
  }

  Scene scene = new Scene(gridPane, 450, 300);primaryStage.setTitle("Image Grid Pane");primaryStage.setScene(scene);

  primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
