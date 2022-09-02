/*//Author: Nadezda Tsygankova

 Create the following GUI. You do not have to provide any functionality.
 * 
 * 
 * */



package Assignment2;

import java.awt.*;
import javax.swing.*;

public class Calculator extends JFrame {
	private JPanel panelButton;
	private JTextField panelText;
	
	public Calculator(String title) {
		setLayout(new BorderLayout());
		
		//panel for JTextField
		panelText = new JTextField(10);
		//panel for buttons
		panelButton =new JPanel();
		

		//add buttons
		panelButton.setLayout(new GridLayout(4,4,1,1));
			panelButton.add(new JButton("7"));
			panelButton.add(new JButton("8"));
			panelButton.add(new JButton("9"));
			panelButton.add(new JButton("/"));
			panelButton.add(new JButton("4"));
			panelButton.add(new JButton("5"));
			panelButton.add(new JButton("6"));
			panelButton.add(new JButton("*"));
			panelButton.add(new JButton("1"));
			panelButton.add(new JButton("2"));
			panelButton.add(new JButton("3"));
			panelButton.add(new JButton("-"));
			panelButton.add(new JButton("0"));
			panelButton.add(new JButton("."));
			panelButton.add(new JButton("="));
			panelButton.add(new JButton("+"));
		
			
		
		this.add(panelText,BorderLayout.NORTH);
		this.add(panelButton,BorderLayout.CENTER);
		this.setTitle(title);
		this.setSize(250,250);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
	}
	
	public static void main(String[] args) {
		Calculator newCal = new Calculator("Calculator");
		
		
		
	}

}
