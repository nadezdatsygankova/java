import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Q3 extends JFrame implements ActionListener {

	private static Vaccine vaccineNew;
	Map<String,Vaccine> mp = new HashMap<String,Vaccine>();
	private static ArrayList<String> stringData = new ArrayList<String>();
	private static ArrayList<String> vaccineName = new ArrayList<String>();
	private static ArrayList<String> vaccineCity = new ArrayList<String>();
	private static ArrayList<Integer> numberofDose = new ArrayList<Integer>();
    private static String cityNameString;
    private static String dateString;
    private static String typeNameString;
    //for adding
    private static String cityNameAdd;
    private static String dateAddString;
    private static String typeAddString;
    private static int numberAddString;
    
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
		
		// for test
		stringData.add("25/05/2021");
		vaccineName.add("Pfizer");
		vaccineCity.add("Toronto");
		numberofDose.add(5);
		
		
		// panel for all application
		area = new JPanel();
		area.setLayout(new BorderLayout());

		// panel for search information 
		textfieldT = new JPanel();
		textfieldT.setLayout(new GridLayout(5, 1));
         //panel for information about covid-19 in city
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
				cityNameString=cityField.getText();
				String messageString= informationAboutVacination(cityNameString);
				texArea.setText(messageString);
			}
		});
		
		sum1.add(labelAbCityEnter);
		sum1.add(cityField);
		sum1.add(buttonInformation);
		colom1.add(labelAbCity);
		colom1.add(sum1);
		textfieldT.add(colom1);
		
		//panel for information about about record  in city and specific date

		JPanel colom2 = new JPanel();
		colom2.setLayout(new GridLayout(2, 1));
		JLabel labelCityDateCity = new JLabel("The record of vaccination based upon date and name of city");
		JPanel sum2 = new JPanel();
		sum2.setLayout(new GridLayout(2, 2));
		JPanel cityEnter = new JPanel();
		cityEnter.setLayout(new FlowLayout());
		JLabel labelAbCityEnter2 = new JLabel("Enter a city");
		JTextField cityField2 = new JTextField(10);
		JButton buttonInformation2 = new JButton("OK");
		buttonInformation2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				cityNameString=cityField2.getText();
			}
		});
		cityEnter.add(labelAbCityEnter2);
		cityEnter.add(cityField2);
		cityEnter.add(buttonInformation2);
		sum2.add(cityEnter);
		JPanel dateEnter = new JPanel();
		dateEnter.setLayout(new FlowLayout());
		JLabel labelAbDateEnter1 = new JLabel("Enter a date");
		JTextField dateField2 = new JTextField(10);
		JButton buttonInformation2_date = new JButton("OK");
		buttonInformation2_date.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dateString=dateField2.getText();
				int info = informationAboutRecordVacination(cityNameString,dateString);
				
				String messageCD="  There are "+info+ "record of vaccination "+ "in "+cityNameString+" "+"on "+dateString;
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

		//panel for information about about record specific date
		JPanel colom3 = new JPanel();
		colom3.setLayout(new GridLayout(2, 1));
		JPanel sum3 = new JPanel();
		sum3.setLayout(new FlowLayout());
		JLabel labelCityDate = new JLabel("The record of vaccination based upon date");
		JLabel labelAbDateEnter2 = new JLabel("Enter a date");
		JTextField dateField3 = new JTextField(10);
		JButton buttonInformation3 = new JButton("OK");
		buttonInformation3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dateString=dateField3.getText();
				inforAboutRecordVaciDate(dateString);
			}
		});
		sum3.add(labelAbDateEnter2);
		sum3.add(dateField3);
		sum3.add(buttonInformation3);
		colom3.add(labelCityDate);
		colom3.add(sum3);
		textfieldT.add(colom3);

		//panel for information about about record specific city
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
				cityNameString=cityField3.getText();
				inforAboutRecordVaciCity(cityNameString);
			}
		});
		sum4.add(labelAbCityEnter3);
		sum4.add(cityField3);
		sum4.add(buttonInformation4);
		colom4.add(labelCityRec);
		colom4.add(sum4);
		textfieldT.add(colom4);

		//panel for information about about record specific type of viccine
		JPanel colom5 = new JPanel();
		colom5.setLayout(new GridLayout(3, 1));
		JPanel sum5 = new JPanel();
		sum5.setLayout(new FlowLayout());
		JLabel labelCityRecType = new JLabel("The record of vaccination based upon type viccine");
		JLabel labelAbTypeEnter = new JLabel("Enter a type of vaccine");
		JTextField typeField2 = new JTextField(10);
		JButton buttonInformation5 = new JButton("OK");
		buttonInformation5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				typeNameString=typeField2.getText();
				inforAboutRecordVaciType(typeNameString);
			}
		});
		sum5.add(labelAbTypeEnter);
		sum5.add(typeField2);
		sum5.add(buttonInformation5);
		colom5.add(labelCityRecType);
		colom5.add(sum5);
		textfieldT.add(colom5);
          //add all this panel for area
		area.add(textfieldT, BorderLayout.WEST);

		// panel for textarea
		JPanel textareaT = new JPanel();
		textareaT.setLayout(new FlowLayout());

		texArea = new JTextArea(40, 40);
		textareaT.add(texArea);
		 //add  texArea panel for area
		area.add(textareaT, BorderLayout.CENTER);
		

		// panel for add information
		JPanel addInformation = new JPanel();
		addInformation.setLayout(new GridLayout(6,1));
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
				cityNameAdd=cityAddIn.getText();
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
				int indexIn= typeVacine.getSelectedIndex();
				for (int i = 0; i < vaccineType.length; i++) {
					if(indexIn==i) {
						typeAddString=vaccineType[i];
				}
				}
		          
			}
		});
