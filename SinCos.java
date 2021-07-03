/*Author: Nadezda Tsygankova
//ID: 152949194
 * Midterm 
 * Print the following table to display the sin value and cos value of degrees from 0 to 360 with increments 
 * of 10 degrees. 
 * Round the value to keep four digits after the decimal point.
 * 
 * */

package Midterm;

import java.text.DecimalFormat;

public class SinCos {
	
	public static void main(String[] args) {
		// DecimalFormal to format decimal numbers into "0.0000" strings.
		DecimalFormat df = new DecimalFormat("0.0000");
		System.out.println("Degree       Sin       Cos ");
		for (int i = 0; i <= 360; i=i+10) {
			//convert an angle measured in degrees to an approximately equivalent angle measured in radians.
			double rad = Math.toRadians(i);
			//the trigonometric sine of an angle 
			String sinR= df.format(Math.sin(rad));
			//the cosine of the value
			String cosR= df.format(Math.cos(rad));
			//use String formatting for output
			System.out.printf("%-10s  %-10.30s %-10.30s%n",i,sinR,cosR);
		}
	}

}
