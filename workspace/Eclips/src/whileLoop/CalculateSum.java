package whileLoop;
import java.util.Scanner;
public class CalculateSum {
   public static void main(String[] args){
	   //calculate sum of numbers and print
	   //4-->1+2+3+4-->10
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter number:");
	   int range=scan.nextInt();
	    
	   int counter=1;
	   int sum=0;
	   
	   while(counter<=10){
		   System.out.println(counter);
		   sum=sum+counter;
		  System.out.println("Sum:"+sum);
		  counter++;
		   
	   }
	    }
   }

