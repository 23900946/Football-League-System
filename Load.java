/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import JFL.JFL; //Imports the JFL class from the JFL package

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author 23900946
 */
public class Load {

    /**
     *
     * @return all the objects/data that were previously created
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public JFL loadData() throws IOException, ClassNotFoundException {

        FileInputStream loadData = new FileInputStream("JFLData.dat"); //Creates file that the data will be read from
        ObjectInputStream retrieve = new ObjectInputStream(loadData);

        JFL load;
        
        load = (JFL)retrieve.readObject(); //Reads all the objects in the file

        return load;

    }
}
