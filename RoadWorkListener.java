package RoadWorkPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * listen to the button and looks what is in the search bar.
 */
public class RoadWorkListener implements ActionListener
{
	private RoadWorkerGUI rwGui;
	private JTextField rwltextField;
	private JTextArea rwltextArea;
	private String text;
	
	/**
	 * Main Method
	 * @param roadworkerGui
	 */
	public RoadWorkListener(RoadWorkerGUI roadworkerGui)
	{
		rwGui = roadworkerGui;
		
		rwltextField = rwGui.getRWSearch();
		
		rwltextArea = rwGui.getRWResults();
		
		text = rwltextField.getText();
	}
	
	/**
	 * Listens to the Button.
	 */
	public void actionPerformed(ActionEvent e) 
	{
		//Get what is currently in the search bar.
		text = rwltextField.getText();
		//Testing
		System.out.println("text: " + text);
		//If Text.contains dd.
		if (text.contains("Who?"))
		{
			System.out.println("text:");
			//Set the text into the text area to dDDD.
			rwltextArea.setText("Thomas Woods and Mateo Guerrero");
		}
		//Afterward, set Search Bar Text to Enter Text. 
		rwltextField.setText("Enter Text");
	}
}
