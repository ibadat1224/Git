package forLoop;
import java.util.Scanner;
public class PrintChars {

	public static void main(String[] args){
		
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter a strig:");
  String outString=scan.nextLine();
  
  System.out.println("Enter count:");
  int count=scan.nextInt();
  
  for(int i=0;i<count;i++){
	  System.out.print(outString);
	  
  }
  
	}
}
