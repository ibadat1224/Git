import java.util.Scanner;
	public class WeightConverter{

	public static void main(String[] args){

	   //Scanner scan;
	  // scan=new Scanner(System.in);

	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter pounds:");

	  double pounds=scan.nextDouble();
	  double kgs=pounds*0.453;

	  System.out.println(pounds+" pounds equals "+kgs+"kgs.");
      //======================
	  
	  System.out.println("Enter Kilograms:");
	  kgs=scan.nextDouble();
	  pounds=kgs * 2.2;

	  System.out.println(kgs+" kgs equals "+pounds+"pounds.");
	}

	     }


