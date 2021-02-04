package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class BeastiaryController {
	// application controls
	@FXML
	private SplitPane application;

	@FXML
	private Button createMonBtn, saveBtn, importBtn, testBtn, clrBtn, elemConfirmBtn, typeConfirmBtn, elemPopSubmitBtn,
			typePopSubmitBtn1, createElementBtn, createTypeBtn;

	@FXML
	private TextField userNameInput, userMpInput, userHpInput, userElementInput, userTypeInput, newElementTxtFldPop,
			newtypeTxtFldPop1;

	@FXML
	private TextArea userDescInput, userFlavTextInput;

	@FXML
	private Pane controlPane, userInputControls, newElementPopUp, newTypePopUp;

	@FXML
	private ListView<Monster> bestiaryListView;

	@FXML
	private ListView<Type> crtdTypeListView;

	@FXML
	private ListView<Element> crtdElementListView;

	// create 3 arraylist to hold user created bestiary, sample bestiary, and
	// imported bestiary
	ArrayList<Monster> userBestiary = new ArrayList<Monster>();
	ArrayList<Monster> sampleBestiary = new ArrayList<Monster>();
	ArrayList<Monster> importedBestiary = new ArrayList<Monster>();

	// create 2 arraylist to hold element and type data
	ArrayList<Type> typeList = new ArrayList<Type>();
	ArrayList<Element> elementList = new ArrayList<Element>();

	// action event for UI Buttons
	@FXML
	void createMonster(ActionEvent event) {
		// create instance of the monster class
		Monster userMonster = new Monster();

		// add instance to userBestiary
		userBestiary.add(userMonster);

		// disable additional buttons
		importBtn.setDisable(true);
		testBtn.setDisable(true);

		// disable bestiary controls while enabling monster creation controls
		controlPane.setDisable(true);
		userInputControls.setDisable(false);
		saveBtn.setDisable(false);
	}

	@FXML
	void saveMonster(ActionEvent event) {
		// take user input and apply it to custom instance of the monster class. This
		// instance of
		// of the monster class will then be added to the userBestiary

		// get the last element added to the userBestiary and use the user input
		// to modify the data
		Monster last = userBestiary.get(userBestiary.size() - 1);
		last.setName(userNameInput.getText());
		last.setDescription(userDescInput.getText());
		last.setFlavorText(userFlavTextInput.getText());
		last.setMp(Double.parseDouble(userMpInput.getText()));
		last.setHp(Double.parseDouble(userHpInput.getText()));
		
		//get custom element and type from creation menu and add to monster class
		last.setElement(elementList.get(elementList.size() - 1));
		last.setType(typeList.get(typeList.size() - 1));

		// add monster to  bestiary list view
		bestiaryListView.getItems().add(last);

		// disable controls to revert control back to top menu
		userInputControls.setDisable(true);
		saveBtn.setDisable(true);

	}

	@FXML
	void clrBtn(ActionEvent event) {
		// will delete contents of userBestiary and listview contents
		userBestiary.clear();
		bestiaryListView.getItems().clear();
	}

	@FXML
	void createTypePop(ActionEvent event) {
		// creates an type using the pop up window
		// make pop up visible
		newTypePopUp.setVisible(true);

		// disable unused elements while enabling popup
		controlPane.setDisable(true);
		importBtn.setDisable(true);
		testBtn.setDisable(true);
		createMonBtn.setDisable(true);
		userInputControls.setDisable(true);
		createElementBtn.setDisable(true);

	}

	@FXML
	void createElementPop(ActionEvent event) {
		// creates and element using the pop up window
		// make pop up visible
		newElementPopUp.setVisible(true);

		// disable unused elements while enabling popup
		controlPane.setDisable(true);
		importBtn.setDisable(true);
		testBtn.setDisable(true);
		createMonBtn.setDisable(true);
		userInputControls.setDisable(true);
		createTypeBtn.setDisable(true);
	}

	@FXML
	void submitTypeDataPop(ActionEvent event) {
		// take user input and use to create a new type
		// create type instance
		Type userType = new Type();

		// change "typeOfMonster" to user entered data
		userType.setTypeOfMonster(newtypeTxtFldPop1.getText());

		// store user created type in typelist
		typeList.add(userType);

		// enable user controls
		controlPane.setDisable(false);
		importBtn.setDisable(false);
		testBtn.setDisable(false);
		createMonBtn.setDisable(false);
		createElementBtn.setDisable(false);

		// add the newly created type to the typelist and listview
		Type last1 = typeList.get(typeList.size() - 1);
		crtdTypeListView.getItems().add(last1);

		// clear the textfield
		newtypeTxtFldPop1.clear();

		// disable type popup window
		newTypePopUp.setVisible(false);

	}

	@FXML
	void submitElementDataPop(ActionEvent event) {
		// take user input and use to create a new element
		// create type instance
		Element userElement = new Element();

		// change "elementOfMonster" to user entered data
		userElement.setElementOfMonster(newElementTxtFldPop.getText());

		// store user created type in elementlist
		elementList.add(userElement);

		// enable user controls
		controlPane.setDisable(false);
		importBtn.setDisable(false);
		testBtn.setDisable(false);
		createMonBtn.setDisable(false);
		createElementBtn.setDisable(false);

		// add the newly created element to the elementList and listview
		Element last1 = elementList.get(elementList.size() - 1);
		crtdElementListView.getItems().add(last1);

		// clear the textfield
		newElementTxtFldPop.clear();

		// disable type popup window
		newElementPopUp.setVisible(false);
	}

	@FXML
	void createElementNew(ActionEvent event) {
		// creation of custom element in the new monster menu
		// disable use existing element
		crtdElementListView.setDisable(true);

		// create new instance of the element class
		Element userElement = new Element();

		// take user entered data and add it to element list and element list view
		// change "elementOfMonster" to user entered data
		userElement.setElementOfMonster(userElementInput.getText());

		// store user created type in elementlist
		elementList.add(userElement);

		// add the newly created element to the elementList and listview
		Element last1 = elementList.get(elementList.size() - 1);
		crtdElementListView.getItems().add(last1);

		// clear the textfield
		userElementInput.clear();

		// disable the textfield
		userElementInput.setDisable(true);

	}

	@FXML
	void createTypeNew(ActionEvent event) {
		// creation of custom type in the new monster menu
		// disable use existing element
		crtdTypeListView.setDisable(true);

		// create new instance of the element class
		Type userType = new Type();

		// take user entered data and add it to type list and type list view
		// change "typeOfMonster" to user entered data
		userType.setTypeOfMonster(userTypeInput.getText());

		// store user created type in typelist
		typeList.add(userType);

		// add the newly created type to the typeList and listview
		Type last1 = typeList.get(typeList.size() - 1);
		crtdTypeListView.getItems().add(last1);

		// clear the textfield
		userTypeInput.clear();

		// disable the textfield
		userTypeInput.setDisable(true);

	}

}
