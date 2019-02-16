 import java.util.Scanner;

public class Sum{
	public static void main(String[] agrs){
	Scanner scanner=new Scanner(System.in);
	int price1,price2,price3;
	System.out.println("Enter first item price:");
	price1=scanner.nextInt();

	System.out.println("Enter second item price:");
	price2=scanner.nextInt();

	System.out.println("Enter third item price:");
	price3=scanner.nextInt();

	int sum=price1+price2+price3;
	System.out.println("Your total is: "+sum);
}
  }