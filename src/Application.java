/**
 * Application Class Programming Project 2 CS131
 * This class is to test all constructors/methods/getters and setters/ and toString for the objects
 * @author dalec
 *Version 2
 *Spring 2020
 *2/17/20
 */
public class Application {
	
	public static void main(String[] args){
		/**
		 * Uses the Building Class to display an object with its specified instance variables
		 */
		Building one= new Building("Marks Kitchen", "123 HillTop Rd, Louisville, Ky 40000", 1567.50, "Mercantile","M");
		one.draw();
		System.out.println(one.displayData());
		
		/**
		 * Uses the Business Class to display an object with its specified instance variables
		 */
		Business two= new Business("Heights Roofing", "367 Heights Lane, Louisville, Ky 40000", 3786.20, "Business","B", 5);
		two.draw();
		System.out.println(two.displayData());
		
		/**
		 * Uses the Mall Class to display an object with its specified instance variables
		 */
		Mall three= new Mall("Saint Pauls Mall", "678 Heart Lane, Louisville, Ky 40000", 70372.67, "Mercantile","M", 15, 9, 945.5, 750);
		three.draw();
		System.out.println(three.displayData());
		
		/**
		 * Uses the Residential Class to display an object with its specified instance variables
		 */
		Residential four= new Residential("Past Gill", "268 Jacksonville Ave, Louisville, Ky 40000", 1437.5, "Residential","R-1", 5, 3, true);
		four.draw();
		System.out.println(four.displayData());
		
		/**
		 * Uses the Apartment Class to display an object with its specified instance variables
		 */
		Apartment five= new Apartment("Sights Pool", "Force File Road, Louisville, Ky 40000", 23576.6, "Residential","R-3", 2, 1, false, 24, 950.5, true);
		five.draw();
		System.out.println(five.displayData());
		
		/**
		 * Uses the SingleFamilyHome Class to display an object with its specified instance variables
		 */
		SingleFamilyHome six= new SingleFamilyHome("Krockers Mansion", "475 Lakeview Street, Louisville, Ky 40000", 3489.4, "Residential","R-2", 7, 4, true,true);
		six.draw();
		System.out.println(six.displayData());
	}//Ends Main Method
}//Closes Class Application
