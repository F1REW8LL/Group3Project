package application;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListCell;

/* Key:
 *     Stage - Window
 *     Scene - Page
 *     Label - Text
 *     HBox - Layout where nodes are add horizontally in a row
 *     VBox - Layout where nodes are add vertically in a stack
 *     BorderPane - Layout with one center node and four surrounding nodes
 *     Insets -> (top, right, bottom, left)
 */

public class Main extends Application {
  
  public static void main(String[] args) {
    launch(args);
  }
  
  ObservableList<Player> players = FXCollections.observableArrayList();
  public ObservableList<Player> getPlayers() { // Gets all the players
    players.addAll(new Player("Player 1", "Team 1"),
	               new Player("Player 2", "Team 2"),
	               new Player("Player 3", "Team 3"),
	               new Player("Player 4", "Team 4"),
	               new Player("Player 5", "Team 5"));
    return players;
  }
  
  ObservableList<Player> pitchers = FXCollections.observableArrayList();
  public ObservableList<Player> getPitchers() { // Gets the new team
    players.addAll(new Player("Pitcher 1", "Team 1"),
	               new Player("Pitcher 2", "Team 2"),
	               new Player("Pitcher 3", "Team 3"),
	               new Player("Pitcher 4", "Team 4"),
	               new Player("Pitcher 5", "Team 5"));
    return pitchers;
  }
  // Function here
  
