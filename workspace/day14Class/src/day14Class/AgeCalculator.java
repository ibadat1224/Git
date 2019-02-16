package day14Class;

public class AgeCalculator {
final int CURRENT_YEAR=2017;
	
	public int calculateAge(int year){
		
		if(year<=CURRENT_YEAR){
			int age=CURRENT_YEAR-year;
			return age;
		}else{
			System.out.println("INVALID YEAR!");
			return 0;
		}
	}
	
}

