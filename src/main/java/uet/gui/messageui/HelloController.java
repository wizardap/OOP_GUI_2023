package uet.gui.messageui;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label Username;

    @FXML
    private HBox actionButtons;

    @FXML
    private ImageView backIcon;

    @FXML
    private HBox callButtons;

    @FXML
    private TextArea content;

    @FXML
    private ImageView imageIcon;

    @FXML
    private ImageView micIcon;

    @FXML
    private Circle profileCircle;

    @FXML
    private VBox receiveMessage;

    @FXML
    private ImageView sendIcon;

    @FXML
    private VBox sendMessage;

    @FXML
    private Label status;

    @FXML
    private Text statusMessage;

    @FXML
    private ImageView telephoneIcon;

    @FXML
    private ImageView videoCallIcon;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/uet/gui/messageui/img/profilePicture.jpg")));
        profileCircle.setFill(new ImagePattern(image));
    }
}