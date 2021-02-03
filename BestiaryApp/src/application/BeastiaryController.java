package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class BeastiaryController {
	// application controls
	@FXML
	private Button createMonBtn, saveBtn, importBtn, testBtn;

	@FXML
	private TextField userNameInput, userMpInput, userHpInput, userElementInput, userTypeInput;

	@FXML
	private TextArea userDescInput, userFlavTextInput;

	@FXML
	private Pane controlPane, userInputControls;
	
	@FXML
    private ListView<Monster> bestiaryListView;

	// create 3 arraylist to hold user created bestiary, sample bestiary, and
	// imported bestiary
	ArrayList<Monster> userBestiary = new ArrayList<Monster>();
	ArrayList<Monster> sampleBestiary = new ArrayList<Monster>();
	ArrayList<Monster> importedBestiary = new ArrayList<Monster>();
	
	
	
	//fill listbox with bestiary data
	

	// action event for UI Buttons
	@FXML
	void createMonster(ActionEvent event) {
		// create instance of the monster class
		Monster userMonster = new Monster();

		// add instance to userBestiary
		userBestiary.add(userMonster);

		// disable additional bestiary import buttons
		importBtn.setDisable(true);
		testBtn.setDisable(true);

		// disable bestiary controls while enabling monster creation controls
		controlPane.setDisable(true);
		userInputControls.setDisable(false);
		saveBtn.setDisable(false);
	}

	@FXML
	void saveMonster(ActionEvent event) {
		//take user input and apply it to custom instance of the monster class. This instance of
		//of the monster class will then be added to the userBestiary
		
		//get the last element added to the userBestiary and use the user input
		//to modify the data
		Monster last = userBestiary.get(userBestiary.size() - 1);
		last.setName(userNameInput.getText());
		last.setDescription(userDescInput.getText());
		last.setFlavorText(userFlavTextInput.getText());
		last.setMp(Double.parseDouble(userMpInput.getText()));
		last.setHp(Double.parseDouble(userHpInput.getText()));
		
		//add element to list view
		bestiaryListView.getItems().add(last);

		//disable controls to revert control back to top menu
		userInputControls.setDisable(true);
		saveBtn.setDisable(true);

	}

}
