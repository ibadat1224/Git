    import java.util.Scanner;

	public class ScannerInputs{
	public static void main(String[] args){
	System.out.println("What is yourf name?");

	Scanner scan=new Scanner(System.in);
	String firstName=scan.next();
	String lastName=scan.next();
	System.out.println("Nice to meet you-"+firstName+""+lastName);
	}

}