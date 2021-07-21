package fixtures;


	

	import java.util.Arrays;
	import java.util.List;

	public class Room  extends Fixture {
		// Room exit array
	   private Room[] exits;
	   //Directions array list 
	   private List<String> directions = Arrays.asList("North", "South", "East", "West");
//inherited methods from fixtures class 
	   public Room(String name, String shortDescription, String longDescription) {
	       super(name, shortDescription, longDescription);
	   //this declares the exit array with the directions 
	       this.exits = new Room[directions.size()];
	       // TODO Auto-generated constructor stub
	   }
//Encapsulated fields for exit and exit directions
	   public Room[] getExits() {
	       return exits;
	   }

	   public Room getExit(String direction) {
	       return exits[directions.indexOf(direction)];
	   }
	  

	   public List<String> getDirections() {
	       return directions;
	   }

	   public void setExits(Room[] exits) {
	       this.exits = exits;
	   }
   // This is the String representation of the exits  and directions object. This how it will display in console
	   @Override
	   public String toString() {
	       String exits = "";
	       for (String direction : this.directions) {
	           if(getExit(direction)!=null)
	           exits += (direction + ": " + getExit(direction).getShortDescription() + "\n");
	       }
	       return this.getName() + "\n\n" + this.getLongDescription() + "\n\n" + "Exits:\n" + exits;
	   }

	}

