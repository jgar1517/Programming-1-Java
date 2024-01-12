/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4main;
import java.util.Scanner;
import java.text.*;
/**
 *
 * @author jonathangarcia
 */
public class A4main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int years;
        final int MONTHS = 12;
        int totalMonths = 0;
        double monthlyRain;
        double totalRainfall = 0;
        
        NumberFormat df = DecimalFormat.getInstance();
        df.setMaximumFractionDigits(2);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of years: ");  
        years = input.nextInt(); 
        
        System.out.println("Enter the rainfall amount for each month ");
        for(int i=0; i < years; i++){
         for(int j=1; j<MONTHS+1; j++){
            switch(j){
                case 1:
                        System.out.print("January:");
                        break;
                case 2:
                        System.out.print("February:");
                        break;
                case 3:
                        System.out.print("March:");
                        break;
                case 4:
                        System.out.print("April:");
                        break;
                case 5:
                        System.out.print("May:");
                        break;
                case 6:
                        System.out.print("June:");
                        break;
                case 7:
                        System.out.print("July:");
                        break;
                case 8:
                        System.out.print("August:");
                        break;
                case 9:
                        System.out.print("September:");
                        break;
                case 10:
                        System.out.print("October:");
                        break;
                case 11:
                        System.out.print("November:");
                        break;
                case 12:
                        System.out.print("December:");         
        } 
        monthlyRain = input.nextDouble();
        totalRainfall += monthlyRain;
        } 
        totalMonths += MONTHS; 
        }
        double avgRainfall = totalRainfall/totalMonths;
        
        System.out.println(" ");
        System.out.println("Total Months: " + totalMonths + "\nTotal Rainfall: "
                + df.format(totalRainfall) + "inches" + "\nAverage Rainfall: " 
                + df.format(avgRainfall) + "inches");
    }
}
