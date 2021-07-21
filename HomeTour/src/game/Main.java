package game;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   //Calling the room manager class, player class
       RoomManager manager = new RoomManager();
       manager.init();
       Player player = new Player(manager.startingRoom);
       while (true) {
           printRoom(player);
           parse(collectInput(), player);
       }
   }
// prints the method from the player class 
   public static void printRoom(Player player) {
       System.out.println(player.getCurrentRoom().toString());
   }
// Scanner method is where you will pull all of the values 
   public static String[] collectInput() {
       Scanner s = new Scanner(System.in);
       	String manager = s.nextLine();
       return s.nextLine().split(" ");
    
       
   }
  
// the currentRoom shows what room you are in in the player class
   public static void parse(String[] input, Player player) {
       switch (input [0]) {
       case "go":
           player.setCurrentRoom(player.getCurrentRoom().getExit(input[1]));
           break;

       case "next":
    	   
    	   break;
       }
       
   }
}