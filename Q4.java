/*//Author: Nadezda Tsygankova
//ID: 152949194
//Final exam  -Q4
 In this question your task is to design the following GUI. In this GUI, you are required to enter the
SSN(Social security number) and the course ID of a specific student. The information of the SSN and the
course ID should be saved in a table on the database called Student. Then, you can choose the columns
in the database. Once the user enters the SSN and the course ID, clicking the show Grade button should
get the grade of the given Student and show the grade in the console.
 * Once you click in the show grade, on the frame, the grade should be shown as follow:
Student_full name : Grade
Table structure:
First_name, Last_name, student_id, SSN, course_id, Grade
 * 
 * 
 * FOR TEST
 * 1)
 * SSN: 111111111
 * Course ID : 152
 *  
 *  Answer: Elsa Bin:A
 * 2)
 * SSN: 121111111
 * Course ID : 152
 * 
 * Answer: Ben Rock:B
 * */



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;



public class Q4 extends JFrame  implements ActionListener{
	
	private JPanel panel;
	private JTextField ssnTextField;
	private JTextField courseIdTextField;
	private JLabel courseId;
	private Statement statement;
	
	public Q4 (String title) {
		//connect with DB 
		connectDB();
		setLayout(new BorderLayout());
		
		//add panel for labels, textfields, button
				panel = new JPanel();
				panel.setLayout(new FlowLayout(1));
				//label for SSN
				panel.add(new JLabel("SSN: "));
				//textfield for snn
				ssnTextField = new JTextField(9);
				panel.add(ssnTextField);
				//label for course id 
				courseId = new JLabel("Course ID");
				panel.add(courseId);
				//textfield for course id
				courseIdTextField = new JTextField(6);
				panel.add(courseIdTextField);
				
				
				//button 
				JButton button = new JButton("Show Grade");
				//add listener for button
				button.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						showGradeStudent(e);
					}
				});
				panel.add(button);
				
				this.add(panel,BorderLayout.NORTH);
				this.setTitle(title);
				this.setSize(600,100);
				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setVisible(true);
				this.setResizable(true);	
	}
	public static void main(String[] args) {
		Q4 showGrade  = new Q4("FindGrade");
	}
	
		
		// connect with DB
		private void connectDB() {
			//load driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Driver loaded successfully!");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//connect with DB
			try {
				String pswd = "12345";
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/",
						"nadezdatsygankova1",pswd);
				System.out.println("Connection established successfully!");
				
				 statement = connection.createStatement();			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		private void showGradeStudent(ActionEvent e) {
			//get text from textfield 
			String ssn= ssnTextField.getText();
			String courseId = courseIdTextField.getText();
			
			//select statement for DB 
			String sqlSelect = "SELECT first_name, last_name, student_id, SSN, course_id, grade FROM mydb.student  WHERE student.SSN='" + ssn + "'AND student.course_id='"+ courseId+"'";  

			try {
				//get a result from DB
				ResultSet resultSet = statement.executeQuery(sqlSelect);
				//check result 
				if(resultSet.next()) {
					//get information from resultSet 
					String first_name = resultSet.getString(1);
					String last_name = resultSet.getString(2);
					String grade = resultSet.getString(6);
					// show the student_full name: grade 
					System.out.println(first_name+' '+ last_name+':'+ grade);
				}
				//if student or course not found print a message
				else {
					System.out.println("Student or Course not found");
				}
			}
			//catch sql exception
			catch(SQLException esql)
			{
				esql.printStackTrace();
			}
			
		}

}
