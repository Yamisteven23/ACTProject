/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actproject;

import java.io.File;
import java.io.PrintStream;

/**
 *
 * @author Yamisteven23
 */
public class Read {
    public static void read(String[] args)
    {
        PrintStream out = System.out;
        File file = new File("NameExample.xlsx");
        out.println("Open Successful");
    }
}
