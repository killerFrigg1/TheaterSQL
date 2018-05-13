package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ModifySeansController {
	private SampleController sampleController = new SampleController();

	@FXML
	private TextField id;
	@FXML
	private TextField idFilmu;
	@FXML
	private TextField numerSali;
	@FXML
	private TextField dataSeansu;

	@FXML
	private Button modifyButton;
	@FXML
	private Button removeButton;

	@FXML
	public void modify() throws NumberFormatException, ClassNotFoundException, SQLException {
		sampleController.modifySeans(Integer.parseInt(id.getText()), Integer.parseInt(idFilmu.getText()),
				Integer.parseInt(numerSali.getText()), dataSeansu.getText());
	}

	@FXML
	public void remove() throws ClassNotFoundException, SQLException {
		sampleController.removeSeans(Integer.parseInt(id.getText()));
	}

}
