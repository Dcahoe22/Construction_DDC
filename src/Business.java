/**
 * Business Class Programming Project 2 CS131
 * THis is the subclass of Building which adds the Number of Rentable Units to the objects
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Business extends Building{
	protected int numRentableUnits;
	
	//Instance variables
	public Business() {
		numRentableUnits = 0;
	}//End Empty Argument Constructor
	
	public Business(String projectName, String completeAddress, double totalSquareFeet, 
			String occupancyGroup, String subgroup, int numRentableUnits) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
		this.numRentableUnits = numRentableUnits;
	}//End preferred Constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw() {
		System.out.println("Drawing code for Business");
	}//End Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		 StringBuilder sb = new StringBuilder(super.displayData());
		 sb.append("Number Rentable Units: "+ getNumRentableUnits()+"\n");
		 sb.append("==============================================================\n");
		 return sb.toString();
	}//End DisplayData Method

	//Getters and Setters
	public int getNumRentableUnits() {
		return numRentableUnits;
	}//End getter for NumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//End setter for NumRentableUnits;	
}//Closes Class Business
