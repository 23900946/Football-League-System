/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

//Imports JFL from the JFL package
import JFL.JFL;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author 23900946
 */

public class save {
    
    /**
     * This method saves all the data inside the JFL
     * @param JFLData takes the JFL class as a parameter
     * @throws IOException
     */
    public void saveData(JFL JFLData) throws IOException { //Retrieves the JFL's data by taking JFL as a parameter
        
        FileOutputStream saveData = new FileOutputStream("JFLData.dat"); //Creates file that the data will be saved in
        ObjectOutputStream store = new ObjectOutputStream(saveData); 
        
        store.writeObject(JFLData); //Saves all the data from the JFL into the file

    }
    
}
