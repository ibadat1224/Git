package project;

public class Date {
	// This is a static field to represent final day of each month
	// There are 13 items intentionally so you can start from index 1-12 instead
	// of 0.
	private static int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	String[] monthWords = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	// These 3 instance fields are for representing a date attribute
	private int month;
	private int day;
	private int year;

	/** This is a 3 arguments Constructor
		 * Used for Initializing a new date from the month, day and year.
		 * @param month : the month (between 1 and 12)
		 * @param day   : the day (between 1 and 28-31, depending on the month)
		 * @param year  : the year
		 
		 */

		public Date(int month, int day, int year){
			
			//DO NOT CHANGE --THIS IS USED TO CHECK FOR INVALID DATE
			if(!isValid(month, day, year)){
				System.out.println("Invalid Date");
				throw new IllegalArgumentException();
			}
			
			this.month = month;
			this.day = day;
			this.year = year;
			
		
		

		/** 
		 * @param year
		 * @return true if the given year is a leap year. false otherwise.
		 * leap year definition :
		 * leap year can be divided by 400 without fraction 
		 * leap year can not be divided 100 without fraction
		 * leap year can be divided by 4 without fraction 
		 */
		public static boolean isLeapYear(int year){
			if(int year)
			
			
			
			
			return true;
		}

		/**
		 * This method checks if a given date is a valid calendar date
		 * 
		 * @param m  month 
		 * 		month have to be from number 1-12 if not it's invalid date 
		 * @param d  day
		 *      day have to be from 1 - End Day Of The Month
		 *      You can get End Day of the month from DAYS Array according to index
		 *      any day not within the range make it invalid date
		 *      
		 *      if It's not a leap year and February have more than 28 days 
		 *      it's a invalid date 
		 *      
		 * @param y  year. (A year is no less than 1900, and no greater than 2100)
		 * @return  true if the given date is a valid calendar date. false otherwise
		 */
		public static boolean isValid(int m, int d, int y){
			//TO DO
			return true;
		}

		/** 
		 * @return month of that month
		 */
		public int getMonth(){
			return 0; 
		}

		/** 
		 * @return day of that day
		 */
		public int getDay(){
			return 0;
		}

		/** 
		 * @return year of that year
		 */
		public int getYear(){
			return 0;
		}


		/**
		 * This method is used to compare this date object 
		 *    to a new date object passed to the methoed as argument
		 * Compare this date to that date.
		 * @return {-1 or zero or 1 integer}, 
		 * depending on whether this date is {before, equal to, after} that date
		 * if this date is before that date return -1
		 * if this date is equal to that date return 0
		 * if this date is after that date return 1
		 */

		public int compareTo(Date that) {
			//TO DO
			return 0;
		}

		/**
		 * Return a string representation of this date.
		 * @return the string representation in the format MM/DD/YYYY
		 */
		public String toString(){
			//TO DO
			return "";
		}

		/**
		 * This method will calculate the age of person and return as an int
		 * ATTENTION : 
		 * When a person was born on May 1st, 2000  
		 * and today's date is April 23, 2018 , he is still considered 17 until May 1st.
		 */
		
		public int getAge(){
			///DO NOT CHANGE 
			LocalDate cal = LocalDate.now();
			int d = cal.getDayOfMonth();   // day number of today's date
		    int m = cal.getMonthValue();   // month number of today's date
		    int y = cal.getYear();         // year number of today's date
		    //-------------------------------------
		    
		    int age = 0;
		    // TO DO
		    
		    return age;
		}

		/**
		 *  THIS METHOD IS OPTIONAL 
		 *  YOU CAN IMPLEMENT AND TEST IT IF YOU ARE DONE EARLY IN CLASS
		 *  
		 * @return the word representation of the date.
		 * Example: (new Date(12,1,2017)).dateToWords() returns "December One Two Thousand Seventeen" 
		 */
		public String dateToWords() {
			String[] monthWords = {"January", "February", "March", "April", "May", "June", "July", "August", "September","October", "November", "December"};
			String[] numbersLessThanTen = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
			String[] numbersBetweenTenAndTwenty = {"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
			String[] multiplesOfTen = {"Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
			String[] yearWords = {"Hundred", "Thousand"};
			
			// TO DO 
			return "TODO";
		}


	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
