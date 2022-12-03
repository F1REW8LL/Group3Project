package application;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
  
  	
	
	//open catcher file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-C (1).xlsx");//file name
        //Iterate fileStream
        FileInputStream fis = new FileInputStream(file);
        //open workbook
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        //open sheet
        XSSFSheet sheet = wb.getSheetAt(0);
        //create row iterator to traverse the sheet
        Iterator<Row> itr = sheet.iterator();
        //declare variable to hold each row and set equal to title row
        Row row = itr.next();

        //loop through the sheet as long as there is another row
        while(itr.hasNext())
        {
            //set row equal to next row
            row = itr.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Catcher", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Catchers
            c.add(temp);
        }

        //open first base file
        File file2 = new File("C:\\Group3Project\\mlb-playe-stats-1B.xlsx");//file name
        //Iterate fileStream
        FileInputStream fis2 = new FileInputStream(file2);
        //open workbook
        XSSFWorkbook wb2 = new XSSFWorkbook(fis2);
        //open sheet
        XSSFSheet sheet2 = wb2.getSheetAt(0);
        //create row iterator to traverse the sheet
        Iterator<Row> itr2 = sheet2.iterator();
        //declare variable to hold each row and set equal to title row
        Row row2 = itr2.next();

        //loop through the sheet as long as there is another row
    	while(itr2.hasNext())
   	{
            //set row equal to next row
            row2 = itr2.next();
       	    //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row2.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "First Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of First Basemen
            fb.add(temp);
    	}

        //open Second Base file
    	File file3 = new File("C:\\Group3Project\\mlb-playe-stats-2B.xlsx");//file name
    	//Iterate fileStream
    	FileInputStream fis3 = new FileInputStream(file3);
    	//open workbook
    	XSSFWorkbook wb3 = new XSSFWorkbook(fis3);
    	//open sheet
    	XSSFSheet sheet3 = wb3.getSheetAt(0);
    	//create row iterator to traverse the sheet
    	Iterator<Row> itr3 = sheet3.iterator();
   	//declare variable to hold each row and set equal to title row
    	Row row3 = itr3.next();
	
	//loop through the sheet as long as there is another row
    	while(itr3.hasNext())
    	{
       	    //set row equal to next row
            row3 = itr3.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row3.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Second Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Second Basemen
            sb.add(temp);
        }

        //open Third Basemen file
    	File file4 = new File("C:\\Group3Project\\mlb-playe-stats-3B.xlsx");//file name
    	//Iterate fileStream
    	FileInputStream fis4 = new FileInputStream(file4);
    	//open workbook
    	XSSFWorkbook wb4 = new XSSFWorkbook(fis4);
    	//open sheet
    	XSSFSheet sheet4 = wb4.getSheetAt(0);
    	//create row iterator to traverse the sheet
   	Iterator<Row> itr4 = sheet4.iterator();
    	//declare variable to hold each row and set equal to title row
    	Row row4 = itr4.next();

        //loop through the sheet as long as there is another row
        while(itr4.hasNext())
        {
            //set row equal to next row
            row4 = itr4.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row4.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Third Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Third Basemen
            tb.add(temp);
        }

        //open Short Stop file
    	File file5 = new File("C:\\Group3Project\\mlb-playe-stats-SS.xlsx");//file name
    	//Iterate fileStream
    	FileInputStream fis5 = new FileInputStream(file5);
    	//open workbook
    	XSSFWorkbook wb5 = new XSSFWorkbook(fis5);
    	//open sheet
    	XSSFSheet sheet5 = wb5.getSheetAt(0);
    	//create row iterator to traverse the sheet
    	Iterator<Row> itr5 = sheet5.iterator();
    	//declare variable to hold each row and set equal to title row
    	Row row5 = itr5.next();

        //loop through the sheet as long as there is another row
        while(itr5.hasNext())
        {
            //set row equal to next row
            row5 = itr5.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row5.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Short Stop", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Short Stops
            st.add(temp);
        }


        //open Out Field file
    	File file6 = new File("C:\\Group3Project\\mlb-playe-stats-OF.xlsx");//file name
    	//Iterate fileStream
    	FileInputStream fis6 = new FileInputStream(file6);
    	//open workbook
    	XSSFWorkbook wb6 = new XSSFWorkbook(fis6);
    	//open sheet
    	XSSFSheet sheet6 = wb6.getSheetAt(0);
    	//create row iterator to traverse the sheet
    	Iterator<Row> itr6 = sheet6.iterator();
    	//declare variable to hold each row and set equal to title row
    	Row row6 = itr6.next();

        //loop through the sheet as long as there is another row
        while(itr6.hasNext())
        {
            //set row equal to next row
            row6 = itr6.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row6.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Out Field", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Out Fielders
            ofs.add(temp);
        }

        //open Designated Hitter file
        File file7 = new File("C:\\Group3Project\\mlb-playe-stats-DH.xlsx");//file name
        //reate fileStream
        FileInputStream fis7 = new FileInputStream(file7);
        //open workbook
        XSSFWorkbook wb7 = new XSSFWorkbook(fis7);
        //open sheet
        XSSFSheet sheet7 = wb7.getSheetAt(0);
        //create row iterator to traverse the sheet
        Iterator<Row> itr7 = sheet7.iterator();
        //declare variable to hold each row and set equal to title row
        Row row7 = itr7.next();

        //loop through the sheet as long as there is another row
        while(itr7.hasNext())
        {
            //set row equal to next row
            row7 = itr7.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row7.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell ab = cellIterator.next();
            Cell runs = cellIterator.next();
            Cell hits = cellIterator.next();
            Cell doub = cellIterator.next();
            Cell trip = cellIterator.next();
            Cell homer = cellIterator.next();
            Cell rbi = cellIterator.next();
            //create new player with data from row
            Player temp = new Player(name, team, "Designated hitter", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Designated Hitters
            dh.add(temp);
        }

        //open Pitcher file
        File file8 = new File("C:\\Group3Project\\mlb-playe-stats-P.xlsx");//file name
        //Create fileStream
        FileInputStream fis8 = new FileInputStream(file8);
        //open workbook
        XSSFWorkbook wb8 = new XSSFWorkbook(fis8);
        //open sheet
        XSSFSheet sheet8 = wb8.getSheetAt(0);
        //create row iterator to traverse the sheet
        Iterator<Row> itr8 = sheet8.iterator();
        //declare variable to hold each row and set equal to title row
        Row row8 = itr8.next();

        //loop through the sheet as long as there is another row
        while(itr8.hasNext())
        {
            //set row equal to next row
            row8 = itr8.next();
            //set up cell iterator to check each cell
            Iterator<Cell> cellIterator = row8.cellIterator();
            //grab relevant variables from the row in the order of the sheet
            Cell name = cellIterator.next();
            Cell team = cellIterator.next();
            Cell age = cellIterator.next();
            Cell games = cellIterator.next();
            Cell GS = cellIterator.next();
            Cell CG = cellIterator.next();
            Cell SHO = cellIterator.next();
            Cell IP = cellIterator.next();
            Cell H = cellIterator.next();
            Cell ER = cellIterator.next();
            Cell K = cellIterator.next();
            //create new player with data from row
            Pitcher temp = new Pitcher(name, team, "Pitcher", IP, K);
            //add player to list of Catchers
            itch.add(temp);
     	}
    launch(args);
  }
  
  @Override
  public void start(Stage stage) throws Exception {
	Team myTeam = new Team();
	//  List<Team> myTeam = new ArrayList();
	List<Player> c = new ArrayList(); // Catchers
	List<Player> fb = new ArrayList();  // First Base
	List<Player> sb = new ArrayList(); // Second Base
	List<Player> tb = new ArrayList(); // Third Base
	List<Player> st = new ArrayList(); // Short Stop
	List<Player> dh = new ArrayList(); // Designated Hitter
	List<Player> ofs = new ArrayList(); // Out field
	List<Pitcher> itch = new ArrayList(); // Pitcher
	List<Player> allPlayers = new ArrayList();
	allPlayers.addAll(c); allPlayers.addAll(fb); allPlayers.addAll(sb); allPlayers.addAll(tb);
	allPlayers.addAll(st); allPlayers.addAll(dh); allPlayers.addAll(ofs);
	
	List<Player> teamArray = new ArrayList();
	List<Player> batterStatsArray = new ArrayList();
	List<Pitcher> pitcherStatsArray = new ArrayList();
	List<Player> teamPlayers = new ArrayList();
	teamPlayers.add(myTeam.getCatcher()); teamPlayers.add(myTeam.getFirstBase()); teamPlayers.add(myTeam.getSecondBase());
	teamPlayers.add(myTeam.getThirdBase()); teamPlayers.add(myTeam.getShortStop()); teamPlayers.add(myTeam.getDesigHit());
	teamPlayers.addAll(myTeam.getOutFields());
	
	final ObservableList<Player> players = FXCollections.observableList(allPlayers); // Create observable list from array
	final ObservableList<Pitcher> pitchers = FXCollections.observableList(itch);
	final ObservableList<Player> team = FXCollections.observableList(teamPlayers);
	final ObservableList<Player> batterStats = FXCollections.observableList(batterStatsArray);
	final ObservableList<Pitcher> pitcherStats = FXCollections.observableList(pitcherStatsArray);
	  
	 // Player List
    Text playerListText = new Text("Player List"); // Make text
    Text playerListColumns = new Text("Position	        Name");
    ListView playerList = new ListView(players); // Make a list ***SCOPE ERROR***
    ListView pitcherList = new ListView(pitchers);
    VBox column1 = new VBox(); // Make column 1 of scene1
    column1.getChildren().addAll(playerListText, playerListColumns, playerList); // Add label and table to column 1
    
    // Buttons
    Button addButton = new Button("Add Player"); // Make buttons
    Button removeButton = new Button("Remove Player");
    Button finishButton = new Button("Finish Team");
    
    VBox column2 = new VBox(); // Make column 2 of scene1
    column2.getChildren().addAll(addButton, removeButton, finishButton); // Add buttons to column 2
    column2.setSpacing(30);
    column2.setMargin(addButton, new Insets(40, 0, 0, 0)); // Set margins
    column2.setMargin(removeButton, new Insets(0, 0, 40, 0));    
    
    // Team List
    Text teamListText = new Text("Team List"); 
    Text teamListColumns = new Text("Name            Position");
    ListView teamList = new ListView(team);
    VBox column3 = new VBox(); // Make column 3 of scene1
    column3.getChildren().addAll(teamListText, teamListColumns, teamList); // Add label and list to column 3
    
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
    ListView pitcherStatsList = new ListView(pitcherStats);
    VBox pitcherColumn = new VBox(); // Left side of scene2
    pitcherColumn.getChildren().addAll(pitcherStatsText, pitcherStatsColumns, pitcherStatsList);
    
    // Batter Column
    Text batterStatsText = new Text("Batter Statistics");
    Text batterStatsColumns = new Text("Player          Score");
    ListView batterStatsList = new ListView(batterStats);
    VBox batterColumn = new VBox();
    batterColumn.getChildren().addAll(batterStatsText, batterStatsColumns, batterStatsList);
    
    // Bottom: Buttons and Points
    Button editButton = new Button("Edit"); // Make buttons
    Button resetButton = new Button("Reset");
    String points = "Points: " + myTeam.getScore();
    Text pointsText = new Text(points);
    
    // Page #2 Layout
    VBox layout2 = new VBox(); // Contains columns and bottomPane
    HBox columns = new HBox();
    HBox bottomPane = new HBox(); // Contains
    bottomPane.getChildren().addAll(editButton, pointsText, resetButton); // Add buttons to bottom node
    bottomPane.setSpacing(50);
    
    columns.getChildren().addAll(batterColumn, pitcherColumn); // Add tables and labels to the columns HBox
    layout2.getChildren().addAll(columns, bottomPane); // Add columns to the layout2 VBox
        
    Scene scene2 = new Scene(layout2, 1000, 700); // Make second scene
    addButton.setOnAction(e -> myTeam.addPlayer(playerList.getSelectionModel().getSelectedItem()));
    removeButton.setOnAction(e -> myTeam.removePlayer(teamList.getSelectionModel().getSelectedItem()));
    finishButton.setOnAction(e -> stage.setScene(scene2)); // Make "Finish Team" button go to Score Screen (scene2)
    editButton.setOnAction(e -> stage.setScene(scene1)); // Make "Edit" button go to Select Players Screen (scene1)
    resetButton.setOnAction(e -> stage.close()); // Make "Reset" button go to Select Players Screen (scene1)
    
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
    
    pitcherStatsList.setCellFactory(param -> new ListCell<Player>() {
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
    
    batterStatsList.setCellFactory(param -> new ListCell<Player>() {
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
    batterStatsColumns.setFont(Font.font("Century Gothic", 20));
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