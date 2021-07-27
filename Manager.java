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
public class Manager implements Serializable{

    private String firstName; //Initialises the manage's first name
    private String lastName; //Initialises the manager's last name
    private String formation; //Initialises the manager's preferred formation

    /**
     * This constructor creates a manager object by taking three parameters
     * @param firstName first name of the manager
     * @param lastName last name of the manager
     * @param formation manager's preferred formation
     */
    public Manager(String firstName, String lastName, String formation) {

        this.firstName = firstName; //Assigns first name
        this.lastName = lastName; //Assigns last name
        this.formation = formation; //Assigns formation
 
    }

    /**
     * Gets the manager's first name
     * @return the value of first name
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * Gets the manager's last name
     * @return the value of last name
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * Gets the manager's formation
     * @return the value of formation
     */
    public String getFormation() {

        return formation;

    }

}
