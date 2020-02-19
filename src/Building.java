/**
 * Building Class Programming Project 2 CS131
 * This is the superclass that will be used for all of the objects
 * @author dalec
 *Construction Project
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Building {
	
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	//Instance variables
	public Building() {
		projectName = "";
		completeAddress = "";
		totalSquareFeet = 0.0;
		occupancyGroup = "";
		subgroup = "";
	}//End Empty Argument Constructor
	
	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup, String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}//End preferred constructor
	
	/**
	 * This method prints a line for the object
	 */
	public void draw(){
		System.out.println("Drawing Code for Building");
	}//Ends Draw Method
	
	/**
	 * This method will display the instance variables once printed
	 * 
	 */
	public String displayData() {
		StringBuilder sb = new StringBuilder("==============================================================\n");
			sb.append("ProjectName: "+ getProjectName()+"\n");
			sb.append("Complete Address: "+ getCompleteAddress()+"\n");
			sb.append("TotalSquareFeet: "+ getTotalSquareFeet()+"\n");
			sb.append("Occupancy Group: "+ getOccupancyGroup()+"\n");
			sb.append("Sub Group: "+ getSubgroup()+"\n");
			sb.append("==============================================================\n");
			return sb.toString();
	}//End DisplayData Method
	
	//Getters and Setters
	public String getProjectName() {
		return projectName;
	}//End getter for ProjectName

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}//End setter for ProjectName

	public String getCompleteAddress() {
		return completeAddress;
	}//End getter for CompleteAddress

	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}//End setter for CompleteAddress

	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}//End getter for TotalSquareFeet

	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}//End setter for TotalSquareFeet

	public String getOccupancyGroup() {
		return occupancyGroup;
	}//End getter for OccupancyGroup

	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}//End setter for OccupancyGroup

	public String getSubgroup() {
		return subgroup;
	}//End getter for subgroup

	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}//End setter for subgroup

	@Override
	public String toString() {
		return "Building [completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet
				+ ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}//End toString
}//Closes Building Class