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
public class JFL implements Serializable {

    /**
     * @param args the command line arguments
     */
    private Player[] maxPlayers; //Initialises Player object array
    private Team[] maxTeams; //Initialises Team object array
    private Referee[] maxRefs; //Initialises Referee object array
    private Manager[] maxMans; //Initialises Manager object array
    private Match[] maxMatches; //Initialises Match object array
    private int count = 0; 

    /**
     * This contains how many objects each array can hold
     */
    public JFL() {

        maxPlayers = new Player[150]; //Sets the maximum numder of players in the system to 150
        maxTeams = new Team[10]; //Sets the maximum numder of teams in the system to 15
        maxRefs = new Referee[10]; //Sets the maximum numder of referees in the system to 10
        maxMans = new Manager[10]; //Sets the maximum numder of managers in the system to 10
        maxMatches = new Match[20]; //Sets the maximum numder of matches in the system to 20

    }

    /**
     * This method adds a player to the system
     * @param newPlayer takes the player class as a parameter
     * @return true if the player has been created and false if not
     */
    public boolean addPlayer(Player newPlayer) {
        if (count <= 100) {
            maxPlayers[count++] = newPlayer;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method adds a team to the system
     * @param newTeam takes the team class as a parameter
     * @return true if the team has been created and false if not
     */
    public boolean addTeam(Team newTeam) {
        if (count <= 100) {
            maxTeams[count++] = newTeam;
            return true;
        } else {
            return false;
        }

    }

    /**
     * This method adds a referee to the system
     * @param newRef takes the referee class as a parameter
     * @return true if the referee has been created and false if not
     */
    public boolean addReferee(Referee newRef) {
        if (count <= 100) {
            maxRefs[count++] = newRef;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method adds a manager to the system
     * @param newManager takes the manager class as a parameter
     * @return true if the manager has been created and false if not
     */
    public boolean addManager(Manager newManager) {
        if (count <= 100) {
            maxMans[count++] = newManager;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method adds a match to the system
     * @param newMatch takes the match class as a parameter
     * @return if a match has been created and false if not
     */
    public boolean addMatch(Match newMatch) {
        if (count <= 100) {
            maxMatches[count++] = newMatch;
            return true;
        } else {
            return false;
        }
    }

    /**
     * This method deletes a player
     * @param fName takes the player's first name as a parameter
     * @param lName takes the player's last name as a parameter
     * @return true if the player was found and deleted, false if not
     */
    public boolean deletePlayer(String fName, String lName) {
        for (int i = 0; i < maxPlayers.length; i++) {
            if (maxPlayers[i] != null && maxPlayers[i].getFirstName().equals(fName) && maxPlayers[i].getLastName().equals(lName)) {
                maxPlayers[i] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * This method adds a player to a team
     * @param team takes the team class as a parameter
     * @param addPlayer takes the player class as a parameter
     * @return true if the player was added to the team, false if not
     */
    public boolean addPlayerIntoTeam(Team team, Player addPlayer) {
        if (team.roomInTeam()) {
            return team.addPlayerToTeam(addPlayer);
        } else {
            return false;
        }
    }

    /**
     * This method removes a player from a team
     * @param removePlayer takes the team class as a parameter
     * @param remove takes the player team as a parameter
     * @return removePlayer
     */
    public boolean removePlayerFromTeam(Team removePlayer, Player remove) {
        //
        return removePlayer.removePlayerFromTeam(remove);
    }

    /**
     * This method adds a manager to a team
     * @param team takes the team class as a parameter
     * @param addManager takes the manager class as a parameter
     * @return true if the manager was added to the team, false if not
     */
    public boolean addManagerIntoTeam(Team team, Manager addManager) {
        if (team.managerVacany()) {
            return team.addManagerToTeam(addManager);
        } else {
            return false;
        }
    }

    /**
     * This method removes a manager from a team
     * @param removeManager takes the team class as a parameter
     * @param remove takes the manager class as a parameter
     * @return remove manager
     */
    public boolean removeManagerFromTeam(Team removeManager, Manager remove) {
        //
        return removeManager.removeManagerFromTeam(remove);
    }
    
    /**
     * This method adds a referee to a match
     * @param match takes the match class as a parameter
     * @param addRef takes the referee class as a parameter
     * @return true if the referee was added to the match, false if not
     */
    public boolean addRefToMatch(Match match, Referee addRef) {
        if (match.roomForRef()) {
            return match.addRefToMatch(addRef);
        } else {
            return false;
        }
    }

    /**
     * This method deletes a team from the system
     * @param teamName takes the team's name as a parameter
     * @return true if the team was deleted, false if not
     */
    public boolean deleteTeam(String teamName) {
        for (int i = 0; i < maxTeams.length; i++) {
            if (maxTeams[i] != null && maxTeams[i].getTeamName().equals(teamName)) {
                maxTeams[i] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * This method gets a team object by its name
     * @param teamName takes the team's name as a parameter
     * @return the teams name when it has been found
     */
    public Team getTeamByName(String teamName) {

        for (int i = 0; i < maxTeams.length; i++) {

            if (maxTeams[i].getTeamName().equals(teamName)) {

                return maxTeams[i];
            }

        }

        return null;
    }

    /**
     * This method deletes a referee from the system
     * @param fName takes the referee's first name as a parameter
     * @param lName takes the referee's last name as a parameter
     * @return  true if the referee was found and deleted, false if not
     */
    public boolean deleteRef(String fName, String lName) {
        for (int i = 0; i < maxRefs.length; i++) {
            if (maxRefs[i] != null && maxRefs[i].getFirstName().equals(fName) && maxRefs[i].getLastName().equals(lName)) {
                maxRefs[i] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * This method deletes a manager from the system
     * @param fName takes the manager's first name as a parameter
     * @param lName takes the manager's last name as a parameter
     * @return  true if the manager was found and deleted, false if not
     */
    public boolean deleteManager(String fName, String lName) {
        for (int i = 0; i < maxMans.length; i++) {
            if (maxMans[i] != null && maxMans[i].getFirstName().equals(fName) && maxMans[i].getLastName().equals(lName)) {
                maxMans[i] = null;
                return true;
            }
        }

        return false;
    }
    
    /**
     * This method deletes all the objects in the maxMatches array
     * @return the maxMatches array with no objects inside
     */
    public boolean newSeason() {
        
         for (int i = 0; i < maxMatches.length; i++) {
             
             maxMatches[i] = null;
             
             return true;
             
         }
         
         return false;
    }

}
