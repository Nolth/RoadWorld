package RoadWorkPackage;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

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
 

public class RoadWorkerGUI extends JFrame
{
	private RoadWorkFile file = new RoadWorkFile();
	
	public RoadWorkerGUI() throws FileNotFoundException
	{
		super("Road Worker Search");
		setPreferredSize(new Dimension(500,200));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel rwPanel = new JPanel(new BorderLayout(10, 10));
	    rwPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
		
	    JLabel searchLabel = new JLabel("Enter search terms for road work:");
        rwPanel.add(searchLabel, BorderLayout.NORTH);
	    
        // Center panel holds the text field
        JTextField RWSearch = new JTextField();
        RWSearch.setPreferredSize(new Dimension(0, 30));      // Height only
        RWSearch.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        rwPanel.add(RWSearch, BorderLayout.CENTER);
		
		//Adds Button
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton RWButton = new RoadWorkerButton();
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 0, 0, 0));
        buttonPanel.add(RWButton);
        rwPanel.add(buttonPanel, BorderLayout.SOUTH);
        
		try 
		{
			String results = file.readRoadResults();
			System.out.println("File Got Through");
			//System.out.println(results);
		} 
		catch (FileNotFoundException e) 
		{
			throw new FileNotFoundException();
		}
		
		add(rwPanel);
		pack();
		setVisible(true);
	}
	
}
