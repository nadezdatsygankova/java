/*Author: Nadezda Tsygankova
//ID: 152949194
 * Midterm 
 * Question 6. 6.	Design the following GUI( No functionality is required)
 * 
 * 
 * */


package Midterm;

import java.awt.*;
import javax.swing.*;


public class AdressBook extends JFrame{
	
	//panel for First and Last Name
	private JPanel panelNameAdd;
	//panel for City, Province, Postal Code
	private JPanel panelAddress;
	//panel for buttons	
	private JPanel panelButtons;
	
	//Province arr
	String provString [] = {" ", " Ontario", "Manitoba"};
	
	public AdressBook(String title) {
		setLayout(new BorderLayout());
		
		//panelName consists  First Name and Last Name and Address
		panelNameAdd = new JPanel();
		panelNameAdd.setLayout(new GridLayout(3,1));
		//use for First Name
		JPanel panelNameF = new JPanel();
		panelNameF.setLayout(new FlowLayout());
		//label and Text Field for First Name
		panelNameF.add(new JLabel("First Name"));
		panelNameF.add(new JTextField(45));
		panelNameAdd.add(panelNameF);
		
		//label and Text Field  for Last Name
		JPanel panelNameL = new JPanel();
		panelNameL.setLayout(new FlowLayout());
		panelNameL.add(new JLabel("Last Name"));
		panelNameL.add(new JTextField(45));
		panelNameAdd.add(panelNameL);
		
		//panel for Address 
		panelAddress = new JPanel();
		panelAddress.setLayout(new GridLayout(1,3,2,5)); 
		//panel for city
		JPanel cityJPanel =new JPanel();
		cityJPanel.setLayout(new FlowLayout(1,2,7));
		cityJPanel.add(new JLabel("City:"));
		cityJPanel.add(new JTextField(9));
		//panel for province
		JPanel ProvinceJPanel =new JPanel();
		ProvinceJPanel.setLayout(new FlowLayout(1,2,7));
		ProvinceJPanel.add(new JLabel("Province:"));
		 JComboBox comboB= new JComboBox(provString);
		 comboB.setBackground(Color.WHITE);
		ProvinceJPanel.add(comboB);
		//panel for postal code 
		JPanel PostCodeJPanel =new JPanel();
		PostCodeJPanel.setLayout(new FlowLayout(1,2,7));
		PostCodeJPanel.add(new JLabel("Postal Code:"));
		PostCodeJPanel.add(new JTextField(9));	
		
		
		panelAddress.add(cityJPanel);
		panelAddress.add(ProvinceJPanel);
		panelAddress.add(PostCodeJPanel);
		
		panelNameAdd.add(panelAddress);
		
		//panel for Buttons
		panelButtons = new JPanel();
		panelButtons.setLayout(new GridLayout(1,6,10,5));
		panelButtons.add(new JButton("Add"));
		panelButtons.add(new JButton("First"));
		panelButtons.add(new JButton("Next"));
		panelButtons.add(new JButton("Previous"));
		panelButtons.add(new JButton("Last"));
		panelButtons.add(new JButton("Update"));
		
		
		this.add(panelNameAdd,BorderLayout.NORTH);
		this.add(panelButtons,BorderLayout.SOUTH);
		this.setTitle(title);
		this.setSize(600,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
		
	}
	
	public static void main(String[] args) {
		AdressBook newAdressBook = new AdressBook("Address Book");
	}
	
	

}
