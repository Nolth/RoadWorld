package RoadWorkPackage;
import java.io.StringReader;
import java.util.ArrayList;

/**
 * Organizes the the stuff in myList and gathers what we want.
 */
public class RoadWorkoOrganizer extends RoadWorker
{
	private RoadWorkFile file = new RoadWorkFile();
	private ArrayList<String> organizedList = new ArrayList<>();
	private int num = 0;
	private int checkNum;
	private boolean inQuotes = false;
	private String s;
	private String g;
	private int i;
	
	public RoadWorkoOrganizer(String objectID, String title, String startTime, String extensionPhone) 
	{
		super(objectID, title, startTime, extensionPhone);
		this.organizedList = this.file.getmyList();
		
		System.out.println("List numbers: " + organizedList.size());
		System.out.println("List: " + organizedList.get(56));
		System.out.println("List Split: ");
		//int checkNum = 0;
		for (i = 1; i < organizedList.size(); i++)
		{
			//System.out.println("DDD");
			s = organizedList.get(i);
			g = organizedList.get(i);
			//System.out.println("s: " + s);
			listStorter();
		}
	}
	
	/**
	 * Sorts out the list and gets, the objectID, title, startTime, and the phone number.
	 */
	public void listStorter()
	{
		//int checkNum = 0;
		StringBuilder reader = new StringBuilder();
		boolean C1 = false;
		boolean C3 = false;
		boolean C4 = false;
		boolean C8 = false;
		
		//For every charter (readNumber) in the String s.
		for (char readNumber : s.toCharArray()) 
		{
            if (readNumber == '"') 
            {
                inQuotes = !inQuotes;
            } 
            else if (readNumber == ',' && !inQuotes) 
            {
            	//Set what number it is for testing proposes.
            	num++;
            	switch (num) 
            	{
            		case 1:
            			//System.out.println(num + ": " + reader.toString());
            			C1 = true;
            			break;
            		case 3:
            			//System.out.println(num + ": " + reader.toString());
            			C3 = true;
            			break;
            		case 4:
            			//System.out.println(num + ": " + reader.toString());
            			C4 = true;
            			break;
            		case 8:
            			C8 = true;
            			//System.out.println(num + ": " + reader.toString());
            			break;
            	}
            	
            	reader.setLength(0);
            } 
            else 
            {
            	reader.append(readNumber);
            }
        }
		
		if (C1 == false)
		{
			checkNum++;
			System.out.println("C1: ");
			System.out.println("Check Numer: " + checkNum);
			System.out.println(i + ": " + reader.toString());
			System.out.println("g: " + g);
		}
		if (C3 == false)
		{
			checkNum++;
			System.out.println("C3: ");
			System.out.println("Check Numer: " + checkNum);
			System.out.println(i + ": " + reader.toString());
			System.out.println("g: " + g);
		}
		if (C4 == false)
		{
			checkNum++;
			System.out.println("C4: ");
			System.out.println("Check Numer: " + checkNum);
			System.out.println(i + ": " + reader.toString());
			System.out.println("g: " + g);
		}
		if (C8 == false)
		{
			checkNum++;
			System.out.println("C8: ");
			System.out.println("Check Numer: " + checkNum);
			System.out.println(i + ": " + reader.toString());
			System.out.println("g: " + g);
		}
		//System.out.println("");
		num = 0;
	}
}
