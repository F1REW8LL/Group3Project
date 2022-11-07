import java.util.ArrayList;
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
    private ArrayList<Player> outField = new ArrayList<Player>;
    private ArrayList<Pitcher> pitchers = new ArrayList<Pitcher>;
    private double score = 0;
    private Boolean full = false;

    /**
     Creates a team object
     */
    public Team()
    {
        score = 0;
        full = false;
    }

      //This function places player in appropriate position and checks if team is full
    public void addPlayer(Player player1) 
    {
        if (full == false)
        {
            // need to add if else checking if each of these positions are null or not before adding
            if (player1.getPosition() == "catcher")
            {  
                catcher = player1;
            }
            else if (player1.getPosition() == "firstbase")
            {
                firstBase = player1;
            }
            else if (player1.getPosition() == "thirdbase")
            {
                secondBase = player1;
            }
            else if (player1.getPosition() == "shortstop")
            {
                thirdBase = player1;
            }
            else if (player1.getPosition() == "designated hitter")
            {
                desigHit = player1;
            }
            else if (player1.getPosition() == "outfielder")
            {
                if (outField.size() == 4)
                {
                    System.out.println("Outfield is full; please remove a player from outfield before trying to add.");
                }
                else
                {
                    outField.add(player1);
                }
                
            }
        }
        else
        {
            System.out.println("Team is full; please remove a player.")
        }
    }

    //this function removes the selected player from the team and sets the full boolean to false
    public void removePlayer(Player player1)
    {
        // need to check that the passed player is the current position holder before deleting
        // need to first check if the passed player is currently in the team
        if (player1.getPosition() == "catcher")
        {
            catcher = null;
        }
        else if (player1.getPosition() == "firstbase")
        {
            firstBase = null;
        }
        else if (player1.getPosition() == "thirdbase")
        {
            secondBase = null;
        }
        else if (player1.getPosition() == "shortstop")
        {
            thirdBase = null;
        }
        else if (player1.getPosition() == "designated hitter")
        {
            desigHit = null;
        }
        else if (player1.getPosition() == "outfielder")
        {
            outField.remove(player1);
        }
        
        full = false;
    }

    //This function places pitchers into the array and checks if the team is full
    public void addPitcher(Pitcher pitcher1)
    {
        if (pitchers.Size() < 3) // If team size is less than 4
        {
            pitchers.add(pitcher1); // Add pitcher to the list

            if (pitchers.Size() == 3) // If team size is 4 after adding pitcher
                full = true;
        }
        else if (pitchers.Size() == 3) // If team size is 4
        {
            System.out.println("Maximum amount of pitchers already on team");
            full = true;
        }
    }

    //this function removes the selected pitcher from the team and sets the full boolean to false
    public void removePitcher(Pitcher pitcher1)
    {
        if (pitchers.isEmpty() == FALSE) // If there are pitchers to remove
        {
            pitchers.remove(pitcher1); // Remove pitcher from the list
            full = false;
        }
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
        return pitchers;
    }
}
