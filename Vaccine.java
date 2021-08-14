
public class Vaccine {
    private String nameVaccine;
    private int number;
    private String city;
    private String date;
	public String getNameVaccine() {
		return nameVaccine;
	}
	public void setNameVaccine(String nameVaccine) {
		this.nameVaccine = nameVaccine;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		 if (number >= 0)
			 this.number = number;
			else
				throw new IllegalArgumentException("Number cannot be negative");
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Vaccine(String nameVaccine, int number, String city, String date) {
		super();
		this.nameVaccine = nameVaccine;
		if (number >= 0)
			 this.number = number;
			else
				throw new IllegalArgumentException("Number cannot be negative");
		this.city = city;
		this.date = date;
	}
}
