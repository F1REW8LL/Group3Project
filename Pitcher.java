package application

/**
 *  This File holds pitcher objects that hold data 
 */
public class Pitcher
{
    private String name;
    private String team;
    private String position;
    private double inningsPitched;
    private int strikeouts;

    //constructor
    public Pitcher(String name1, String t1, String P1, double ip, int so)
    {
        name = name1;
        team = t1;
        position = p1;
        inningsPitched = ip;
        strikeouts = so;
    }
    
    //This function returns the Pitcher's name
    public String getName()
    {
        return name;
    }

    //This function returns the Pitcher's team
    public String getTeam()
    {
        return team;
    }
    
    //This function returns the pitcher's position
    public String getPosition()
    {
        return position;
    }

    //This function returns the number of innings pitched the pitcher had during the season
    public double getInningsPithced()
    {
        return inningsPitched;
    }

    //This function returns the number of Strikeouts the pithcer earned in the season
    public int getStrikeouts()
    {
        return strikeouts;
    }

    //This function calculates and returns the number of points the player made based off of the statistics
    public double getPoints()
    {
        //caluculate points
        points = 5 * strikeouts + 2* inningsPitched;
        return points;
    }
    
    //function to easily format name and points for final display screen
    public String getNamePoints()
    {
        String nameAndPoints = getName() + "     " + getPoints();
    	return nameAndPoints;
    }
}
