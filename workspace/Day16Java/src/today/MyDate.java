package today;

public class MyDate {
private int year;
private int  month;
private int day;

public MyDate(){
	//set default date to 01.01.2000.
	day=1;
	month=1;
	year=2000;
	
}
public MyDate(int day,int month,int year){
	setDay(day);
	setMonth(month);
	setYear(year);
	
}
public String toString(){
	return month+"/"+day+"/"+year;
	
}
public int getYear() {
	return year;
}

public void setYear(int year) {
	if(year>= 0 && year<=2017){
	this.year = year;
}else{
		System.out.println("Invalid Year");
	this.year =0;
}
}
public int getMonth() {
	return month;
}

public void setMonth(int month) {
	if(month>=1 && month<=12){
		this.month = month;
		
}else{
	System.out.println("Invalid Month");
	this.month=0;
}
}
public int getDay() {
	return day;
}

public void setDay(int day) {
	if(day>=1 && day<=31){
	this.day = day;
}else{
	System.out.println("Invalid Day");
	this.day=0;
}
}

}
