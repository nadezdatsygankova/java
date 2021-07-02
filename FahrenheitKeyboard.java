/*//Author: Nadezda Tsygankova
//ID: 152949194
//Assignment#2 -Part3 Page 636, Question 14.12(25%)
Write a temperature conversion application that converts from Fahrenheit to Celsius.
 The Fahrenheit temperature should be entered from the keyboard (via a JTextField). 
A JLabel should be used to display the converted temperature.
 * 
 * 
 * */



package Assignment2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class FahrenheitKeyboard extends JFrame implements ActionListener{
	private JPanel panel;
	private JTextField jT;
	private JLabel celcJLabel;

	public FahrenheitKeyboard(String title) {
		// TODO Auto-generated constructor stub
		setLayout(new BorderLayout());
		//add panel for label, textfield, button, label
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		panel.add(new JLabel("Enter a degree in Fahrenheit: "));
		jT = new JTextField(6);
		panel.add(jT);
		JButton button = new JButton("Ok");
		//add listener for button
		button.addActionListener(this);
		panel.add(button);
		
		
		//label for output information
		celcJLabel = new JLabel("A degree in Celsius");
		panel.add(celcJLabel,BorderLayout.SOUTH);
		
		this.add(panel,BorderLayout.CENTER);
		this.setTitle(title);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
		
	}


	public static void main(String[] args) {
		
		FahrenheitKeyboard prin = new FahrenheitKeyboard("Fahrenheit Keyboard");
		
	}


	//function to calculate Fahrenheit to Celsius and output in the celcJLabel
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//insert text and convert text to double 
		double fahr = Double.parseDouble(jT.getText());
		double celcius = ((5.0 / 9.0) * (fahr - 32.0));
		celcJLabel.setText(String.valueOf(celcius));
	}
	


}
