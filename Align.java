/*//Author: Nadezda Tsygankova
//ID: 152949194
//Assignment#2 -Part2 Question 14.9
Create the following GUI. You do not have to provide any functionality.
 * 
 * 
 * */

package Assignment2;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.*;

public class Align extends JFrame{
	private JButton jbtOk;
	private JButton jbtCancel;
	private JButton jbtHelp;
	private JPanel panelButton;
	private JPanel panel1;
	
	public Align(String title) {
		setLayout(new GridLayout(0,2,10,10));

         panel1 =new JPanel(); //for checkbox and x and y      
         panelButton = new JPanel();//for buttons

		//panel1
         JCheckBox checkbox1 = new JCheckBox("Snap to Grid ");
         checkbox1.setBounds(100,100, 50,50);
		panel1.add(checkbox1);
        panel1.add(new JLabel("X:"));	
		panel1.add(new JTextField("8",3));
		JCheckBox checkbox2 = new JCheckBox("Show Grid     ");
        checkbox2.setBounds(100,100,50,50);
		
		panel1.add(checkbox2);
        panel1.add(new JLabel("Y:"));
		panel1.add(new JTextField("8",3));
		
		//panelButton
		
		panelButton.setLayout(new GridLayout(3,1,6,6));//gridlayout for button
		jbtOk = new JButton("Ok");	
		panelButton.add(jbtOk);
		
		jbtCancel = new JButton("Cancel");
		panelButton.add(jbtCancel);
		
		jbtHelp = new JButton("Help");
		panelButton.add(jbtHelp);
		
		this.add(panel1);
		this.add(panelButton);
		this.setTitle(title);
		this.setSize(400,150);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
}
	
	public static void main(String[] args) {
		Align algAllgn = new Align("Align");
	}
	
	
}
