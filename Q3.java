import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Q3 extends JFrame implements ActionListener {

	private static Vaccine vaccineNew;
	private static ArrayList<String> stringData = new ArrayList<String>();
	private static ArrayList<String> vaccineName = new ArrayList<String>();
	private static ArrayList<String> vaccineCity = new ArrayList<String>();
	private static ArrayList<Integer> numberofDose = new ArrayList<Integer>();

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
	
	
	
	

//	private static String[] stringData = {"02/15/2020","03/16/2020"};
//	
//	
//	DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
//	Date date = format.parse(string);



	private JPanel panelLabel;
	private JLabel label1;
	private JLabel label2;
	private JPanel area;
	private JTextArea TextArea;
	private String line1 = ""; // first line of textarea

	public Q3(String title) {
		// panel for all application
		area = new JPanel();
		area.setLayout(new FlowLayout());

		// panel for buttons
//			panelButton =new JPanel();
//			panelButton.setLayout( new BoxLayout(panelLabel,BoxLayout.Y_AXIS));
		JButton buttonInformation = new JButton("Information of a city above covid-19 vaccination");
//				panelLabel.add(label1);
//				panelLabel.add(label2);	 
//				area.add(panelLabel);

	}

	public static void main(String[] args) {
		Q3 showGrade = new Q3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	public class Vacine() {
		
		
	}
	
}
