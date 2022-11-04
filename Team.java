/**
 * This class holds players in their appropriate position when a User adds them to the team and calculates score for the team when full.
 */
import java.util.ArrayList;
public class Team
{
    //declare local attributes of the team object
    private Player catcher;
    private Player firstBase;
    private Player secondBase;
    private Player thirdBase;
    private Player shortStop;
    private Player desigHit;
    private ArrayList<Player> outField = new ArrayList<Player>;
    private ArrayList<Pitcher> pitchers = new ArrayList<Pitcher>;
    private double score =0;
    private Boolean full = false;
   
    
    //Construct a Team object and set score to 0 and full to false.
    public Team()
    {
        score =0;
        full = false;
    }

    //This function places player in appropriate position and checks if team is full
    public void addPlayer(Player player1) 
    {
        //
    }

    //this function removes the selected player from the team and sets the full boolean to false
    public void removePlayer(Player player1)
    {
        //    
    }

    //This function places pitchers into the array and checks if the team is full
    public void addPitcher(Pitcher pitcher1) 
    {
        //
    }

    //this function removes the selected pithcer from the team and sets the full boolean to false
    public void removePitcher(Pitcher pitcher1)
    {
        //    
    }

    //This function gets the score from each player and calculates the team total
    private void calculateScore()
     {
        if (full)
        {
            double pitchTotal = pitchers.get(0).getPoints() + pitchers.get(1).getPoints() + pitchers.get(2).getPoints() + pitchers.get(3).getPoints();
            double outTotal = outField.get(0).getPoints() + outField.get(1).getPoints() + outField.get(2).getPoints();
        
            score =catcher.getScore() + firstBase.getScore() + secondBase.getScore() + thirdBase.getScore() + shortStop.getScore() + desigHit.getScore() + pitchTotal + outTotal;   
        }
        else
        {
            system.out.println("error: team not full")
            score = 0;
        }
        
    }

    //This function returns the score to the user 
    public double getScore() 
    {
        return score;    
    }

    //this function returns the boolean full
    public boolean isFull()
    {
        return full;
    }

    //This function returns the Catcher
    public Player getCatcher()
    {
        return catcher;
    }

    //This function returns the First Basemen
    public Player getFirstBase()
    {
        return firstBase;
    }

    //This function returns the Second Basemen
    public Player getSecondBase()
    {
        return secondBase;
    }

    //This function returns the third basemen
    public Player getThirdBase()
    {
        return thirdBase;
    }

    //This function returns the ShortStop
    public Player getShortStop()
    {
        return shortStop;
    }

    //This function returns the Outfielder
    public Player[] getOutFields()
    {
        //needs to be changed to array lists
        return outField;
    }

    //This function returns the Designated Hitter
    public Player getDesigHit()
    {
        return desigHit;
    }

    //This function returns the Pitchers
    public Pitcher[] getPitchers()
    {
        //needs to be changed to array lists
        return Pitchers;
    }
}   
