package application;

import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ModifyFilmController {
	private SampleController sampleController = new SampleController();

	@FXML
	private TextField id;
	@FXML
	private TextField nazwa;
	@FXML
	private TextField opis;
	@FXML
	private TextField czasTrwania;
	@FXML
	private TextField limitWiekowy;

	@FXML
	private Button modifyButton;
	@FXML
	private Button removeButton;

	@FXML
	public void modify() throws ClassNotFoundException, SQLException {
		sampleController.modifyFilm(Integer.parseInt(id.getText()), nazwa.getText(), opis.getText(),
				czasTrwania.getText(), limitWiekowy.getText());
	}

	@FXML
	public void remove() throws ClassNotFoundException, SQLException {
		sampleController.removeFilm(Integer.parseInt(id.getText()));
	}

}
