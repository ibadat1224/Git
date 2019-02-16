package mypakcage;

//import static java.lang.Math.PI;
//import static java.lang.Math.addExact;
import static java.lang.Math.PI;
import static java.lang.Math.addExact;

public class StaticImport {

	public static void main(String[] args) {

		System.out.println(Math.PI);
		System.out.println(Math.addExact(2, 5));

		System.out.println(PI);
		System.out.println(addExact(2, 5));
	}

}
