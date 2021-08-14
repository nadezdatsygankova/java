/*//Author: Nadezda Tsygankova
//ID: 152949194
//Final exam  -Q3  Q3.java + class Vaccine.java
 * 
 Develop a Menu Driven 3-tier GUI application, to manage the vaccination data for covid-19
vaccine ( You should consider the following points in your design). The design could be either
done via JavaFx or Swing..
Ministry of Health of Ontario wants to maintain the following information i.e., for each date different
types of vaccine doses administered in each city:
 * Date of vaccination – required and in mm/dd/yyyy format.
• Name of city – required
• Number of Pfizer vaccine doses administered – integer and 0 or above and required.
• Number of Moderna vaccine doses administered – integer and 0 or above and required.
• Number of AstraZeneca vaccine doses administered – integer and 0 or above and required.
• The user can take any of the three vaccines ( Moderna, Pfizer, AstraZeneca)
User should be able to perform the following operations using your application:
- Should accept the information of a city about covid-19 vaccination. If valid information is
provided, otherwise provide proper feedback to user (use any comments)
- Should be able to find and display the record of vaccination based upon date and name of city,
both i.e., date and name are required.
- Should be able to display vaccination doses administered using following scenarios:
o Vaccination records of a given date along with the total of each type of vaccine.
o Vaccination records of a given city along with the total of each type of vaccine.
Vaccination records of a given type of vaccine along with total of each type of vaccine.
 * 
 * FOR TEST
 * 1)
 *  Information above covid-19 vaccianation 
 *  enter: Toronto  
 *  Answer: Theare are many place in Toronto where you can get a vaccine.
 * 2)
 * The record of vaccination based upon date and name of city
 * enter: Toronto, 25/12/2021
 * 
 * Answer: 4 records
 * 
 * 3) 
 * The record of vaccination based upon date
 * enter: 25/12/2021
 * 
 * Answer: 4 records
 * 4) The record of vaccination based upon city
 * enter: Toronto
 * 
 * Answer: Pfizer - 4 records
 * 5)The record of vaccination based upon type vaccine
 * enter: 25/12/2021
 * 
 * Answer: 4 records
 * 6)Add information
 * City -> Toronto -> enter Ok
 * Type of vaccine -> Pfizer 
 * Date of vaccine -> 25/12/2021
 * Number of vaccine ->150
 * 
 * 7) Add information
 * City -> Toronto -> enter Ok
 * Type of vaccine -> Moderna 
 * Date of vaccine -> 25/12/2021
 * Number of vaccine ->150
 * 8)Add information
 * City -> Toronto -> enter Ok
 * Type of vaccine -> Moderna 
 * Date of vaccine -> 15/15/2021
 * Number of vaccine ->1500
 * 
 * 9)Add information
 * City -> Ottawa -> enter Ok
 * Type of vaccine -> Moderna 
 * Date of vaccine -> 15/15/2021
 * Number of vaccine ->3700
 * */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.*;


public class Q3 extends JFrame implements ActionListener {

	private static Vaccine vaccineNew;
	Map<String, ArrayList<Vaccine>> mp = new HashMap<String, ArrayList<Vaccine>>();
	ArrayList<Vaccine> vacineList = new ArrayList<Vaccine>();
	private static String cityNameString;
	private static String dateString;
	private static String typeNameString;
	// for adding
	private static String cityNameAdd;
	private static String dateAddString;
	private static String typeAddString;
	private static int numberAddString;

	private JPanel textfieldT;
	private JPanel area;
	private JTextArea texArea;

