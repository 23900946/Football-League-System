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
public class Player implements Serializable{
    
    private String firstName; //Initialises the player's first name
    private String lastName; //Initialises the player's last name
    private int age; //Initialises the player's age
    private String position; //Initialises the player's position

    /**
     * This constructor creates a player object by taking four parameters
     * @param firstName first name of the player
     * @param lastName last name of the player
     * @param age age of the player
     * @param position position the player plays
     */
    
    public Player(String firstName, String lastName, int age, String position) {
        
        this.firstName = firstName; //Assigns first name
        this.lastName = lastName; //Assigns last name
        this.age = age; //Assigns age
        this.position = position; //Assigns position
    }

    /**
     * Gets the player's first name
     * @return the value of first name
     */
    
    public String getFirstName() {
        
        return firstName;
    } 

    /**
     * Gets the player's last name
     * @return value of last name
     */
    
    public String getLastName() {
         
        return lastName;
    }

    /**
     * Gets the player's age
     * @return value of age
     */
    
    public int getAge() {
        
        return age;
    }

    /**
     * Gets the player's position
     * @return value of position
     */
    
    public String getPosition() {
        
        return position;
    }
    
    }

