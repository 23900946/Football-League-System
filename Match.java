/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFL;

import java.io.Serializable;

/**
 *
 * @author 23900946
 */
public class Match implements Serializable {
    
    private String homeTeam; //Initialises the match home team
    private String awayTeam; //Initialises the match away team
    private int homeGoals; //Initialises the number of goals scored by the home team
    private int awayGoals; //Initialises the number of goals scored by the away team
    private int week; //Initialises the match week
    private int yellowCards; //Initialises yellow cards
    private int redCards; //Initialises red cards
    private int assists; //Initialises assists
    private Referee[] referee; //Initialises the match referee
    
    /**
     * This constructor creates a Match object by taking nine parameters
     * @param homeTeam the home team
     * @param awayTeam the away team
     * @param homeGoals number of goals scored by the home team
     * @param awayGoals number of goals scored by the away team
     * @param week the week the match took place on
     * @param yellowCards number of yellow cards given
     * @param redCards number of red cards given
     * @param assists number of assists in the match 
     */
    public Match(String homeTeam, String awayTeam, int homeGoals , int awayGoals, int week, int yellowCards, int redCards, int assists) {
        
        this.homeTeam = homeTeam; //Assigns home team
        this.awayTeam = awayTeam; //Assigns away team
        this.homeGoals = homeGoals; //Assigns home goals
        this.awayGoals = awayGoals; //Assigns away goals
        this.week = week; //Assigns weeks
        this.yellowCards = yellowCards; //Assigns yellow cards
        this.redCards = redCards; //Assigns red cards
        this.assists = assists; //Assigns assists
        referee = new Referee[1]; //Sets the maxuimum number of referees in the match to 1
        
    }
    
    /**
     * Gets the match week 
     * @return the value of week
     */
    public int getWeek() {
        
        return week;
    }
    
    /**
     * Gets the home team
     * @return the value of home team
     */
    public String getHomeTeam() {
        
        return homeTeam;
    }
    
    /**
     * Gets the away team
     * @return the value of away team
     */
    public String getAwayTeam() {
        
        return awayTeam;
    }
    
    /**
     * Gets the number of home goals
     * @return the value of home goals
     */
    public int getHomeGoals() {
        
        return homeGoals;
    }
    
    /**
     * Gets the number of away goals
     * @return the value of away goals
     */
    public int getAwayGoals() {
        
        return awayGoals;
    }
    
    /**
     * Gets the number of yellow cards
     * @return the value of yellow cards
     */
    public int yellowCards() {
        
        return yellowCards;
    }
    
    /**
     * Gets the number of assists
     * @return the value of assists
     */
    public int getAssists() {
        
        return assists;
    }
    
    /**
     * This method adds a referee to a match
     * @param addRef takes the referee class as a parameter
     * @return true if the referee has been added and false if not
     */
    public boolean addRefToMatch(Referee addRef) {

        for (int i = 0; i < referee.length; i++) {
            if (referee[i] == null) {
                referee[i] = addRef;
                return true;
            }
        }

        return false;
    }
    
    /**
     * This method checks if there is room in the match for a referee to be added
     * @return true if there is room in the array and false if not
     */
    public boolean roomForRef() {
        for (int i = 0; i < referee.length; i++) { //Checks the referee array
            if (referee[i] == null) {
                return true;
            }
        }
        return false;
    }
   
}
