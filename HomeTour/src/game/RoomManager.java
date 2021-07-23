package game;

//imported room class from the fixture package
import java.util.List;
import fixtures.Items;
import fixtures.Room;

// This class is where I will input information regarding the location of the rooms and details
public class RoomManager {
// startingRoom object	
	Room startingRoom;
	Room[] rooms;

	// Connection from the main method in the Main class to provide functionality
	public void init() {

		Room homeTheater = new Room("The Home Theater", "an at home movie theater ",
				" Located on the first floor. This square room has the west and east walls Completely covered with speakers for surround sound.\n"
						+ " The floor is covered in a large persian carpet with 5 rows of 3 black leather seats with temperature controls.\n"
						+ " Against the south wall is the movie theater screen with emergency exit, and the IMAX/4K theater projector in located on the north wall of the Home Theater\n");

		// call the getDirections method from the Room class in the encapsulated fields

		List<String> directions = homeTheater.getDirections();

		// rooms method to call directions of the room
		rooms = new Room[directions.size()];

		// Declares which room on the home tour is coming first
		this.startingRoom = homeTheater;

		// calling the room class methods to print the name short description and long
		// description
		Room bedroom = new Room("The Master Bedroom", " A large bedroom",
				"A place where people handle their business and sleep");
		Room bathroom = new Room("The Bathroom", " A bathroom with a toilet and shower",
				"A place where people handle their business");
		Room secondFloor = new Room("The Second Floor", " A large space with a Bedroom and Balcony",
				"The large space enough to fit 2 couches and a loveseat .To the east there is bedroom and to the north is the balcony.");
		Room balcony = new Room("The Balcony", "A large Balcony",
				"a platform enclosed by a wall or balustrade on the outside of a building, with access from an upper-floor door.\n"
						+ "The marble  floor leads South into doorway, next to a staircase that leads up to the second floor.\n"
						+ "North of the doorway is the balcony with a breathtaking view.");
		Room garage = new Room("The Garage", " A large car space with Garage Door",
				"The large carspace enough to fit 6 cars with a noth facing Garage door. To the south there is door leading up the stair case to the first floor.\n"
						+ "to the east and west there is a wall with bike racks and car tools/parts");
		Room firstFloor = new Room("The First Floor", "First Floor", "This is the first floor of the house\n");
		Items painting = new Items("Painting", "Mona Lisa Painting",
				"The Mona Lisa is a half-length portrait painting by Italian artist Leonardo da Vinci.\n"
						+ "Considered an archetypal masterpiece of the Italian Renaissance."+
						"It has been described as \"the best known, the most visited, the most written about, the most sung about, the most parodied work of art in the world");
		Items patioFurniture = new Items("The Patio Furniture", "Patio Furniture Located on the Balcony",
				"Outfit a porch with a wicker sofa and classic rocking chair, both topped with plush cushions, and it can quickly become a second family room during the warm weather months.");
		Items cars = new Items("Cars", "Cars located in the Garage",
				"The garage has cars such as an Aston Martin, Lamborghini Sesto Elemento, Mazda RX-7, and Toyota Supra");
		Items chair = new Items("Chair","The Home Theater Reclining Chair","This recliner chair is fashion and simple imparted an air of elegance to the room." +
				"Built-in springs in both of back and seat with overstuffed padding");
		Items couch = new Items("The Couch","The Second Floor Couch","This couch is a three person leather couch that reclines with cup holders.\n" +
				"The reclining features are automatic and has temperature controls as well");
		Items toilet = new Items("The Toilet","The bathroom inside the Master bedroom","This is where people can have their personal time");
		Items bed = new Items("The Bed","The bed inside the Master bedroom","This is where people can have their sleep");
		// This is where you declare the exits from the room class and the Directions
		// array
		// Exits of the room
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("out")] = bedroom;
		bathroom.setItems(toilet);
		bathroom.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("west")] = secondFloor;
		rooms[directions.indexOf("east")] = bathroom;
		bedroom.setItems(bed);
		bedroom.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("down")] = firstFloor;
		rooms[directions.indexOf("north")] = balcony;
		rooms[directions.indexOf("east")] = bedroom;
		secondFloor.setItems(couch);
		secondFloor.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("south")] = secondFloor;
		balcony.setItems(patioFurniture);
		balcony.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("up")] = firstFloor;
		garage.setItems(cars);
		garage.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("north")] = firstFloor;
		homeTheater.setItems(chair);
		homeTheater.setExits(rooms);
		
		rooms = new Room[directions.size()];
		rooms[directions.indexOf("south")] = homeTheater;
		rooms[directions.indexOf("up")] = secondFloor;
		rooms[directions.indexOf("down")] = garage;
		firstFloor.setItems(painting);
		firstFloor.setExits(rooms);

	}

}
