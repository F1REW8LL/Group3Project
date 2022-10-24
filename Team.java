/**
 * This class holds players in their appropriate position when a User adds them to the team and calculates score for the team when full.
 */
public class Team
{
    //declare local attributes of the team object
    private Player catcher;
    private Player firstBase;
    private Player secondBase;
    private Player thirdBase;
    private Player shortStop;
    private Player desigHit;
    private Player[3] outField;
    private Pitcher[4] pitchers;
    private double score =0;
    private Boolean full = false;
   
    /**
    Construct a Message object.
    @param messageText the message text
    */
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
        //CALCULATE SCORE    
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
        return Pitchers;
    }
}   
