import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Assignment2.FahrenheitKeyboard;

public class Q4 extends JFrame  implements ActionListener{
	
	private JPanel panel;
	private JTextField ssnTextFiel;
	private JTextField courseIdTextFiel;
	private JLabel ssn;
	private JLabel courseId;
	
	public Q4 (String title) {
		setLayout(new BorderLayout());
		
		//add panel for label, textfield, button, label
				panel = new JPanel();
				panel.setLayout(new FlowLayout(1));
				panel.add(new JLabel("SSN: "));
				ssnTextFiel = new JTextField(6);
				panel.add(ssnTextFiel);
				
				courseId = new JLabel("Course ID");
				panel.add(courseId);
				
				courseIdTextFiel = new JTextField(6);
				panel.add(courseIdTextFiel);
				
				
				
				JButton button = new JButton("Show Grade");
				//add listener for button
				button.addActionListener(this);
				panel.add(button);
				
				this.add(panel,BorderLayout.NORTH);
				this.setTitle(title);
				this.setSize(400,100);
				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setVisible(true);
				this.setResizable(true);
		
	}
	public static void main(String[] args) {
		Q4 prin = new Q4("FindGrade");
	}
	

}
