import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Q3 extends JFrame implements ActionListener {

	private static Vaccine vaccineNew;
	private static ArrayList<String> stringData = new ArrayList<String>();
	private static ArrayList<String> vaccineName = new ArrayList<String>();
	private static ArrayList<String> vaccineCity = new ArrayList<String>();
	private static ArrayList<Integer> numberofDose = new ArrayList<Integer>();
	
	private JPanel textfieldT;
	private JPanel area;
	private JTextArea texArea;
	private String line1 = ""; // first line of textarea

//	private static String[] stringData = {"02/15/2020","03/16/2020"};
//	
//	
//	DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
//	Date date = format.parse(string);

	public Q3(String title) {
		// panel for all application
		area = new JPanel();
		area.setLayout(new BorderLayout());

		// panel for textfield
		textfieldT =new JPanel();
		textfieldT.setLayout( new GridLayout(1,5));	
			
			
			JPanel colom1 =new JPanel();
			colom1.setLayout( new GridLayout(3,1));	
			
			
			JLabel labelAbCity = new JLabel("Information of a city above covid-19 vaccination");
			JTextField cityField = new JTextField(10);
			JButton buttonInformation = new JButton("OK");
			colom1.add(labelAbCity);
			colom1.add(cityField);
			colom1.add(buttonInformation);
			
			textfieldT.add(colom1);
			
			JPanel colom2 =new JPanel();
			colom2.setLayout( new GridLayout(4,1));	
			
			JLabel labelCityDateCity = new JLabel("The record of vaccination based upon date and name of city");
			JTextField cityField2 = new JTextField(10);
			JTextField dateField2 = new JTextField(10);
			JButton buttonInformation2 = new JButton("OK");
			
			colom2.add(labelCityDateCity);
			colom2.add(cityField2);
			colom2.add(dateField2);
			colom2.add(buttonInformation2);
			
			textfieldT.add(colom2);
			
			
			JPanel colom3 =new JPanel();
			colom3.setLayout( new GridLayout(3,1));	
			
			JLabel labelCityDate = new JLabel("The record of vaccination based upon date");
			JTextField dateField3 = new JTextField(10);
			JButton buttonInformation3 = new JButton("OK");
			
			colom3.add(labelCityDate);
			colom3.add(dateField3);
			colom3.add(buttonInformation3);
			
			textfieldT.add(colom3);
			
			
			JPanel colom4 =new JPanel();
			colom4.setLayout( new GridLayout(3,1));	
			
			JLabel labelCityRec = new JLabel("The record of vaccination based upon city");
			JTextField cityField3 = new JTextField(10);
			JButton buttonInformation4 = new JButton("OK");
			
			colom4.add(labelCityRec);
			colom4.add(cityField3);
			colom4.add(buttonInformation4);
			
			textfieldT.add(colom4);
			
			JPanel colom5 =new JPanel();
			colom5.setLayout( new GridLayout(3,1));	
			
			JLabel labelCityRecType = new JLabel("The record of vaccination based upon type viccine");
			JTextField typeField2 = new JTextField(10);
			JButton buttonInformation5 = new JButton("OK");
			
			colom5.add(labelCityRecType);
			colom5.add(typeField2);
			colom5.add(buttonInformation5);
			
			textfieldT.add(colom5);
			
			area.add(textfieldT,BorderLayout.NORTH);
			
			
			// panel for textarea
			JPanel	textareaT =new JPanel();
			textareaT.setLayout( new FlowLayout());	
			
			 texArea = new JTextArea(15,70);
			textareaT.add(texArea);
			

		
		area.add(textareaT,BorderLayout.CENTER);
		this.add(area);
		this.setTitle(title);
		this.setSize(300,300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);

	}

	public static void main(String[] args) {
		Q3 showGrade = new Q3("Information");
	}

	
	public void addVacine(String nameVaccine, String city, String date, int number) {
		boolean flag = true;
		try {
			vaccineNew = new Vaccine(nameVaccine, number, city, date);
			flag = true;
		} catch (IllegalArgumentException ex2) {
			flag = false;
			throw new IllegalArgumentException("Number cannot be negative");

		}
		if (flag) {
			stringData.add(vaccineNew.getDate());
			vaccineName.add(vaccineNew.getNameVaccine());
			vaccineCity.add(vaccineNew.getCity());
			numberofDose.add(vaccineNew.getNumber());
		}

	}

	// function to find vaccineName for this city
	public void informationAboutVacination(String city) {
		String information ="Theare are many place in "+ city+" where you can get a vaccine.";
		int index = 0;
		int totalNumber = 0;
		for (int i = 1; i < vaccineCity.size(); i++) {
			if (city == vaccineCity.get(i)) {
//				index = i;
//				totalNumber = totalNumber + numberofDose.get(index);
//				System.out.println(vaccineName.get(index));// add in text area????
//				System.out.println(stringData.get(index));
				if(information!=null) {
				System.out.println(information);
				}
				else {
					System.out.println("Please, return later for additional information");
				}
			}
		}
//		System.out.println(totalNumber);

	}

	public void informationAboutRecordVacination(String city, String date) {
		int index = 0;
		int totalNumber = 0;
		for (int i = 1; i < vaccineCity.size(); i++) {
			if (city == vaccineCity.get(i)) {
				if (date == stringData.get(i)) {
					index = i;
					totalNumber = totalNumber + numberofDose.get(index);
				}
			}
		}
		System.out.println(totalNumber);// add in text area????

	}
	
	public void inforAboutRecordVaciDate(String date) {
		int index = 0;
		String pfizer ="Pfizer";
		String moderna ="Moderna";
		String astraZeneca ="AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		for (int i = 1; i < stringData.size(); i++) {
				if (date == stringData.get(i)) {
					index = i;
					if(vaccineName.get(index)==pfizer)
					{
						totalNumberPf = totalNumberPf + numberofDose.get(index);
					}
					else if(vaccineName.get(index)==moderna) {
						totalNumberMod = totalNumberMod + numberofDose.get(index);
				}
					else if(vaccineName.get(index)==astraZeneca) {
						totalNumberAZ = totalNumberAZ + numberofDose.get(index);
					}
			}
		}
		System.out.println("totalNumberPf"+totalNumberPf);// add in text area????
		System.out.println("totalNumberMod"+totalNumberMod);
		System.out.println("totalNumberAZ"+totalNumberAZ);
	}
	
	
	public void inforAboutRecordVaciCity(String city) {
		int index = 0;
		String pfizer ="Pfizer";
		String moderna ="Moderna";
		String astraZeneca ="AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		for (int i = 1; i < vaccineCity.size(); i++) {
				if (city == vaccineCity.get(i)) {
					index = i;
					if(vaccineName.get(index)==pfizer)
					{
						totalNumberPf = totalNumberPf + numberofDose.get(index);
					}
					else if(vaccineName.get(index)==moderna) {
						totalNumberMod = totalNumberMod + numberofDose.get(index);
				}
					else if(vaccineName.get(index)==astraZeneca) {
						totalNumberAZ = totalNumberAZ + numberofDose.get(index);
					}
			}
		}
		System.out.println("totalNumberPf"+totalNumberPf);// add in text area????
		System.out.println("totalNumberMod"+totalNumberMod);
		System.out.println("totalNumberAZ"+totalNumberAZ);
	}
	
	
	public void inforAboutRecordVaciType(String vaccname) {
		int index = 0;
		String pfizer ="Pfizer";
		String moderna ="Moderna";
		String astraZeneca ="AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		for (int i = 1; i < vaccineName.size(); i++) {
				if (vaccname == vaccineName.get(i)) {
					index = i;
					if(vaccineName.get(index)==pfizer)
					{
						totalNumberPf = totalNumberPf + numberofDose.get(index);
					}
					else if(vaccineName.get(index)==moderna) {
						totalNumberMod = totalNumberMod + numberofDose.get(index);
				}
					else if(vaccineName.get(index)==astraZeneca) {
						totalNumberAZ = totalNumberAZ + numberofDose.get(index);
					}
			}
		}
		System.out.println("totalNumberPf"+totalNumberPf);// add in text area????
		System.out.println("totalNumberMod"+totalNumberMod);
		System.out.println("totalNumberAZ"+totalNumberAZ);
	}
	
	

	
	
}
