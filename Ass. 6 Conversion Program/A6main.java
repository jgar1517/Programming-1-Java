/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a6main;
import java.util.Scanner;

/**
 *
 * @author jonathangarcia
 */
public class A6main {

    /**
     */
    public static void menu(){
        System.out.print("1. Convert to kilometers\n2. Convert to inches\n3. "
                + "Convert to feet\n4. Quit the Program\n"); 
    }
    public static void showKilometers(double meters){
        double kilometers; 
        kilometers = meters * 0.001; 
        System.out.printf("%.1f converted to kilometers is %.1f\n", meters, kilometers);
       
    }
     public static void showInches(double meters){
        double inches; 
       inches = meters * 39.37; 
        System.out.printf("%.1f converted to inches is %.1f\n", meters, inches);
       
    }
      public static void showFeet(double meters){
        double feet; 
        feet = meters * 3.281; 
        System.out.printf("%.1f converted to feet is %.1f\n", meters, feet);
       
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters;
        int sentinel = 4;
        int userChoice;
        
        System.out.println( "Please enter the distance in meters: ");
        meters = scanner.nextDouble();
        
        while(meters < 0){
            System.out.println("Please enter a value greater than 0: ");
            meters = scanner.nextDouble();
        }
        menu();
                
        System.out.println("Enter your choice: ");
        userChoice = scanner.nextInt();
        
        while(userChoice != sentinel) {
            if(userChoice == 1){
                showKilometers(meters);
            } else if(userChoice == 2){
                showInches(meters);
            } else if(userChoice == 3){
                showFeet(meters); 
            } else {
                Integer.parseInt(args[4]);  
            }
            menu();
            System.out.println("Enter you choice: ");
            userChoice = scanner.nextInt();
           
    }
        System.out.print("Bye ");
    }
    
    
}
