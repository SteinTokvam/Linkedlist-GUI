import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.text.Text;
import javafx.scene.layout.*;
import javafx.scene.control.*;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.geometry.*;

public class GUI extends Application{
  private Lenkeliste ll = new Lenkeliste();

  @Override
  public void start(Stage stage) {//setter opp det grafiske
    BorderPane bp = new BorderPane();
    HBox hb = new HBox();
    TextField text = new TextField();
    text.setPrefWidth(340);

    text.setAlignment(Pos.CENTER_LEFT);
    Button knapp = new Button("Add");
    knapp.setPrefSize(50, 20);
    hb.getChildren().addAll(text, knapp);
    hb.setSpacing(10);
    bp.setTop(hb);

    Pane pane = new Pane();
    Label label = new Label("Alle elementer:");
    TextArea elementer = new TextArea();
    elementer.setEditable(false);
    elementer.setPrefSize(400, 175);
    pane.getChildren().addAll(label, elementer);
    bp.setCenter(pane);

    Scene scene = new Scene(bp, 400, 200);
    stage.setScene(scene);
    stage.show();
    stage.setTitle("LinkedList");

    knapp.setOnAction(//knappelisteners
    new EventHandler<ActionEvent>(){
      @Override
      public void handle(final ActionEvent e){
        if(text.getText() != ""){
          ll.settInnNode(text.getText());
          elementer.setText("Content:\n" + ll.printAlle());
        }
      }
    });
  }
}
