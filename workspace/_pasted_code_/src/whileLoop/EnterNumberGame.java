package whileLoop;

import java.util.Scanner;

public class EnterNumberGame {
    public static void main(String[] args){
    	//ask the user to enter a number
    	//check if that number is 1
    	//if not 1, keep asking until user enters 1
    	
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter a number:");
  
    	int num=scan.nextInt();
    	
    	while(num!=1){
    		System.out.println("Enter number one");
    		num=scan.nextInt();
    		
    		System.out.println("Thank you for entering 1");
    	}
    }
}
