package game;
//imported room class from the fixture package
import java.util.List;

import fixtures.Room;
// This class is where I will input information regarding the location of the rooms and details
public class RoomManager {
// startingRoom object	
   Room startingRoom;
   Room[] rooms;
   //Connection from the main method in the Main class to provide functionality
   public void init() {

      
       Room homeTheater = new Room("The Home Theater", "an at home movie theater ",
               "This square room has the west and east walls Completely covered with speakers for surround sound,\n"
                       + " The floor is covered in a large persian carpet with 5 rows of 3 black leather seats with temperature controls.\n"
                       + " Against the south wall is the movie theater screen with emergency exit, and the IMAX/4K theater projector in located on the north wall of the Home Theater\n");
      
       // call the getDirections method from the Room class in the encapsulated fields 
      
       List<String> directions = homeTheater.getDirections();
       
       // rooms method to call directions of the room
       rooms = new Room[directions.size()];
      
       //Declares which room on the home tour is coming first 
       this.startingRoom = homeTheater;
     
       //calling the room class methods to print the name short description and long description
       Room balcony = new Room("The Balcony", "A large Balcony",
               "a platform enclosed by a wall or balustrade on the outside of a building, with access from an upper-floor door.\n"
                       + "The marble  floor leads South into doorway, next to a staircase that leads up to a third floor.\n"
                       + "North of the doorway is the balcony with a breathtaking view.");
       this.rooms[1] = balcony;
       Room garage = new Room("The Garage", " A large car space with Garage Door",
               "The large carspace enough to fit 6 cars with a noth facing Garage door. To the south there is door leading up the stair case to the first floor.\n"
                       + "to the east and west there is a wall with bike racks and car tools/parts");
       this.rooms[2] = garage;
       Room interiorDoor = new Room("The Interior", "an interior door",
               "This is an interior door which has all walls\n");
       	
       Room garageDoor = new Room("The Garage Door", "Garage Door",
               "This is the exterior door of the Garage\n");
       Room emergencyExit = new Room("The Emergency Exit", "Emergency Exit",
               "This is the exterior door of the Home Theater\n");
  //This is where you declare the exits from the room class and the Directions array
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("South")] = interiorDoor;
       // Exits of the room
       balcony.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("South")] = interiorDoor;
       rooms[directions.indexOf("North")] = garageDoor ;
       garage.setExits(rooms);
       rooms = new Room[directions.size()];
       rooms[directions.indexOf("North")] = interiorDoor;
       rooms[directions.indexOf("West")] = emergencyExit;
       homeTheater.setExits(rooms);
   }
}
