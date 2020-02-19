/**
 * SingleFamilyHome Class Programming Project 2 CS131
 * This is a subclass of Residential that adds if it is true for a garage to the objects
 * This class 
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class SingleFamilyHome extends Residential {
	private boolean garage;
	
	public SingleFamilyHome() {
		garage = false;
	}//End Empty Argument Constructor
	
	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet,
			String occupancyGroup, String subgroup, int numBedrooms, int numBathrooms, boolean laundryRoom, boolean garage) {
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup, numBedrooms, numBathrooms, laundryRoom);
		this.garage = garage;
	}//End preferred Constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw() {
		System.out.println("Drawing code for SingleFamilyHome");
	}//End Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder(super.displayData());
		sb.append("Garage: "+ isGarage()+"\n");
		sb.append("==============================================================\n");
		return sb.toString();
	}//End DisplayData Method

	public boolean isGarage() {
		return garage;
	}//End getter for Garage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}//End setter for Garage
}//Closes Class SingleFamilyHome
