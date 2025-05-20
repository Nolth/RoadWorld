package RoadWorkPackage;

import java.awt.List;import java.io.FileNotFoundException;
/**
 * Lead Author(s):
 * @author Thomas Woods
 * @author Mateo Guerrero
 * 
 * Other contributors: N/A
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 1.0 4/17/2025
 * 
 * Responsibilities of class: Sub class of Vehicle, SuperClass of GasCar, ElectricCar, and HybridCar 
 * 
 */
public abstract class RoadWorker
{
	private static String objectID;
	private static String title;
	private static String startTime;
	private static String extensionPhone;
	
	public RoadWorker(String objectID, String title, String startTime, String extensionPhone)
	{
		this.objectID = objectID;
		this.title = title;
		this.startTime = startTime;
		this.extensionPhone = extensionPhone;
	}
	
	
	/**
	 * Purpose: To test thing and the code, may be remove at a future date.
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException 
	{
	    new RoadWorkerGUI();
	    new RoadWorkoOrganizer(objectID, title, startTime, extensionPhone);
	}
	
	
}