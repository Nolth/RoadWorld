package RoadWorkPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoadWorkFile
{
	private static Scanner scan = null;
	private static BufferedReader scanBuffered = null;
	private static ArrayList<String> myList = new ArrayList<>();
	private int count;
	
    public String readRoadResults() throws FileNotFoundException {
        StringBuilder content = new StringBuilder();

        try (Scanner scan = new Scanner(new File("DOOOD.csv"))) 
        {	  
        	//Do no put Print statements inside while, it will crash.
            while (scan.hasNextLine()) 
            {
            	StringBuilder HH = content.append(scan.nextLine()).append("\n");
          	  	myList.add(HH.toString());
          	  	count++;
          	  	HH.setLength(0);
            }
            System.out.println("List: " + myList.get(5));
        }

        return content.toString();
    }
    
    
    public ArrayList<String> getmyList()
    {
		return myList;
    }
    
}
