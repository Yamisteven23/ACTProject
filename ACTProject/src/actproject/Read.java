/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actproject;

import java.io.*;

/**
 *
 * @author Yamisteven23
 */
public class Read {
    public static void read(String fileName)
    {
        //to do: change .txt later to .csv or .xsls
        String username = System.getProperty("user.name");
        String filePath = "C:\\Users\\" + username + "\\Desktop\\" + fileName
                          + ".txt";
        String line = null;
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(filePath);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + 
                filePath + "'");                
        }
        catch(IOException ex) {
            System.out.println("Error reading file '" 
                + filePath + "'"); 
        
    }
        
    }
    
    
}
