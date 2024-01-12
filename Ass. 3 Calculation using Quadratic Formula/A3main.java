
import java.util.Scanner;

/**
 * Calculate the roots of quadratic equation using the quadratic formula.
 * 
 * f(x) = ax^2 + bx + c
 * 
 * @author jonathangarcia
 */
public class A3main {

  
    public static void main(String[] args) {
        
        //inits
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        
        //display an intro message
        System.out.println("The Quadratic Formula finds the root(s) when\n " +
                "f(x) = 0 for the function f(x)= ax^2+b+c \n");
        
        //get coefficients from the user 
            System.out.println("a:  ");
            a =sc.nextDouble();
            System.out.println("b:  ");
            b =sc.nextDouble();
            System.out.println("c:  ");
            c =sc.nextDouble();
            
         //calculate the discriminant, b^2-4ac 
         double discrim;
         discrim = b*b - 4*a*c;
         
         double root1, root2;
         double imag;
         
         //modify output depending on sign of discriminant 
         if (discrim > 0) { // two real roots
             root1 = (-b + Math.sqrt(discrim))/(2*a);
             root2 = (-b - Math.sqrt(discrim))/(2*a);
             System.out.println("Two real roots: " + root1 + " and " + root2);
         } else if (discrim < 0) { // two imaginary roots    
             imag = Math.sqrt(-discrim) / (2*a);
             System.out.println("Two imaginary roots: " + (-b/(2*a)) + "+/- i" +
                        imag);
         } else {
              root1= -b/(2*a); 
                System.out.println("One real root: " + root1);
         }
         
    }
    
}
             
   
       
