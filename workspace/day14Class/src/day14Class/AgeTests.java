package day14Class;

public class AgeTests {

	public static void main(String[] args) {
	AgeCalculator ageCalculator=new AgeCalculator();
	System.out.println(ageCalculator.calculateAge(2000));
	
	int age=ageCalculator.calculateAge(2000);
	System.out.println("If you are born in 2000 then you are"+age);
	
	age=ageCalculator.calculateAge(2020);
	System.out.println("If you are born in 2020 then you are"+age);
	
	}

}
