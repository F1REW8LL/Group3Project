/**
 * This class imports data from excel .xlsx files and stores the information into lists
 */
import java.io.File;  
import java.io.FileInputStream;  
import java.util.Iterator;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.Row;  
import org.apache.poi.xssf.usermodel.XSSFSheet;  
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 public class Driver
{
    private ArrayList<Player> c = new ArrayList<Player>;
    private ArrayList<Player> fb = new ArrayList<Player>;
    private ArrayList<Player> sb = new ArrayList<Player>;
    private ArrayList<Player> tb = new ArrayList<Player>;
    private ArrayList<Player> st = new ArrayList<Player>;
    private ArrayList<Player> dh = new ArrayList<Player>;
    private ArrayList<Player> ofs = new ArrayList<Player>;
    private ArrayList<Pitcher> itch = new ArrayList<Player>;
    
    
    public static void main(String[] args)
    {
        //open catcher file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-C (1).xlsx");//file name
        //reate fileStream
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
        File file = new File("C:\\Group3Project\\mlb-playe-stats-1B.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "First Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of First Basemen
            fb.add(temp);
        }

        //open Second Base file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-2B.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "Second Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Second Basemen
            sb.add(temp);
        }


        //open Third Basemen file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-3B.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "Third Base", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Third Basemen
            tb.add(temp);
        }

        //open Short Stop file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-SS.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "Short Stop", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Short Stops
            st.add(temp);
        }


        //open Out Field file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-OF.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "Out Field", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Out Fielders
            ofs.add(temp);
        }

        //open Designated Hitter file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-DH.xlsx");//file name
        //reate fileStream
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
            Player temp = new Player(name, team, "Designated hitter", hits-doub-trip-homer, doub, trip, homer, rbi, runs);
            //add player to list of Designeated Hitters
            dh.add(temp);
        }

        //open Pitcher file
        File file = new File("C:\\Group3Project\\mlb-playe-stats-P.xlsx");//file name
        //reate fileStream
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
    }
}
 
