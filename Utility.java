import java.util.Scanner;

/*
 * References and Acknowledgments: I have received no outside help on this 
 * programming assignment. 
 */

/**
 * PA2: Better Big Tree Hunting Program Assignment
 * 
 * @author Megan Jane Thompson
 * @version 02/03/19
 */

public class Utility { 

    private static Scanner sc = new Scanner(System.in);
    
   /**
    * This module obtains user's figures information by introducing scanner
    * 
    * @param input refers to the String prompt user input 
    * @return user input information
    */
    public static double inputDouble(String input){
        double userInput;
       
        System.out.print(input + ": ");
        userInput = sc.nextDouble();
        return userInput;
    }
   
    
   /**
    * This module obtains user's names information by introducing scanner
    * 
    * @param input refers to the String prompt input
    * @param name refers to the user's input      
    * @return user input information
    */
    public static String inputLine(String input){
        String name;
       
        System.out.print(input + ": ");
        name = sc.nextLine();
        return name;
    }
   
    
   /**
    * This module turns figures to two decimals
    * 
    * @param decimals refers to the input
    * @param twoDecimals refers to the rounded number
    * @return number rounded to two decimals
    */
    public static String formatTwoDecimals(double decimals){
	    String twoDecimals;
     
        twoDecimals = String.format("%.2f", decimals);
        return twoDecimals;
    }
   
    
   /**
    * This module rounds figures to integer
    * 
    * @param decimals refers to the input
    * @param noDecimals refers to the rounded integer number
    * @return number rounded to no decimals
    */
    public static int formatNoDecimals(double decimals){
        int noDecimal;
     
        decimals = Math.round(decimals);
        noDecimal = (int) decimals;
        return noDecimal;
    }

}