  @Override
  public void start(Stage stage) throws Exception {
    // Select Players Screen - scene1

    // Player List
    Text playerListText = new Text("Player List"); // Make text
    Text playerListColumns = new Text("Player      Team");
    ListView playerList = new ListView(); // Make a list
    ListView pitcherList = new ListView();
    VBox column1 = new VBox(); // Make column 1 of scene1
    column1.getChildren().addAll(playerListText, playerListColumns, playerList); // Add label and table to column 1
    
    // Drop Down Menu
    ChoiceBox<String> positionMenu = new ChoiceBox<>(); // Make a drop down menu
    ObservableList<String> positionNames = positionMenu.getItems(); // Make observable list
    positionNames.addAll("Catcher", "Pitcher", "First Base", "Second Base", "Third Base",
               "Shortstop", "Left Fielder", "Right Fielder", "Center Fielder");
    String test[] = new String[] {
        "Catchers", "Pitchers", "First Base", "Second Base", "Third Base",
        "Shortstop", "Left Fielder", "Right Fielder", "Center Fielder"};
    Text testText = new Text("TEST TEXT");    
    positionMenu.getSelectionModel().selectedIndexProperty().addListener( // Add action to the choice box
        (ObservableValue<? extends Number> ov, Number old_val, Number new_val) -> {
         testText.setText(test[new_val.intValue()]); });    
    
    // Buttons
//    positionMenu.getItems().addAll("Position 1", "Position 2", "Position 3", "Position 4", // Add options
//                     "Position 5", "Position 6", "Position 7", "Position 8");
    positionMenu.setValue("Position Menu"); // Set default text for drop down menu
    Button addButton = new Button("Add Player"); // Make buttons
    Button removeButton = new Button("Remove Player");
    Button finishButton = new Button("Finish Team");
    
    VBox column2 = new VBox(); // Make column 2 of scene1
    column2.getChildren().addAll(positionMenu, addButton, removeButton, finishButton); // Add buttons to column 2
    column2.setSpacing(30);
    column2.setMargin(addButton, new Insets(40, 0, 0, 0)); // Set margins
    column2.setMargin(removeButton, new Insets(0, 0, 40, 0));    
    
    playerList.getItems().addAll(getPlayers());
    pitcherList.getItems().addAll(getPitchers());
    
    // Team List
    Text teamListText = new Text("Team List"); 
    Text teamListColumns = new Text("Player      Team");
    ListView teamList = new ListView();
    VBox column3 = new VBox(); // Make column 3 of scene1
    column3.getChildren().addAll(teamListText, teamList); // Add label and list to column 3
    
    // Page #1 Layout
    HBox layout1 = new HBox(); // Make an HBox layout
    layout1.getChildren().addAll(column1, column2, column3); // Add columns to the layout
    layout1.setSpacing(30); // Adds 30 pixel space between nodes
    layout1.setPadding(new Insets(50)); // Adds 50 pixel gap on all sides
    Scene scene1 = new Scene(layout1, 1000, 700); // Make scene and add the layout to it
      
    // Score Screen - scene2
    // Pitcher Column
    Text pitcherStatsText = new Text("Pitcher Statistics");
    Text pitcherStatsColumns = new Text("Player      Score");
    ListView pitcherStats = new ListView();
    VBox pitcherColumn = new VBox(); // Left side of scene2
    pitcherColumn.getChildren().addAll(pitcherStatsText, pitcherStatsColumns, pitcherStats);
    
    // Batter Column
    Text batterStatsText = new Text("Batter Statistics");
    Text batterStatsColumns = new Text("Player      Score");
    ListView batterStats = new ListView();
    VBox batterColumn = new VBox();
    batterColumn.getChildren().addAll(batterStatsText, batterStatsColumns, batterStats);
    
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
    
    // Set cell factory for each list
    playerList.setCellFactory(param -> new ListCell<Player>() {
        @Override
        protected void updateItem(Player item, boolean empty) {
            super.updateItem(item, empty);

            if (empty || item == null || item.getName() == null) {
                setText(null);
            } else {
                setText(item.getName());
            }
        }
    });
    
    pitcherList.setCellFactory(param -> new ListCell<Player>() {
        @Override
        protected void updateItem(Player item, boolean empty) {
            super.updateItem(item, empty);

	if (empty || item == null || item.getName() == null) {
	                setText(null);
	            } else {
	                setText(item.getName());
	            }
	        }
	    });
    
    teamList.setCellFactory(param -> new ListCell<Player>() {
        @Override
        protected void updateItem(Player item, boolean empty) {
            super.updateItem(item, empty);

            if (empty || item == null || item.getTeam() == null) {
                setText(null);
            } else {
                setText(item.getTeam());
            }
        }
    });
    
    pitcherStats.setCellFactory(param -> new ListCell<Player>() {
        @Override
        protected void updateItem(Player item, boolean empty) {
            super.updateItem(item, empty);

	if (empty || item == null || item.getName() == null) {
	                setText(null);
	            } else {
	                setText(item.getName());
	            }
	        }
	    });
    
    batterStats.setCellFactory(param -> new ListCell<Player>() {
        @Override
        protected void updateItem(Player item, boolean empty) {
            super.updateItem(item, empty);

            if (empty || item == null || item.getName() == null) {
                setText(null);
            } else {
                setText(item.getName());
            }
        }
    });
    
    // Set fonts
    playerListText.setFont(Font.font("Century Gothic", 30));
    playerListColumns.setFont(Font.font("Century Gothic", 20));
    teamListText.setFont(Font.font("Century Gothic", 30));
    teamListColumns.setFont(Font.font("Century Gothic", 20));
    pitcherStatsText.setFont(Font.font("Century Gothic", 30));
    pitcherStatsColumns.setFont(Font.font("Century Gothic", 20));
    batterStatsText.setFont(Font.font("Century Gothic", 30));
    batterStatsColumns.setFont(Font.font("C  entury Gothic", 20));
    pointsText.setFont(Font.font("Century Gothic", 20));
    
    // Set margins
    column1.setMargin(playerListText, new Insets(10, 0, 10, 0)); // Set margins for column 1
    column1.setMargin(playerListColumns, new Insets(10, 0, 10, 0));
    column3.setMargin(teamListText, new Insets(10, 0, 10, 0));
    column3.setMargin(teamListColumns, new Insets(10, 0, 10, 0));
    pitcherColumn.setMargin(pitcherStatsText, new Insets(10, 0, 10, 0));
    pitcherColumn.setMargin(pitcherStatsColumns, new Insets(10, 0, 10, 0));
    batterColumn.setMargin(batterStatsText, new Insets(10, 0, 10, 0));
    batterColumn.setMargin(batterStatsColumns, new Insets(10, 0, 10, 0));
    columns.setMargin(playerListText, new Insets(0, 20, 0, 20));
    
    stage.setTitle("Fantasy Baseball Simulator"); // Set the title of the window
    stage.setResizable(false); // Make it so user cannot resize window
    stage.setScene(scene1); // Add scene to stage
    stage.show();
  }
}