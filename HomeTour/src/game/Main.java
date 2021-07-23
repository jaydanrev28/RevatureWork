package game;

import fixtures.Items;
import fixtures.Room;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Calling the room manager class, player class

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
		for (int i = 0; i < player.getCurrentRoom().getItems().size(); i++) {
			Items item = player.getCurrentRoom().getItems().get(i);
			System.out.println(item.getName());
		}
	}

// Scanner method is where you will pull all of the values 
	public static String[] collectInput() {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine().toLowerCase();
		String[] strVar = input.split(" ");
		return strVar;
		
	}

// the currentRoom shows what room you are in in the player class
	public static void parse(String[] input, Player player) {

		// input[0] = input[0].toLowerCase();
		switch (input[0]) {
		case "begin":
			 System.out.println("Type in a number and press Enter...");
		        break;
		case "go":
			player.setCurrentRoom(player.getCurrentRoom().getExit(input[1]));
			break;

		case "interact":
			System.out.println(player.getCurrentRoom().getItems().toString());
			break;
		}

	}
}