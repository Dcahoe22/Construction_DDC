/**
 * Apartment Class Programming Project 2 CS131
 * This is a subclass of Residential that adds the Number of rentable units, average unit size,
 * and if parking is available for the objects
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() {
		numRentableUnits = 0;
		avgUnitSize = 0.0;
		parkingAvailable = false;
	}//End Empty Argument Constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet,
		String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom,
		int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}//End preferred Constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw() {
		System.out.println("Drawing code for Apartment");
	}//End Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Number RentableUnits: "+ getNumRentableUnits()+"\n");
		sb.append("AverageUnitSize: "+ getAvgUnitSize()+"\n");
		sb.append("Parking Available: "+ isParkingAvailable()+"\n");
		sb.append("==============================================================\n");
		return sb.toString();
	}//End DisplayData Method

	public int getNumRentableUnits() {
		return numRentableUnits;
	}//End getter for NumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}//End setter for NumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}//End getter for AvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}//End setter for AvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}//End getter for ParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}//End setter for ParkingAvailable
}//Closes Class Apartment