	public Q3(String title) {
          //add first information 
		vaccineNew = new Vaccine("Pfizer", 4, "Toronto", "25/12/2021");
		vacineList.add(vaccineNew);
		mp.put("Toronto", vacineList);
		
		// panel for all application
		area = new JPanel();
		area.setLayout(new BorderLayout());

		// panel for search information
		textfieldT = new JPanel();
		textfieldT.setLayout(new GridLayout(5, 1));
		// panel for information about covid-19 in city
		JPanel colom1 = new JPanel();
		colom1.setLayout(new GridLayout(2, 1));
		JLabel labelAbCity = new JLabel("Information above covid-19 vaccination");
		JPanel sum1 = new JPanel();
		sum1.setLayout(new FlowLayout());
		JLabel labelAbCityEnter = new JLabel("Enter a city");
		JTextField cityField = new JTextField(10);
		JButton buttonInformation = new JButton("OK");
		buttonInformation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save information from city to string 
				cityNameString = cityField.getText();
				//use a function informationAboutVacination to find a message for users 
				String messageString = informationAboutVacination(cityNameString);
				texArea.setText(messageString);
			}
		});

		sum1.add(labelAbCityEnter);
		sum1.add(cityField);
		sum1.add(buttonInformation);
		colom1.add(labelAbCity);
		colom1.add(sum1);
		textfieldT.add(colom1);

		// panel for information about  the record in city and specific date

		JPanel colom2 = new JPanel();
		colom2.setLayout(new GridLayout(2, 1));
		JLabel labelCityDateCity = new JLabel("The record of vaccination is based upon the date and name of the city");
		JPanel sum2 = new JPanel();
		sum2.setLayout(new GridLayout(2, 2));
		JPanel cityEnter = new JPanel();
		cityEnter.setLayout(new FlowLayout());
		JLabel labelAbCityEnter2 = new JLabel("Enter a city (required) ");
		JTextField cityField2 = new JTextField(10);
		JButton buttonInformation2 = new JButton("OK");
		buttonInformation2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save information about city
				cityNameString = cityField2.getText();
				if(cityNameString=="") {
					System.out.println("Enter a city (required)");
				}
			}
		});
		cityEnter.add(labelAbCityEnter2);
		cityEnter.add(cityField2);
		cityEnter.add(buttonInformation2);
		sum2.add(cityEnter);
		JPanel dateEnter = new JPanel();
		dateEnter.setLayout(new FlowLayout());
		JLabel labelAbDateEnter1 = new JLabel("Enter a date (required) mm/dd/yyyy");
		JTextField dateField2 = new JTextField(10);
		JButton buttonInformation2_date = new JButton("OK");
		buttonInformation2_date.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save information from date 
				try {
				dateString = dateField2.getText();
				}
				catch (InputMismatchException ex) {
					System.out.println(ex);
				}
				//use informationAboutRecordVacination finction for find records of vaccination
				int info = informationAboutRecordVacination(cityNameString, dateString);
				String messageCD = "  There are " + info + " record(s) of vaccination " + "in " + cityNameString + " "
						+ "on " + dateString;
				//add message in texarea
				texArea.setText(messageCD);
			}
		});
		dateEnter.add(labelAbDateEnter1);
		dateEnter.add(dateField2);
		dateEnter.add(buttonInformation2_date);
		sum2.add(dateEnter);
		colom2.add(labelCityDateCity);
		colom2.add(sum2);
		textfieldT.add(colom2);

		// panel for information about about record specific date
		JPanel colom3 = new JPanel();
		colom3.setLayout(new GridLayout(2, 1));
		JPanel sum3 = new JPanel();
		sum3.setLayout(new FlowLayout());
		JLabel labelCityDate = new JLabel("The record of vaccination based upon the date");
		JLabel labelAbDateEnter2 = new JLabel("Enter a date");
		JTextField dateField3 = new JTextField(10);
		JButton buttonInformation3 = new JButton("OK");
		buttonInformation3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dateString = dateField3.getText();
				inforAboutRecordVaciDate(dateString);
			}
		});
		sum3.add(labelAbDateEnter2);
		sum3.add(dateField3);
		sum3.add(buttonInformation3);
		colom3.add(labelCityDate);
		colom3.add(sum3);
		textfieldT.add(colom3);

		// panel for information about record specific city
		JPanel colom4 = new JPanel();
		colom4.setLayout(new GridLayout(2, 1));
		JPanel sum4 = new JPanel();
		sum4.setLayout(new FlowLayout());
		JLabel labelCityRec = new JLabel("The record of vaccination based upon city");
		JLabel labelAbCityEnter3 = new JLabel("Enter a city");
		JTextField cityField3 = new JTextField(10);
		JButton buttonInformation4 = new JButton("OK");
		buttonInformation4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save city name
				cityNameString = cityField3.getText();
				//record of vaccination using inforAboutRecordVaciCity
				inforAboutRecordVaciCity(cityNameString);
			}
		});
		sum4.add(labelAbCityEnter3);
		sum4.add(cityField3);
		sum4.add(buttonInformation4);
		colom4.add(labelCityRec);
		colom4.add(sum4);
		textfieldT.add(colom4);

		// panel for information about  record specific type of vaccine
		JPanel colom5 = new JPanel();
		colom5.setLayout(new GridLayout(3, 1));
		JPanel sum5 = new JPanel();
		sum5.setLayout(new FlowLayout());
		JLabel labelCityRecType = new JLabel("The record of vaccination based upon type vaccine");
		JLabel labelAbTypeEnter = new JLabel("Enter a type of vaccine");
		JTextField typeField2 = new JTextField(10);
		JButton buttonInformation5 = new JButton("OK");
		buttonInformation5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save type vaccine
				typeNameString = typeField2.getText();
				//use function inforAboutRecordVaciType
				inforAboutRecordVaciType(typeNameString);
			}
		});
		sum5.add(labelAbTypeEnter);
		sum5.add(typeField2);
		sum5.add(buttonInformation5);
		colom5.add(labelCityRecType);
		colom5.add(sum5);
		textfieldT.add(colom5);
		// add all this panel for area
		area.add(textfieldT, BorderLayout.WEST);

		// panel for textarea
		JPanel textareaT = new JPanel();
		textareaT.setLayout(new FlowLayout());

		texArea = new JTextArea(40, 40);
		textareaT.add(texArea);
		// add texArea panel for area
		area.add(textareaT, BorderLayout.CENTER);

		// panel for add information
		JPanel addInformation = new JPanel();
		addInformation.setLayout(new GridLayout(6, 1));
        //label for area
		JLabel labelAddInformJLabel = new JLabel("Add information");
		addInformation.add(labelAddInformJLabel);

		// panel for area - add Information about city
		JPanel cityAdd = new JPanel();
		cityAdd.setLayout(new FlowLayout());

		JLabel cityNameJLabel = new JLabel("City");
		cityAdd.add(cityNameJLabel);
		JTextField cityAddIn = new JTextField(10);
		cityAdd.add(cityAddIn);
		JButton cityAddButton = new JButton("Ok");
		cityAddButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//add new record - city name
				cityNameAdd = cityAddIn.getText();
			}
		});
		cityAdd.add(cityAddButton);
		addInformation.add(cityAdd);

		// panel for area - add Information about name of vaccine
		JPanel typeAdd = new JPanel();
		typeAdd.setLayout(new FlowLayout());
		// array of string containing type of vaccine
		String vaccineType[] = { "Pfizer", "Moderna", "AstraZeneca" };
		JLabel typeNameJLabel = new JLabel("Type of vaccine");
		typeAdd.add(typeNameJLabel);
		JComboBox typeVacine = new JComboBox(vaccineType);
		typeAdd.add(typeVacine);
