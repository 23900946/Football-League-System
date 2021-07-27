/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFL;

import java.io.Serializable;

/**
 *
 * @author user
 */
public class Referee implements Serializable{

    private String firstName; //Initialises the referee's first name
    private String lastName; //Initialises the referee's last name
    private int age; //Initialises the referee's age
    private String employed; //Initialises the referee's employment status

    /**
     * This constructor creates a Referee object by taking four parameters
     * @param firstName first name of the referee
     * @param lastName last name of the referee
     * @param age age of the referee
     * @param employed employment status of the referee
     */
    public Referee(String firstName, String lastName, int age, String employed) {

        this.firstName = firstName; //Assigns first name 
        this.lastName = lastName; //Assigns last name
        this.age = age; //Assigns age
        this.employed = employed; //Assigns employment status
    }

    /**
     * Gets the referee's first name
     * @return the referees first name
     */
    public String getFirstName() {

        return firstName;
    }

    /**
     * Gets the referee's last name
     * @return the referees last name 
     */
    public String getLastName() {

        return lastName;
    }

    /**
     * Gets the referee's age
     * @return the referee's age
     */
    public int getAge() {

        return age;
    }

    /**
     * Gets the referee's employment status
     * @return the referee's employment status
     */
    public String getEmployed() {

        return employed;
    }
}
