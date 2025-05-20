package RoadWorkPackage;

import java.awt.BorderLayout;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
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
		System.out.println("DdDd");
		JFrame rwPanel = new JFrame();
		rwPanel.setPreferredSize(new Dimension(500,500));
		
		JPanel Sliders = new JPanel();
		Sliders.setLayout(new BorderLayout());
		//Adds Button
		JButton RWButton = new RoadWorkerButton();
		JTextField RWSearch = new JTextField();
		
		RWSearch.setPreferredSize(new Dimension(500,20));
		
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
		
		Sliders.add(RWButton, BorderLayout.SOUTH);
		
		Sliders.add(RWSearch, BorderLayout.CENTER);
		this.add(Sliders, BorderLayout.SOUTH);
		//add(RWButton);
		
		rwPanel.setSize(500, 500);
		
		setName("Gone Fishing");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
}
