/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import JFL.JFL;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author user
 */
public class NewSeason {
    
    /**
     *
     * @return all the objects/data that were previously created except the matches which are deleted
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public JFL startNewSeason() throws IOException, ClassNotFoundException {

        FileInputStream loadData = new FileInputStream("JFLData.dat"); //Creates file that the data will be read from
        ObjectInputStream retrieve = new ObjectInputStream(loadData);

        JFL load; 
        
        load = (JFL)retrieve.readObject(); //Reads all the objects in the file
        
        load.newSeason(); //Calls the newSeason method so that all matches are deleted

        return load;

    }
    
}