//		JButton TypeAddButton = new JButton("Ok");
		typeVacine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//add new information in record - vaccine type
				int indexIn = typeVacine.getSelectedIndex();
				for (int i = 0; i < vaccineType.length; i++) {
					if (indexIn == i) {
						typeAddString = vaccineType[i];
					}
				}
			}
		});
		addInformation.add(typeAdd);

		// panel for date - add Information about date
		JPanel dateAdd = new JPanel();
		dateAdd.setLayout(new FlowLayout());
		JLabel dateNameJLabel = new JLabel("Date of vaccine");
		dateAdd.add(dateNameJLabel);
		JTextField dateAddIn = new JTextField(10);
		dateAdd.add(dateAddIn);
		JButton dateAddButton = new JButton("Ok");
		dateAddButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save information about date in new record
				dateAddString = dateAddIn.getText();
			}
		});
		dateAdd.add(dateAddButton);
		addInformation.add(dateAdd);

		// panel for number - add Information about number
		JPanel numberAdd = new JPanel();
		numberAdd.setLayout(new FlowLayout());
		JLabel numberNameJLabel = new JLabel("Number of vaccine");
		numberAdd.add(numberNameJLabel);
		JTextField numberAddIn = new JTextField(10);
		numberAdd.add(numberAddIn);
		JButton numberAddButton = new JButton("Ok");
		numberAddButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save information about number of vaccine in new record
				numberAddString = Integer.parseInt(numberAddIn.getText());
			}
		});
		numberAdd.add(numberAddButton);

		addInformation.add(numberAdd);
		JButton submiteAddButton = new JButton("Submite");
		submiteAddButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//save  all information 
				addVacine(typeAddString, cityNameAdd, dateAddString, numberAddString);
			}
		});
		addInformation.add(submiteAddButton);

		area.add(addInformation, BorderLayout.EAST);

		this.add(area);
		this.setTitle(title);
		this.setSize(1400, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(true);
	}

	public static void main(String[] args) {
		Q3 showGrade = new Q3("Information");
	}
       //create Vacine with all information
	public void addVacine(String nameVaccine, String city, String date, int number) {
		boolean flag = true;
		try {
			vaccineNew = new Vaccine(nameVaccine, number, city, date);
			flag = true;
			//check for exceptions
		} catch (IllegalArgumentException ex2) {
			flag = false;
			throw new IllegalArgumentException("Number cannot be negative");
		}
		if (flag) {
			vacineList.add(vaccineNew);
			mp.put(city, vacineList);
		}
	}

	// function to find vaccineName for this city
	public String informationAboutVacination(String city) {
		String information = "  There are many places in " + city + " where you can get a vaccine.";
		return information;
	}
