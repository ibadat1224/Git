package today;

public class TestMyDate {
public static void main(String[] args) {
	
	MyDate date1=new MyDate();
	//5.23.2017
//	date1.setDay(23);
//	date1.setMonth(5);
//	date1.setYear(2017);
	
	String today=date1.toString();
	System.out.println("Today is"+today);
	//Create an a new MaDate using constractor with argument
	MyDate date2=new MyDate(1,15,2015);
	today=date2.toString();
	System.out.println("Today is"+today);
	
	MyDate date3=new MyDate(100,200,3500);
	System.out.println(date3.toString());
	
	
}
}
