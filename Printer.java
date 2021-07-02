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

public class Printer extends JFrame{
	private JPanel panelButtonR;
	private JPanel panel1;
	private JPanel checkbox1;
	private JPanel checkbox2;
	private JPanel lastCheckbox;
	private JPanel nameJPanel;
	private JPanel box;
	
	String quality [] = {"Hight","Low"}; 
	public Printer(String title) {
		setLayout(new BorderLayout());
		//panel for name
		nameJPanel= new JPanel();
		nameJPanel.setLayout(new GridLayout(1,1,10,0));
		nameJPanel.add(new JLabel("Printer: MyPrinter"));
		//panel for buttons
		panelButtonR= new JPanel();
		panelButtonR.setLayout(new GridLayout(4,1,1,10));//gridlayout for button
		panelButtonR.add(new JButton("Ok"));
		panelButtonR.add(new JButton("Cancel"));
		panelButtonR.add(new JButton("Setup ..."));
		panelButtonR.add(new JButton("Help"));
		
		//panel for center block
		panel1 =new JPanel();
		panel1.setLayout(new GridLayout(1,5,1,1));
		panel1.add(new JTextField());
		
		//checkbox for image, text, code, inside panel1
		checkbox1 =new JPanel();
		panel1.add(checkbox1);
		
		checkbox1.setLayout(new GridLayout(3,1,1,1));
		checkbox1.add(new JCheckBox("Image"));
		checkbox1.add(new JCheckBox("Text"));
		checkbox1.add(new JCheckBox("Code"));
		
		//checkbox for selection,all,applet,inside panel1
		checkbox2 =new JPanel();
		panel1.add(new JTextField());
		panel1.add(checkbox2);
		
		
		checkbox2.setLayout(new GridLayout(3,1,1,1));
		checkbox2.add(new JRadioButton("Selection"));
		checkbox2.add(new JRadioButton("All",true));
		checkbox2.add(new JRadioButton("Applet"));
		
		panel1.add(new JTextField());
		
		//checkbox for Print-Quality 
		lastCheckbox =new JPanel();
		lastCheckbox.setLayout(new FlowLayout());
		lastCheckbox.add(new JLabel("Print Quality"));
		lastCheckbox.add( new JComboBox(quality));
		lastCheckbox.add(new JCheckBox("Print to File"));
		
		//centeral block for all except buttons
		box  = new JPanel();
		box.setLayout(new GridLayout(3,1,4,4));
		box.add(nameJPanel);
		box.add(panel1);
		box.add(lastCheckbox);
		
		this.add(box,BorderLayout.CENTER);
		this.add(panelButtonR,BorderLayout.EAST );
		this.setTitle(title);
		this.setSize(400,200);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
	}
	
	public static void main(String[] args) {
		Printer prin = new Printer("Printer");
	}
	

}
