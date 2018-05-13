package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ModifyAuditoriumController {
	private SampleController sampleController = new SampleController();

	@FXML
	private TextField id;
	@FXML
	private TextField liczbaMiejsc;
	@FXML
	private TextField typSali;

	@FXML
	private Button modifyButton;
	@FXML
	private Button removeButton;

	@FXML
	public void modify() throws ClassNotFoundException, SQLException {
		sampleController.modifySale(Integer.parseInt(id.getText()), Integer.parseInt(liczbaMiejsc.getText()),
				typSali.getText());
	}

	@FXML
	public void remove() throws ClassNotFoundException, SQLException {
		sampleController.removeSale(Integer.parseInt(id.getText()));
	}

}
