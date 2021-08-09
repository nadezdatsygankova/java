/*//Author: Nadezda Tsygankova
//ID: 152949194
//Lab3-4-5 -Q1
 * The US federal personal income tax is calculated based on the filing status and
taxable income. There are four filing statuses: single filers, married filing jointly,
married filing separately, and head of household. The tax rates for 2009 are shown
below. Write a program that prompts the user to enter filing status and taxable
incomes, then calculate the tax.
 * 
 * */




package labs;

import java.util.Scanner;

public class Income {
	private String fillinStatus;
	  private double income;
	  public Income() {
	    super();
	  }
	  public Income(String fillinStatus, double income) {
	    super();
	    this.fillinStatus = fillinStatus;
	    this.income = income;
	  }
	  public String getFillinStatus() {
	    return fillinStatus;
	  }
	  public void setFillinStatus(String fillinStatus) {
	    this.fillinStatus = fillinStatus;
	  }
	  public double getIncome() {
	    return income;
	  }
	  public void setIncome(double income) {
	    this.income = income;
	  }
	  public double taxCalculation (String status, double income ) {
	    //tax for single and married filling separately
	    double tax =0;
	       if (status == "Single"){
	      if (income <=8350){
	        tax =10;
	      }
	      else if ((income >=8351) && (income <=33950))
	      {
	        tax =15;
	      }      
	    else if((income >=33951) && (income <=82250)) {
	      tax = 25;
	      }
	      else if((income >=82251) && (income <=171550)) {
	        tax = 28;
	      }
	      else if((income >=171551) && (income <=372950)) {
	        tax = 33;
	      }
	      else  {
	        tax = 35;
	      }  
	    }  
	    //tax for married filling separately income >33951
	    else if (status == "Married Fillig Separately"){
	      if(income <=8350) {
	        tax =10;
	      }
	      else if((income >=8351) && (income <=33950)) {
	        tax=15;
	      }
	      else if((income >=33951) && (income <=68525)) {
	        tax = 25;      
	      }
	      else if((income >=68526) && (income <=104425))
	      {
	        tax = 28;
	      }
	      else if((income >=104426) && (income <=186475)) {
	        tax=33;
	      }
	      else {
	        tax =35;
	      }
	    }    
	    //tax for  "Married Filling Jointly or Qualifying Windiw(er)"
	    else if(status == "Married Filling Jointly or Qualifying Windiw(er)"){
	      if (income <=16700)
	      tax =10;
	      else if((income >=16701) && (income <=67900)){
	        tax =15;
	      }
	      else if ((income >=67901) && (income <=137050)) {
	        tax = 25;
	      }
	      else if ((income >=137051) && (income <=208850)) {
	      tax = 28;
	      }
	      else if ((income >=208851) && (income <=372950)) {
	        tax=33;
	      }
	      else {
	        tax = 35;
	      }
	    }
	    //tax for Head of Household    
	    else if (status == "Head of Household") {
	      if(income <=11950) {
	        tax=10;
	      }
	      else if((income >=11951) && (income <=45500)) {
	        tax=15;
	      }
	      else if ((income >=45501) && (income <=117450)) {
	        tax = 25;
	      }
	      else if((income >=117451) && (income <=190200)) {
	        tax = 28;
	      }
	      else if ((income >=190201) && (income <=372950)) {
	        tax = 33;
	      }
	      else {
	        tax =35;
	      }    
	    }
	    return tax;
	  }  
	  //calculate the tax for person
	  
	  public double CalculTax (double tax, double income )
	  {    
	    double result=0;    
	    return result = (income*tax)/100 ;  
	  }
	  public String statusString (int n) {
	    String status;
	    
	    switch(n) {
	      case 1:
	        status = "Single";
	        break;
	      case 2:
	        status = "Married Filling Jointly or Qualifying Windiw(er)";
	        break;
	      case 3:
	        status= "Married Filling Separately";
	        break;
	      case 4:
	        status= "Head of Household";
	        break;
	    default:
	         status ="0";
	    }
	    return status;  
	  }
	  public static void main (String args[]) {
	    Income in= new Income();
	    Scanner sc = new Scanner(System.in);
	    int number =0;
	    double incomeP = 0;
	    //print a list for choosing Status 
	    System.out.println("Enter your filling Status:");
	    System.out.println("1. Single \n 2. Married Filling Jointly or Qualifying Windiw(er)"
	        + "\n 3. Married Filling Separately"
	        + "\n 4. Head of Household");
	    do {
	         number = sc.nextInt();
	         //use function statusString to return a number 
	       String status = in.statusString(number);
	       //check for invalid input
	       if(status == "0")
	       {
	         System.out.println("Invalid Status");
	       }
	       else 
	       {
	         in.setFillinStatus(status);
	       }
	    }while (number <1 || number >4);
	    //input income
	    System.out.println("Enter your income:");
	    do {
	      incomeP = sc.nextDouble();
	      in.setIncome(incomeP);
	      //check for negative income
	      if (incomeP <0) {
	    	  System.out.println("Invalid income");
	      }
	    }while(incomeP <0);
	    //percent
	    double tax =(in.taxCalculation(in.getFillinStatus(), in.getIncome()));
	    //tax 
	       double result = in.CalculTax(tax, incomeP);
	       System.out.println("Your income: $" + incomeP);
	       System.out.println("Your percent for tax: " + tax);
	       System.out.println("Your tax: $" + result);  
	  }
	}

