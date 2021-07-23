package fixtures;

// parent of all classes 
public abstract class Fixture {

	private String name;
	private String shortDescription;
	private String longDescription;
	
//constructor  object to be so that room manager can inherit it
	public Fixture(String name, String shortDescription, String longDescription) {
	
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}
public Fixture() {
}
	// pulls the name and description of the room through this abstract class
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}
	@Override
	public String toString() {

		return  name +"\n" +shortDescription + "\n"
				+ longDescription;
	}

}
