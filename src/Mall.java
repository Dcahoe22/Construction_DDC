/**
 * Mall Class Programming Project 2 CS131
 * This is a subclass of Business that adds Number of Rented Units, Median Unit Size, and Number of Parking Spaces to the objects
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() {
		numRentedUnits = 0;
		medianUnitSize = 0.0;
		numParkingSpaces = 0;
	}//End Empty Argument Constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet,
		String occupancyGroup, String subgroup, int numRentableUnits, int numRentedUnits, double medianUnitSize, int numParkingSpaces){
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numRentableUnits);
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}//End preferred Constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw() {
		System.out.println("Drawing code for Mall");
	}//End Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		 sb.append("Number Rented Units: "+ getNumRentedUnits()+"\n");
		 sb.append("MedianUnitSize: "+ getMedianUnitSize()+"\n");
		 sb.append("Number Parking Spaces: "+ getNumParkingSpaces()+"\n");
		 sb.append("==============================================================\n");
		 return sb.toString();
	}//End DisplayData Method

	public int getNumRentedUnits() {
		return numRentedUnits;
	}//End getter for NumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}//End setter for NumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	}//End getter for MedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}//End setter for MedianUnitSizes

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}//End getter for NumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}//End setter for NumParkingSpaces
}//Closes Class Mall
