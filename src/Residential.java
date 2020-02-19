/**
 * Residential Class Programming Project 2 CS131
 * This is a subclass of Building that add the number of bedrooms, bathrooms and laundry rooms to the objects
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Residential extends Building{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() {
		numBedrooms = 0;
		numBathrooms = 0;
		laundryRoom = false;
	}//End Empty Argument Constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet,
		String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}//End preferred Constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw() {
		System.out.println("Drawing code for Residential");
	}//End Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number Bedrooms: "+ getNumBedrooms()+"\n");
		sb.append("Number Bathrooms: "+ getNumBathrooms()+"\n");
		sb.append("LaundryRoom: "+ isLaundryRoom()+"\n");
		sb.append("==============================================================\n");
		return sb.toString();
	}//End DisplayData Method

	public int getNumBedrooms() {
		return numBedrooms;
	}//End getter for Number Bedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}//ENd setter for Number Bedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}//End getter for Number Bathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}//End setter for Number Bathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}//End getter  for LaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}//End setter for LaundryRoom
}//Closes Class Residential

