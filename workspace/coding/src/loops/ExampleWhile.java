package loops;

import java.util.Scanner;

public class ExampleWhile{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = 0;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println("just a message" + n);
			
			
			// while(isInvalid){
			// n=sc.nextInt();
			// if(n>10){
			// ifInValid=false;

		}
		System.out.println("End of programm");

//		while (true) {
//			n = sc.nextInt();
//			if (n > 10) {
//				break;
			}
		

}

}
