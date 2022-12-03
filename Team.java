package application;

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
    private ArrayList<Player> outField = new ArrayList<Player>(); // 3 outfielders
    private ArrayList<Pitcher> pitchers = new ArrayList<Pitcher>(); // 4 pitchers
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
            // checks if the position is currently full or not
            if (player1.getPosition() == "catcher")
            {
                if (catcher == null)
                {
                    catcher = player1;
                }
                else
                {
                    // System.out.println("Please remove the current catcher before adding a new catcher.");
                }
            }
            else if (player1.getPosition() == "firstbase")
            {
                if (firstbase == null)
                {
                    firstBase = player1;
                }
                else
                {
                    // System.out.println("Please remove the current first baseman before adding a new first baseman.");
                }
            }
            else if (player1.getPosition() == "secondbase")
            {
                if (secondbase == null)
                {
                    secondBase = player1;
                }
                else
                {
                    // System.out.println("Please remove the current second baseman before adding a new second baseman.");
                }
            }
            else if (player1.getPosition() == "thirdbase")
            {
                if (thirdBase == null)
                {
                    thirdBase = player1;
                }
                else
                {
                    // System.out.println("Please remove the current third baseman before adding a new third baseman.");
                }
            }
            else if (player1.getPosition() == "shortstop")
            {
                if (shortStop == null)
                {
                    shortStop = player1;
                }
                else
                {
                    // System.out.println("Please remove the current shortstop before adding a new shortstop.");
                }
            }
            else if (player1.getPosition() == "designated hitter")
            {
                if (desigHit == null)
                {
                    desigHit = player1;
                }
                else
                {
                    // System.out.println("Please remove the current designated hitter before adding a new designated hitter.");
                }
            }
            else if (player1.getPosition() == "outfielder")
            {
                if (outField.size() == 4)
                {
                    // System.out.println("Outfield is full; please remove a player from outfield before trying to add.");
                }
                else
                {
                    outField.add(player1);
                } 
            }
        }
        else
        {
            // System.out.println("Team is full; please remove a player.");
        }
    }

    //this function removes the selected player from the team and sets the full boolean to false
    public void removePlayer(Player player1)
    {
        // finds player by position and removes that player
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
        if (pitchers.size() < 3) // If team size is less than 4
        {
            pitchers.add(pitcher1); // Add pitcher to the list

            if (pitchers.size() == 3) // If team size is 4 after adding pitcher
                full = true;
        }
        else if (pitchers.size() == 3) // If team size is 4
        {
            // System.out.println("Maximum amount of pitchers already on team");
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
        if (full)
        {
            double pitchTotal = pitchers.get(0).getPoints() + pitchers.get(1).getPoints() + pitchers.get(2).getPoints() + pitchers.get(3).getPoints();
            double outTotal = outField.get(0).getPoints() + outField.get(1).getPoints() + outField.get(2).getPoints();

            score = catcher.getScore() + firstBase.getScore() + secondBase.getScore() + thirdBase.getScore() + shortStop.getScore() + desigHit.getScore() + pitchTotal + outTotal;   
        }
        else
        {
            // system.out.println("error: team not full");
            score = 0;
        }
    }

    //This function returns the score to the user
    public double getScore()
    {
        this.calculateScore();
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

    //This function returns the Outfielders
    public ArrayList<Player> getOutFields()
    {
        return outField;
    }

    //This function returns the Designated Hitter
    public Player getDesigHit()
    {
        return desigHit;
    }

    //This function returns the Pitchers
    public ArrayList<Pitcher> getPitchers()
    {
        return pitchers;
    }
}