//function for finding the record of vaccination based upon date and name of city
	public int informationAboutRecordVacination(String city, String date) {
		int totalNumber = 0;
         //check and find city with date -> find total record 
		for (Entry<String, ArrayList<Vaccine>> mp : mp.entrySet()) {
			if (mp.getKey().equals(city)) {
				for (int i = 0; i < vacineList.size(); i++) {
					if (mp.getValue().get(i).getCity().equals(city) && mp.getValue().get(i).getDate().equals(date)) {
						totalNumber = totalNumber + mp.getValue().get(i).getNumber();
					}
				}
			}
		}
		return totalNumber;
	}
// function for find Vaccination records of a given date along with the total of each type of vaccine
	public void inforAboutRecordVaciDate(String date) {
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		//total number  type of vaccine
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;

		for (Entry<String, ArrayList<Vaccine>> mp : mp.entrySet()) {

			for (int i = 0; i < vacineList.size(); i++) {
				if (mp.getValue().get(i).getDate().equals(date)) {
					if (mp.getValue().get(i).getNameVaccine().equals(pfizer)) {
						System.out.println("here now");
						totalNumberPf = totalNumberPf + mp.getValue().get(i).getNumber();
						System.out.println(totalNumberPf);
					} else if (mp.getValue().get(i).getNameVaccine().equals(moderna)) {
						System.out.println("here now");
						totalNumberMod = totalNumberMod + mp.getValue().get(i).getNumber();
						System.out.println(totalNumberMod);
					} else if (mp.getValue().get(i).getNameVaccine().equals(astraZeneca)) {
						System.out.println("here now");
						totalNumberAZ = totalNumberAZ + mp.getValue().get(i).getNumber();
						System.out.println(totalNumberAZ);
					}
				}
			}
		}
         //display information in textArea
		String messageStringPF = " Date: " + date + " total number Pfizer vaccine:  " + totalNumberPf;
		String messageStringMOd = " Date: " + date + " total number Moderna vaccine:  " + totalNumberMod;
		String messageStringAZ = " Date: " + date + " total number AstraZeneca vaccine:  " + totalNumberAZ;
		texArea.setText(messageStringPF + "\n" + messageStringMOd + "\n" + messageStringAZ);

	}
