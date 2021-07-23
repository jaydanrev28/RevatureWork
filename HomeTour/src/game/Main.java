package game;

import fixtures.Items;
import fixtures.Room;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Calling the room manager class, player class
		System.out.println(
				"Welcome to Home Tour! This is a gme where you can enter different rooms and interact with other objects in those rooms.\n"
						+ "If you want to enter a room please type 'go' and the direction you would like to take to enter a room.\n"
						+ "If you would like to interact with an item type 'interact' and the item you would like to interact with.\n"
						+ "If you would like to end the game type 'quit'. Thank you! \n ");
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
			System.out.println("Item: \n" + item.getName());
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

		case "go":
			player.setCurrentRoom(player.getCurrentRoom().getExit(input[1]));
			break;

		case "interact":
			System.out.println(player.getCurrentRoom().getItems().toString());
			break;
			
		case "quit":
			System.out.println("Thank you");
			System.exit(0);
			break;
		}

	}
}