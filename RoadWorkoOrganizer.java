package RoadWorkPackage;
import java.util.ArrayList;

/**
 * Organizes the the stuff in myList and gathers what we want.
 */
public class RoadWorkoOrganizer extends RoadWorker
{
	private RoadWorkFile file = new RoadWorkFile();
	private ArrayList<String> organizedList = new ArrayList<>();
	
	
	public RoadWorkoOrganizer(String objectID, String title, String startTime, String extensionPhone) 
	{
		super(objectID, title, startTime, extensionPhone);
		this.organizedList = this.file.getmyList();
	}
}
