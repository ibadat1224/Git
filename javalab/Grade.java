public class Grade{
	public static void main(String[] args){
	char grade='A';//char values single characters within single grade

	if(grade=='A'){
	  System.out.println("Excellent");
    }else if(grade=='B'){
      System.out.println("Better");
    }else if(grade=='C'){
      System.out.println("Good");

     }else if(grade=='D'){
       System.out.println("Poor");
    }else if(grade=='F'){
      System.out.println("Fail");

    }else{
      System.out.println("Invalid grade.ABCDF only");

    }
	}
}