package forLoop;

public class NestedForLoop {
public static void main(String[] args) {
	for(int outer=1;outer<=10;outer++){
	
		for(int inner=1;inner<=outer;inner++){
			System.out.print(inner);
			
		}
	System.out.println();
	}
}
}
