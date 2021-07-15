package main;

import java.util.Scanner;

public class Converter {
	
	private static double collectQuantity(String unit1, String unit2, Scanner scan) {
	      
	       double qty;
	       System.out.print("Enter the amount in "+unit1+" to convert to "+unit2+": ");
	       qty = scan.nextDouble();
	      
	       return qty;
	}
	 private static double convertInchesToCentimeters(double qty) {
	      
	       return (qty*2.54);
	   }
	 private static double convertMilesToKilometers(double qty) {
	       
		 return(qty*1.60934);
	   }
	 private static double convertPoundsToKilograms(double qty) {
	      
		 return(qty/2.205);
	   }
	 private static double convertFluidOuncesToLiters(double qty) {
	      
		 return(qty/33.184);
	   }
	 private static double convertCelsiusToFarenheight(double qty) {
	     
		 return(qty*1.8 + 32);
	   }
	 private static double convertCupsToQuarts(double qty) {
	       
		 return(qty/4);
	   }
	 private static double convertOuncesToGrams(double qty){
	       
		 return(qty*28.35);
	   }
public static void main(String[] args) {
	
	   int menuSelection = 0;
       double qty_unit1, qty_unit2;
       Scanner input = new Scanner(System.in);
      
       while(menuSelection != 8)
       {
    	   System.out.println("Please select an option:");
    	   System.out.println("Distance Conversions");
           System.out.println("1. Inches to Centimeters");
           System.out.println("2. Miles to Kilometers");
           System.out.println("Weight Conversions");
           System.out.println("3. Pounds to Kilograms");
           System.out.println("4. Ounces to Grams");
           System.out.println(" Volume Conversions");
           System.out.println("5. Fluid Ounces to Liters");
           System.out.println("6. Cups to Quarts");
           System.out.println("Temperature Conversions");
           System.out.println("7. Celsius to Farenheight");
           System.out.println("8. Quit");
          
           menuSelection = input.nextInt();
           
           switch(menuSelection){
           
           case 1:
           qty_unit1 = collectQuantity("Inches","Centimeters",input);
           qty_unit2 = convertInchesToCentimeters(qty_unit1);
           System.out.println(qty_unit1+" Inches = "+qty_unit2+"Centimeters");
          
           break;
           
           case 2:
           qty_unit1 = collectQuantity("Miles","Kilometers",input);
           qty_unit2 = convertMilesToKilometers(qty_unit1);
           System.out.println(qty_unit1+" Miles = "+qty_unit2+"Kilometers");
          
           break;
           
           case 3:
           qty_unit1 = collectQuantity("Pounds","Kilograms",input);
           qty_unit2 = convertPoundsToKilograms(qty_unit1);
           System.out.println(qty_unit1+" Pounds = "+qty_unit2+"Kilograms");
          
           break;
           
           case 4:
               qty_unit1 = collectQuantity("Ounces","Grams",input);
               qty_unit2 = convertOuncesToGrams(qty_unit1);
               System.out.println(qty_unit1+" Ounces = "+qty_unit2+"Grams");
               
               break;
           case 5:
           qty_unit1 = collectQuantity("Fluid Ounces","Liters",input);
           qty_unit2 = convertFluidOuncesToLiters(qty_unit1);
           System.out.println(qty_unit1+"Fluid Ounces = "+qty_unit2+"Liters");
          
           break;
           
           case 6:
               qty_unit1 = collectQuantity("Cups","Quarts",input);
               qty_unit2 = convertCupsToQuarts(qty_unit1);
               System.out.println(qty_unit1+" Cups = "+qty_unit2+"Quarts");
               
               break;
               
           case 7:
           qty_unit1 = collectQuantity("Celsius","Farenheight",input);
           qty_unit2 = convertCelsiusToFarenheight(qty_unit1);
           System.out.println(qty_unit1+" Celsius = "+qty_unit2+"Farenheight");
           
           break;
           
           
           case 8:
               System.out.println("Thank you ");
               break;
           default:
        	   System.out.println("Invalid");
           }
           System.out.println();
       	}
       input.close();
    }
}
