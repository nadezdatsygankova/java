package weather;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Weather {

    int humidity;
    int uv;
    int temperatureMorning;
    int temperatureAfternoon;
    int temperatureEvening;
    int temperatureNight;
    String city;
    public Weather( String city,int humidity, int uv, int temperatureMorning, int temperatureAfternoon, int temperatureEvening, int temperatureNight  ){
        this.city=city;
        this.humidity = humidity;
        this.uv = uv;
        this.temperatureMorning = temperatureMorning;
        this.temperatureAfternoon = temperatureAfternoon;
        this.temperatureEvening = temperatureEvening;
        this.temperatureNight = temperatureNight;
    }

    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy ");
        String formattedDate = myObj.format(myFormatObj);
        Weather current = new Weather("Toronto",38,6,16,26,24,18);
        System.out.println("Today :"+ formattedDate + " in  " + current.city +". " );
        System.out.println("UV: " + current.uv);
        System.out.println("Temperature in the morning: "+ "\t"  + current.temperatureMorning + "\u2103");
        System.out.println("Temperature in the afternoon: "+ "\t"  + current.temperatureAfternoon + "\u2103");
        System.out.println("Temperature in the evening: " + "\t" + current.temperatureEvening + "\u2103");
        System.out.println("Temperature in the night: " +  "\t\t" + current.temperatureNight + "\u2103");
    }


}
