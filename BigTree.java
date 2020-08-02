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
public class BigTree {   
   //This class contains calculations and displays report
	
	
   /**
    * This module calculates the average tree crown
    *
    * @param smallestCrown refers to the smallest crown
    * @param largestCrown refers to the largest crown
    * @param averageCrownSpread refers to the average of the crowns
    * @return average crown spread given largest and smallest crown
    */
    public static double calculateAverageTreeCrown(double smallestCrown, double largestCrown) {
         double averageCrownSpread;
    
         averageCrownSpread = (largestCrown + smallestCrown) / 2;
         return averageCrownSpread;
    }
  
    
   /**
    * This module calculates the tree's total points
    *
    * @param circumference refers to the tree's circumference
    * @param height refers to the tree's height
    * @param averageCrownSpread refers to the tree's crown spread average
    * @param pointsCalculation refers to the total calculated points per formula
    * @return tree's total points
    */
    public static double calculateBigTreePoints(double circumference, double height, double averageCrownSpread) {
        double pointsCalculation;
    
        pointsCalculation = (0.25 * averageCrownSpread) + circumference + height;
        return pointsCalculation;
    }
  
    
   /**
	* This module displays the report, there is no return
	* 
	* @param commonName refers to the tree's common name
	* @param scientificName refers to the tree's scientific name
	* @param circumference refers to the tree's circumference
	* @param height refers to the tree's height
	* @param averageCrownSpread refers to the tree's crown spread average
	* @param points refers to the total calculated points per formula
    * 
    */
    public static void displayReport(String commonName, String scientificName, double circumference, 
                                     double height, double averageCrownSpread, double points) { 
        int intPoints;
	    String strCirc;
	    String strHeight;
	    String strAvg;
	  
	    intPoints = Utility.formatNoDecimals(points);
	    strCirc = Utility.formatTwoDecimals(circumference);
	    strHeight = Utility.formatTwoDecimals(height);
	    strAvg = Utility.formatTwoDecimals(averageCrownSpread);

        System.out.print('\n');
        System.out.println("Big Tree Report:" + '\n');
        System.out.println("    Common Name: " + commonName);
        System.out.println("Scientific Name: " + scientificName + '\n');
        System.out.println("   Circumfrence: " + strCirc);
        System.out.println("         Height: " + strHeight);
        System.out.println("   AverageCrown: " + strAvg + '\n');
        System.out.println("   Total Points: " + intPoints + '\n');
    }
  
}