package arrays;

public class ArraysBasic {

	public static void main(String[] args) {
	
		String[] days=new String[8];
		days[0]="Mon";
		days[1]="Tue";
		days[2]="Wed";
		days[3]="Thu";
		days[4]="Fri";
		days[5]="Sat";
		days[6]="Sun";
		
		System.out.println("Today is "+ days[6]);
		
		String tomorrow=days[0];
		System.out.println("Tomorrow is "+tomorrow);
		
		if(days[4]=="Fri"){
			System.out.println("It is Friday");
		}else{
			System.out.println("It is not Friday");
			System.out.println("It is "+days[4]);
		}
		
		//add a variables yesterday and assing value from an array
		String yesterday=days[5];
		
		System.out.println("yesterday was "+yesterday);
		System.out.println("yesterday was "+days[5]);
		
		days[7]="Funday";
		System.out.println(days[7]);
		
		//ArrayIndexOutOfBoundsException
	


	}

}
