/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a5main;

import java.util.Scanner;
import java.io.*;
/**
 *
 * @author jonathangarcia
 */
public class A5main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner( System.in );
        
        String userFileName;
        
        String outputFileName;
        
       System.out.println("Please enter name of read file: ");
       userFileName = scanner.nextLine(); 
       
       File file = new File(userFileName);
    
               while ( !file.exists()) {
        System.out.println(userFileName + "File name cannot be found. "
                + "Try again");
        userFileName = scanner.nextLine();
        }
        {
            
           System.out.println("Please enter output file name: ");
           outputFileName = scanner.nextLine();
           
           Scanner fileToScan = new Scanner(file);
           PrintWriter fileToWrite = new PrintWriter(outputFileName);
          
           while(fileToScan.hasNext()) {
           fileToWrite.println( fileToScan.nextLine() .toUpperCase());
        }
                   System.out.println("All character have been converted to "
                           + "uppercase and saved.");
                   fileToWrite.close();
                   fileToScan.close();
                
        }
    }
}
