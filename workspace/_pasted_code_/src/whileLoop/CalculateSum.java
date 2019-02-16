package whileLoop;

import java.util.Scanner;

public class CalculateSum {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
System.out.print("Enter number:");
  int range=scan.nextInt();
  int sum=0;
  int counter=1;

while(counter<=range){
	sum=sum+counter;
	counter++;
}
   System.out.println("Sum of numbers:"+sum);
   

}
}

