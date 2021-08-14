import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q3 {
	
	String string = "03.01.2015";
	DateFormat format = new SimpleDateFormat("mm/dd/yyyy");
	Date date = format.parse(string);
	
	System.out.println(date);

}