//		typeAdd.add(TypeAddButton);
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
				dateAddString= dateAddIn.getText();
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
				numberAddString= Integer.parseInt(numberAddIn.getText());
			}
		});
		numberAdd.add(numberAddButton);
		
		
		
		addInformation.add(numberAdd);
		JButton submiteAddButton = new JButton("Submite");
		submiteAddButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				addVacine(typeAddString,cityNameAdd,dateAddString,numberAddString);
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
		
		System.out.println(stringData);
		System.out.println(vaccineName);
		System.out.println(vaccineCity);
		System.out.println(numberofDose);

	}

	// function to find vaccineName for this city
	public String informationAboutVacination(String city) {
		String information = "  Theare are many place in " + city + " where you can get a vaccine.";
		int index = 0;
		int totalNumber = 0;
		for (int i = 1; i < vaccineCity.size(); i++) {
			if (city == vaccineCity.get(i)) {
				if (information != null) {
					System.out.println(information);
				} else {
					information ="Please, return later for additional information";
				}
			}
		}
		return information;

	}

	public int informationAboutRecordVacination(String city, String date) {
		int index = 0;
		int totalNumber = 0;

		for (int i = 0; i < vaccineCity.size(); i++) {
			if (city == vaccineCity.get(i)) {
				System.out.println("i am here");
				if (date == stringData.get(i)) {
				
					totalNumber = totalNumber + numberofDose.get(i);
					System.out.println(totalNumber);
				}
			}
		}
		return totalNumber;// add in text area????

	}

	public void inforAboutRecordVaciDate(String date) {
		int index = 0;
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		for (int i = 0; i < stringData.size(); i++) {
			if (date == stringData.get(i)) {
				index = i;
				if (vaccineName.get(index) == pfizer) {
					totalNumberPf = totalNumberPf + numberofDose.get(index);
				} else if (vaccineName.get(index) == moderna) {
					totalNumberMod = totalNumberMod + numberofDose.get(index);
				} else if (vaccineName.get(index) == astraZeneca) {
					totalNumberAZ = totalNumberAZ + numberofDose.get(index);
				}
			}
		}
		String messageStringPF=" Date: "+ date+ " total number Pfizer vaccine:  "+totalNumberPf;
		String messageStringMOd=" Date: "+ date+ " total number Moderna vaccine:  "+totalNumberMod;
		String messageStringAZ=" Date: "+ date+ " total number AstraZeneca vaccine:  "+totalNumberAZ;
		texArea.setText(messageStringPF+"\n"+messageStringMOd+"\n"+messageStringAZ);
	
	}

	public void inforAboutRecordVaciCity(String city) {
		int index = 0;
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		for (int i = 0; i < vaccineCity.size(); i++) {
			if (city == vaccineCity.get(i)) {
				index = i;
				if (vaccineName.get(index) == pfizer) {
					totalNumberPf = totalNumberPf + numberofDose.get(index);
				} else if (vaccineName.get(index) == moderna) {
					totalNumberMod = totalNumberMod + numberofDose.get(index);
				} else if (vaccineName.get(index) == astraZeneca) {
					totalNumberAZ = totalNumberAZ + numberofDose.get(index);
				}
			}
		}
		String messageStringPF=" City: "+ city+ " total number Pfizer vaccine:  "+totalNumberPf;
		String messageStringMOd=" City: "+ city+ " total number Moderna vaccine:  "+totalNumberMod;
		String messageStringAZ=" City: "+ city+ " total number AstraZeneca vaccine:  "+totalNumberAZ;
		texArea.setText(messageStringPF+"\n"+messageStringMOd+"\n"+messageStringAZ);
	}

	public void inforAboutRecordVaciType(String vaccname) {
		int index = 0;
		String pfizer = "Pfizer";
		String moderna = "Moderna";
		String astraZeneca = "AstraZeneca";
		int totalNumberPf = 0;
		int totalNumberMod = 0;
		int totalNumberAZ = 0;
		int totalSpec=0;
		for (int i = 0; i < vaccineName.size(); i++) {
			if (vaccname == vaccineName.get(i)) {
				index = i;
				totalSpec=totalSpec+numberofDose.get(index);
			}
			else {
				if (vaccineName.get(index) == pfizer) {
					totalNumberPf = totalNumberPf + numberofDose.get(index);
				} else if (vaccineName.get(index) == moderna) {
					totalNumberMod = totalNumberMod + numberofDose.get(index);
				} else if (vaccineName.get(index) == astraZeneca) {
					totalNumberAZ = totalNumberAZ + numberofDose.get(index);
				}
			}
		}
		
	
		String messageStringSp=" Vaccine: "+ vaccname+ " total number :  "+totalSpec;
		String messageStringPF="  Pfizer vaccine: "+totalNumberPf;
		String messageStringMOd="  Moderna vaccine:  "+totalNumberMod;
		String messageStringAZ="  AstraZeneca vaccine:  "+totalNumberAZ;
		
		texArea.setText(messageStringSp+"\n"+messageStringPF+"\n"+messageStringMOd+"\n"+messageStringAZ);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		System.out.println(e.getSource());
		
//		String textField = testField.getText();
		
		
	}

}
