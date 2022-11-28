package application;
	
import java.io.FileInputStream;
import java.io.InputStream;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;

/* Key:
 * 		Stage - Window
 * 		Scene - Page
 * 		Label - Text
 * 		HBox - Layout where nodes are add horizontally in a row
 * 		VBox - Layout where nodes are add vertically in a stack
 * 		BorderPane - Layout with one center node and four surrounding nodes
 * 		Insets -> (top, right, bottom, left)
 */

public class Main extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	ObservableList<PlayerTest> players = FXCollections.observableArrayList();
	// Gets all the players
	public ObservableList<PlayerTest> getPlayers() {
		players.addAll(new PlayerTest("Lewis Brindley", "Swordsmen"),
					   new PlayerTest("Simon Lane", "Miners"),
					   new PlayerTest("Duncan Jones", "Scientists"),
					   new PlayerTest("Hannah Rutherford", "Archers"),
					   new PlayerTest("Martyn Littlewood", "Saplings"));
		return players;
	}
	
	ObservableList<PlayerTest> newTeam = FXCollections.observableArrayList();
	// Gets the new team
	// Function here
	
	@Override
	public void start(Stage stage) throws Exception {		
		// Select Players Screen - scene1
		// Player List
		Text playerListText = new Text("Player List"); // Make text
		Text playerListColumns = new Text("Player			Team");
		ListView playerList = new ListView(); // Make a list
		VBox column1 = new VBox(); // Make column 1 of scene1
		column1.getChildren().addAll(playerListText, playerListColumns, playerList); // Add label and table to column 1
		
		// Set cell factory for playerList
		playerList.setCellFactory(param -> new ListCell<PlayerTest>() {
		    @Override
		    protected void updateItem(PlayerTest item, boolean empty) {
		        super.updateItem(item, empty);

		        if (empty || item == null || item.getName() == null) {
		            setText(null);
		        } else {
		            setText(item.getName());
		        }
		    }
		});
		
		// Team List
		Text teamListText = new Text("Team List"); 
		Text teamListColumns = new Text("Player			Team");
		ListView teamList = new ListView();
		VBox column3 = new VBox(); // Make column 3 of scene1
		column3.getChildren().addAll(teamListText, teamList); // Add label and list to column 3
		
		// Set cell factory for teamList
		teamList.setCellFactory(param -> new ListCell<PlayerTest>() {
		    @Override
		    protected void updateItem(PlayerTest item, boolean empty) {
		        super.updateItem(item, empty);

		        if (empty || item == null || item.getTeam() == null) {
		            setText(null);
		        } else {
		            setText(item.getTeam());
		        }
		    }
		});

		playerList.getItems().addAll(getPlayers());
		
		// Buttons
		ChoiceBox<String> positionMenu = new ChoiceBox<>(); // Make a drop down menu
		positionMenu.getItems().addAll("Position 1", "Position 2", "Position 3", "Position 4", // Add options
									   "Position 5", "Position 6", "Position 7", "Position 8");
		positionMenu.setValue("Position Menu"); // Set default text for drop down menu
		Button addButton = new Button("Add Player"); // Make buttons
		Button removeButton = new Button("Remove Player");
		Button finishButton = new Button("Finish Team");
		
		VBox column2 = new VBox(); // Make column 2 of scene1
		column2.getChildren().addAll(positionMenu, addButton, removeButton, finishButton); // Add buttons to column 2
		column2.setSpacing(30);
		column2.setMargin(addButton, new Insets(40, 0, 0, 0)); // Set margins
		column2.setMargin(removeButton, new Insets(0, 0, 40, 0));
		
		// Page #1 Layout
		HBox layout1 = new HBox(); // Make an HBox layout
		layout1.getChildren().addAll(column1, column2, column3); // Add columns to the layout
		layout1.setSpacing(30); // Adds 30 pixel space between nodes
		layout1.setPadding(new Insets(50)); // Adds 50 pixel gap on all sides
		Scene scene1 = new Scene(layout1, 1000, 700); // Make scene and add the layout to it
			
		// Score Screen - scene2
		// Pitcher Column
		Text pitcherListText = new Text("Pitcher Statistics");
		Text pitcherListColumns = new Text("Player			Score");
		ListView pitcherList = new ListView();
		VBox pitcherColumn = new VBox(); // Left side of scene2
		pitcherColumn.getChildren().addAll(pitcherListText, pitcherListColumns, pitcherList);
		
		// Set cell factory for playerList
		playerList.setCellFactory(param -> new ListCell<PlayerTest>() {
		    @Override
		    protected void updateItem(PlayerTest item, boolean empty) {
		        super.updateItem(item, empty);

		        if (empty || item == null || item.getName() == null) {
		            setText(null);
		        } else {
		            setText(item.getName());
		        }
		    }
		});
		
		// Batter Column
		Text batterListText = new Text("Batter Statistics");
		Text batterListColumns = new Text("Player			Score");
		ListView batterList = new ListView();
		VBox batterColumn = new VBox();
		batterColumn.getChildren().addAll(batterListText, batterListColumns, batterList);
		
		// Set cell factory for playerList
		playerList.setCellFactory(param -> new ListCell<PlayerTest>() {
		    @Override
		    protected void updateItem(PlayerTest item, boolean empty) {
		        super.updateItem(item, empty);

		        if (empty || item == null || item.getName() == null) {
		            setText(null);
		        } else {
		            setText(item.getName());
		        }
		    }
		});
		
		// Bottom: Buttons and Points
		Button buttonEdit = new Button("Edit"); // Make buttons
		Button buttonReset = new Button("Reset");
		String points = "Points: "; // + getPoints();
		Text pointsText = new Text(points);
		
		// Page #2 Layout
		VBox layout2 = new VBox(); // Contains columns and bottomPane
		HBox columns = new HBox();
		HBox bottomPane = new HBox(); // Contains
		bottomPane.getChildren().addAll(buttonEdit, pointsText, buttonReset); // Add buttons to bottom node
		bottomPane.setSpacing(50);
		
		columns.getChildren().addAll(batterColumn, pitcherColumn); // Add tables and labels to the columns HBox
		layout2.getChildren().addAll(columns, bottomPane); // Add columns to the layout2 VBox
		
		Scene scene2 = new Scene(layout2, 1000, 700); // Make second scene
		finishButton.setOnAction(e -> stage.setScene(scene2)); // Make "Finish Team" button go to Score Screen (scene2)
		buttonEdit.setOnAction(e -> stage.setScene(scene1)); // Make "Edit" button go to Select Players Screen (scene1)
		buttonReset.setOnAction(e -> stage.setScene(scene1)); // Make "Reset" button go to Select Players Screen (scene1)
		
		String css = this.getClass().getResource("application.css").toExternalForm();
		scene1.getStylesheets().add(css); // Add CSS
		scene2.getStylesheets().add(css);
		BackgroundFill backgroundFill = new BackgroundFill(Color.POWDERBLUE, CornerRadii.EMPTY, Insets.EMPTY); // Make background fill
		Background background = new Background(backgroundFill); // Make background with background fill
		layout1.setBackground(background); // Add background to layout1
		layout2.setBackground(background);
		
		// Set fonts
		playerListText.setFont(Font.font("Century Gothic", 30));
		playerListColumns.setFont(Font.font("Century Gothic", 20));
		teamListText.setFont(Font.font("Century Gothic", 30));
		teamListColumns.setFont(Font.font("Century Gothic", 20));
		pitcherListText.setFont(Font.font("Century Gothic", 30));
		pitcherListColumns.setFont(Font.font("Century Gothic", 20));
		batterListText.setFont(Font.font("Century Gothic", 30));
		batterListColumns.setFont(Font.font("Century Gothic", 20));
		pointsText.setFont(Font.font("Century Gothic", 20));
		
		// Set margins
		column1.setMargin(playerListText, new Insets(10, 0, 10, 0)); // Set margins for column 1
		column1.setMargin(playerListColumns, new Insets(10, 0, 10, 0));
		column3.setMargin(teamListText, new Insets(10, 0, 10, 0));
		column3.setMargin(teamListColumns, new Insets(10, 0, 10, 0));
		pitcherColumn.setMargin(pitcherListText, new Insets(10, 0, 10, 0));
		pitcherColumn.setMargin(pitcherListColumns, new Insets(10, 0, 10, 0));
		batterColumn.setMargin(batterListText, new Insets(10, 0, 10, 0));
		batterColumn.setMargin(batterListColumns, new Insets(10, 0, 10, 0));
		columns.setMargin(playerListText, new Insets(0, 20, 0, 20));
		
		stage.setTitle("Fantasy Baseball Simulator"); // Set the title of the window
		stage.setResizable(false); // Make it so user cannot resize window
		stage.setScene(scene1); // Add scene to stage
		stage.show();
	}
}













