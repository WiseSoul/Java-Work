/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiontest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Silviu Patras
 */
public class ExceptionTest {
    
    public static int stringToInt(String str) {
        System.out.print(str.length());
        return  Integer.parseInt(str);
    }  
    
    public static void crash() throws MyException {
        throw new MyException();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int b =-1,c=-1;
        try {
            b = stringToInt(null);
            c = stringToInt("2");
            System.out.println("SUCCESS!!!!!!!");
            
   
        } catch (NullPointerException ex) {
            System.err.println("Exception found: " + ex.toString());
        }
        finally {
            System.out.println("b: " + Integer.toString(b) + "  c: " + Integer.toString(c));
        }
    }
    
}
// << <=> +