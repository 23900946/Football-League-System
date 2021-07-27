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
public class Team implements Serializable {

    private String name; //Initialises the team's name
    private int currentPoints; //Initialises the team's points
    private int currentWins; //Initialises the team's wins
    private int currentLosses; //Initialises the team's losses
    private int currentDraws; //Initialises the team's draws
    private Player[] players; //Initialises the team's players
    private Manager[] manager; //Initialises the team's manager

    /**
     * This constructor creates a Team object by taking five parameters
     * @param name name of the team
     * @param currentPoints number of points the team currently has
     * @param currentWins number of wins the team currently has
     * @param currentLosses number of losses the team currently has
     * @param currentDraws number of draws the team currently has
     */

    public Team(String name, int currentPoints, int currentWins, int currentLosses, int currentDraws) { 

        this.name = name; //Assigns name
        this.currentPoints = currentPoints; //Assigns current points
        this.currentWins = currentWins; //Assigns current wins
        this.currentLosses = currentLosses; //Assigns current losses
        this.currentDraws = currentDraws; //Assigns current draws
        players = new Player[15]; //Sets the maxuimum number of players in the team to 15
        manager = new Manager[1]; //Sets the maxuimum number of managaers in the team to 1
    }

    /**
     * Gets the name of the team
     * @return the team's name
     */

    public String getTeamName() { 

        return name;

    }

    /**
     * Gets the team's points
     * @return the teams current points
     */
    
    public int getPoints() { 

        return currentPoints;
    }

    /**
     * Gets the team's number of wins
     * @return the teams wins
     */
    
    public int getWins() { 
        return currentWins;
    }

    /**
     * Gets the team's number of losses
     * @return the teams losses
     */
    
    public int getLosses() { 

        return currentLosses;
    }

    /**
     * This method adds a player to a team
     * @param addPlayer takes the player class as a parameter
     * @return true if the player has been added and false if not
     */
    public boolean addPlayerToTeam(Player addPlayer) {

        for (int i = 0; i < players.length; i++) { //Checks the player array
            if (players[i] == null) { //If there is a space in the array...
                players[i] = addPlayer; //...then add the player
                return true;
            }
        }

        return false;
    }

    /**
     * This method adds a manager to a team
     * @param addManager takes the manager class as a parameter
     * @return true if the manager has been added and false if not
     */
    public boolean addManagerToTeam(Manager addManager) {

        for (int i = 0; i < manager.length; i++) { //Checks the manager array
            if (manager[i] == null) { //If there is a space in the array...
                manager[i] = addManager; //...then add the manager
                return true;
            }
        }

        return false;
    }

    /**
     * This method removes a player from the team
     * @param removePlayer takes the player class as a parameter
     * @return true if the player was removed and false if not
     */
    
    public boolean removePlayerFromTeam(Player removePlayer) { 

        for (int i = 0; i < players.length; i++) { //Checks the player array
            if (players[i].getFirstName() == removePlayer.getFirstName()) { //Finds the player with the matching name
                players[i] = null; //Removes the player from the team
                return true;
            }
        }

        return false;

    }

    /**
     * This method removes a manager from the team
     * @param removeManager takes the manager class as a parameter
     * @return true if the manager was removed and false if not
     */
    
    public boolean removeManagerFromTeam(Manager removeManager) { 

        for (int i = 0; i < manager.length; i++) { //Checks the manager array
            if (manager[i].getFirstName() == removeManager.getFirstName()) { //Finds the manager with the matching name
                manager[i] = null; //Removes the manager from the team
                return true;
            }
        }

        return false;

    }

    /**
     * This method checks if there is room in the team for a player to be added
     * @return true if there is room in the array and false if not
     */
    public boolean roomInTeam() {
        for (int i = 0; i < players.length; i++) { //Checks the player array
            if (players[i] == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method checks if there is room in the team for a manager to be added
     * @return true if there is room in the array and false if not
     */
    public boolean managerVacany() {
        for (int i = 0; i < manager.length; i++) { //Checks the manager array
            if (manager[i] == null) {
                return true;
            }
        }
        return false;
    }

}


