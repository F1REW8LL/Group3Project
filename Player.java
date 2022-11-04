/**
 * This class creates player objects that holds player names and data
 */
public class Player
{
    private String name;
    private String team;
    Private String position;
    Private int singles;
    Private int doubles;
    Private int triples;
    Private int homeRuns;
    Private int rbis;
    Private int runs;
    private double points;

    public Player (String name1, String t1, String P1, int s1, int d1, int t1, int hr, int rbi, int r)
    {
        name = name1;
        team = t1;
        position = p1;
        singles = s1;
        doubles = d1;
        triples = t1;
        homeRuns= hr;
        rbis = rbi;
        runs = r;
    }

    //This function returns the Player's Name
    public String getName()
    {
        return name;
    }

    //This function returns the Player's team
    public String getTeam()
    {
        return team;
    }
    
    //This function returns the Player's position
    public String getPosition()
    {
        return position;
    }

    //This function returns the Player's number of singles hit
    public int getSingles()
    {
        return singles;
    }

    //This function returns the Player's number of doubles hit
    public int getDoubles()
    {
        return doubles;
    }

    //This function returns the Player's number of triples hit
    public int getTriples()
    {
        return triples;
    }

    //This function returns the Player's number of home runs hit
    public int getHomeRuns()
    {
        return homeRuns;
    }

    //This function returns the Player's number of RBIs
    public int getRBIs()
    {
        return rbis;
    }

    //This function returns the nember of runs the player scored
    public int getRuns()
    {
        return runs;
    }

    //This function calculates and returns the number of points the player made based off of the stats
    public double getPoints()
    {
        //calculate points
        points = s1 + 2*d1 + 3*t1 + 4*hr + 2*rbis + 2*runs;//might change later
        return points;
    }
}