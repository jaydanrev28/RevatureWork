package game;

import fixtures.Room;
// import methods from the room class in fixtures
public class Player {
	
   private Room currentRoom;
// The e  from the room class so that the player knows where they are 
   
   public Player(Room currentRoom) {
       super();
       this.currentRoom = currentRoom;
   }

   public Room getCurrentRoom() {
       return currentRoom;
   }

   public void setCurrentRoom(Room currentRoom) {
       this.currentRoom = currentRoom;
   }



}