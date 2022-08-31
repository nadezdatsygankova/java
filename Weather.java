package weather;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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
        //working with date, time
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plus(1, ChronoUnit.DAYS);
        LocalDate yesterday = today.minusDays(1);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy ");
        String formattedDateToday = today.format(myFormatObj);
        String formattedDateTomorrow = tomorrow.format(myFormatObj);
        String formattedDateYesterday = yesterday.format(myFormatObj);

        // weather objects
        Weather current = new Weather("Toronto",38,6,16,26,24,18);
        Weather tomorrowWeather = new Weather("Toronto",32,6,13,22,24,20);
        Weather yesterdayWeather = new Weather("Toronto",30,6,12,25,29,21);
        //print
        System.out.println("City:" + current.city);
        System.out.println("==================");
        System.out.println("Today :"+ formattedDateToday);
        System.out.println("UV: " + current.uv);
        System.out.println("Temperature in the morning: "+ "\t"  + current.temperatureMorning + "\u2103");
        System.out.println("Temperature in the afternoon: "+ "\t"  + current.temperatureAfternoon + "\u2103");
        System.out.println("Temperature in the evening: " + "\t" + current.temperatureEvening + "\u2103");
        System.out.println("Temperature in the night: " +  "\t\t" + current.temperatureNight + "\u2103");

        System.out.println("==================");
        System.out.println("Tomorrow :"+ formattedDateTomorrow);
        System.out.println("UV: " + tomorrowWeather.uv);
        System.out.println("Temperature in the morning: "+ "\t"  + tomorrowWeather.temperatureMorning + "\u2103");
        System.out.println("Temperature in the afternoon: "+ "\t"  + tomorrowWeather.temperatureAfternoon + "\u2103");
        System.out.println("Temperature in the evening: " + "\t" + tomorrowWeather.temperatureEvening + "\u2103");
        System.out.println("Temperature in the night: " +  "\t\t" + tomorrowWeather.temperatureNight + "\u2103");

        System.out.println("==================");
        System.out.println("Yesterday :"+ formattedDateYesterday );
        System.out.println("UV: " + yesterdayWeather.uv);
        System.out.println("Temperature in the morning: "+ "\t"  + yesterdayWeather.temperatureMorning + "\u2103");
        System.out.println("Temperature in the afternoon: "+ "\t"  + yesterdayWeather.temperatureAfternoon + "\u2103");
        System.out.println("Temperature in the evening: " + "\t" + yesterdayWeather.temperatureEvening + "\u2103");
        System.out.println("Temperature in the night: " +  "\t\t" + yesterdayWeather.temperatureNight + "\u2103");
    }


}
