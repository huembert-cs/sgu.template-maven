package id.ac.sgu.fx;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class AppController implements Initializable {

	@FXML
	private Text demoText;

	@FXML
	private Button demoBtn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		demoText.setText("Application init");

		demoBtn.setText("Update");

	}

}
