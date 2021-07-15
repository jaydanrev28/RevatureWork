// Converter.java : Java program to create an application used to convert units
package main;

import java.util.Scanner;

public class Converter2 {

   // method to input the quantity in unit1 which will be converted to unit2
   private static double collectQuantity(String unit1, String unit2, Scanner scan) {
      
       double qty;
       System.out.print("Enter the amount in "+unit1+" to convert to "+unit2+": ");
       qty = scan.nextDouble();
      
       return qty;
   }
  
   // method to convert and return the quantity from cups to teaspoons
   private static double convertCupsToTeaspoons(double qty) {
      
       return (qty*48);
   }
  
   // method to convert and return the quantity from miles to kilometers
   private static double convertMilesToKilometers(double qty)
   {
       return(qty*1.60934);
   }
  
   // method to convert and return the quantity from US Gallons to Imperial Gallons
   private static double convertUSGallonsToImperialGallons(double qty)
   {
       return(qty*0.832674);
   }
  
   public static void main(String[] args) {
      
       int menuSelection = 0;
       double qty_unit1, qty_unit2;
       Scanner scan = new Scanner(System.in);
       // loop that continues till the user exits
       while(menuSelection != 4)
       {
           //display the menu
           System.out.println("Please select an option:");
           System.out.println("1. Cups to Teaspoons");
           System.out.println("2. Miles to Kilometers");
           System.out.println("3. US Gallons to Imperial Gallons");
           System.out.println("4. Quit");

           // input of menu choice
           menuSelection = scan.nextInt();
          
           // based on the choice perform the action
           switch(menuSelection)
           {
           case 1:
               qty_unit1 = collectQuantity("cups","teaspoons",scan);
               qty_unit2 = convertCupsToTeaspoons(qty_unit1);
               System.out.println(qty_unit1+" cups = "+qty_unit2+" teaspoons.");
               break;
           case 2:
               qty_unit1 = collectQuantity("miles","kilometers",scan);
               qty_unit2 = convertMilesToKilometers(qty_unit1);
               System.out.println(qty_unit1+" miles = "+qty_unit2+" kilometers.");
               break;
           case 3:
               qty_unit1 = collectQuantity("U.S gallons","Imperial gallons",scan);
               qty_unit2 = convertUSGallonsToImperialGallons(qty_unit1);
               System.out.println(qty_unit1+" US gallons = "+qty_unit2+" Imperial gallons.");
               break;
           case 4:
               System.out.println("Thank you for using the application");
               break;
           default:
               System.out.println("Invalid choice");
           }
           System.out.println();
       }
      
       scan.close();

   }

}