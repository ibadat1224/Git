import java.util.Scanner;
public class MyDay{
	public static void main(String[] args){
Scanner dayInput=new Scanner(System.in);
System.out.println("Enter a day:");
String today=dayInput.next();
if(today.equalsIgnoreCase("Monday")){
	System.out.println("WeekDay Monday First Day!");

}else if(today.equalsIgnoreCase("Tuesday")){
	System.out.println("WeekDay Tuesday Second Day!");

}else if(today.equalsIgnoreCase("Wednesday")){
	System.out.println("WeekDay Wednesday Third Day!");

}else if(today.equalsIgnoreCase("Thursday")){
	System.out.println("WeekDay Thursday Fourth Day!");


}else if(today.equalsIgnoreCase("Friday")){
	System.out.println("WeekDay Friday Fifth Day!");

}else if(today.equalsIgnoreCase("Saturday")){
	System.out.println("WeekDay Saturday First WeekEnd Day!");


}else if(today.equalsIgnoreCase("Sunday")){
	System.out.println("WeekDay Sunday Second WeekEnd Day!");

}
	

	}
}