//function calculte vaccination records of a given city along with the total of each type of vaccine.
	public void inforAboutRecordVaciCity(String city) {
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		//total number  type of vaccine
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;

		for (Entry<String, ArrayList<Vaccine>> mp : mp.entrySet()) {
			if (mp.getKey().equals(city)) {
				for (int i = 0; i < vacineList.size(); i++) {
					if (mp.getValue().get(i).getCity().equals(city)) {
						if (mp.getValue().get(i).getNameVaccine().equals(pfizer)) {
							totalNumberPf = totalNumberPf + mp.getValue().get(i).getNumber();
						} else if (mp.getValue().get(i).getNameVaccine().equals(moderna)) {
							totalNumberMod = totalNumberMod + mp.getValue().get(i).getNumber();
						} else if (mp.getValue().get(i).getNameVaccine().equals(astraZeneca)) {
							totalNumberAZ = totalNumberAZ + mp.getValue().get(i).getNumber();
						}
					}
				}
			}
		}
		//display information in textArea
		String messageStringPF = " City: " + city + " total number Pfizer vaccine:  " + totalNumberPf;
		String messageStringMOd = " City: " + city + " total number Moderna vaccine:  " + totalNumberMod;
		String messageStringAZ = " City: " + city + " total number AstraZeneca vaccine:  " + totalNumberAZ;
		texArea.setText(messageStringPF + "\n" + messageStringMOd + "\n" + messageStringAZ);
	}

	//function calculates Vaccination records of a given type of vaccine along with total of each type of vaccine.
	public void inforAboutRecordVaciType(String vaccname) {
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		int totalSpec = 0;

		for (Entry<String, ArrayList<Vaccine>> mp : mp.entrySet()) {

			for (int i = 0; i < vacineList.size(); i++) {
				if (mp.getValue().get(i).getNameVaccine().equals(vaccname)) {
					if (mp.getValue().get(i).getNameVaccine().equals(pfizer)) {
						totalNumberPf = totalNumberPf + mp.getValue().get(i).getNumber();
						totalSpec = totalNumberPf;
					} else if (mp.getValue().get(i).getNameVaccine().equals(moderna)) {
						totalNumberMod = totalNumberMod + mp.getValue().get(i).getNumber();
						totalSpec = totalNumberMod;
					} else if (mp.getValue().get(i).getNameVaccine().equals(astraZeneca)) {
						totalNumberAZ = totalNumberAZ + mp.getValue().get(i).getNumber();
						totalSpec = totalNumberAZ;
					}
				} else {
					if (mp.getValue().get(i).getNameVaccine().equals(pfizer)) {
						totalNumberPf = totalNumberPf + mp.getValue().get(i).getNumber();
					} else if (mp.getValue().get(i).getNameVaccine().equals(moderna)) {
						totalNumberMod = totalNumberMod + mp.getValue().get(i).getNumber();
					} else if (mp.getValue().get(i).getNameVaccine().equals(astraZeneca)) {
						totalNumberAZ = totalNumberAZ + mp.getValue().get(i).getNumber();
					}
				}
			}
		}

		String messageStringSp = " Vaccine: " + vaccname + " total number :  " + totalSpec;
		String messageStringPF = "  Pfizer vaccine: " + totalNumberPf;
		String messageStringMOd = "  Moderna vaccine:  " + totalNumberMod;
		String messageStringAZ = "  AstraZeneca vaccine:  " + totalNumberAZ;
		//display information in textArea
		texArea.setText(messageStringSp + "\n" + messageStringPF + "\n" + messageStringMOd + "\n" + messageStringAZ);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
