/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a2main;

/**
 *
 * @author jonathangarcia
 */
public class A2main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Variables to hold the surveyed customers, the 14 % who 
        // purchased one or more energy drinks per week and the 64 % of
        // those of the 14 % who prefer citrus flavored energy drinks. 
        double surveyedcustomers = 12467;
        double oneormoreenergydrinksperweek;
        double prefercitrusflavoreddrinks;
        
        // Calculate the approximate number of 14 % customers,
        oneormoreenergydrinksperweek = surveyedcustomers * 0.14;
        
        // Calculate the approximate number of customers who prefer
        // citrus flavored drinks by multiplying .64 times the number
        // of people who purchase one or more energy drinks per week. 
        prefercitrusflavoreddrinks = oneormoreenergydrinksperweek * 0.64;
        
        // Display the results. 
        System.out.println("Surveyed Customers: " + surveyedcustomers);
        System.out.println("Customers Who Purchased One or More Energy"
                            + " Drinks Per Week: " + oneormoreenergydrinksperweek);
        System.out.println("Customers Who Prefer Citrus Energy Drinks: " + 
                            prefercitrusflavoreddrinks);
        
        
    }
    
}
