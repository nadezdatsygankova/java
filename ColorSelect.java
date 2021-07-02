/*//Author: Nadezda Tsygankova
//ID: 152949194
//Assignment#2 -Part2 Page 636, Question 14.11(25%)
Create the following GUI. You do not have to provide any functionality.
 * 
 * 
 * */


package Assignment2;

import java.awt.*;

import javax.swing.*;


public class ColorSelect extends JFrame{

	private JPanel panelButton;
	private JPanel panel1;
	//array for combo box
	String colorStrings []={"RED","ORANGE","YELLOW","PINK","GREEN"};
	
	public ColorSelect(String title) {
		setLayout(new BorderLayout());
		//add Combobox for array
		this.add(new JComboBox(colorStrings), BorderLayout.NORTH);
		
		//panel for checkbocks
		  panel1 =new JPanel();
		  panel1.add(new JCheckBox("Background"));
		  panel1.add(new JCheckBox("Foreground"));
		
		
		//panel for buttons
		panelButton =new JPanel();
		panelButton.add(new JButton("OK"));
		panelButton.add(new JButton("Cancel"));
		
		
		this.add(panel1,BorderLayout.CENTER);
		this.add(panelButton,BorderLayout.SOUTH);
		this.setTitle(title);
		this.setSize(400,150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
	}
	
	public static void main(String[] args) {
		ColorSelect colorS = new ColorSelect("ColorSelect");
	}
	
	

}
