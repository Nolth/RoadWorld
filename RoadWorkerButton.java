package RoadWorkPackage;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;

import edu.sdmesa.cisc191.FishingButton;

/**
 * Lead Author(s): Thomas Woods
 * @author 
 * @author 
 * 
 * Other contributors: N/A
 * 
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *  
 * Version/date: 1.0 4/17/2025
 * 
 * Responsibilities of class: Class that creates the GUI page.
 * 
 */
public class RoadWorkerButton extends JButton
{
	//Set variables.
	private int row;
	private int column;
	private int number;
	
	public RoadWorkerButton()
	{
		JButton SearchButton = new JButton();
		
		setText("Search");
		setBackground(Color.WHITE);
		Font font = new Font("SansSerif", Font.ITALIC, 24);
		setFont(font);
	}
}
