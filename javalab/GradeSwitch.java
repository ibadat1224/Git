public class GradeSwitch{
	public static void main(String[] args){
	char grade='P';
     
     switch(grade){
       case'A':
       System.out.println("Excellent");
        break;//break or get out fromswitch statement
       case'B':
       System.out.println("Better");
       break;
       case'C':
       System.out.println("Good");
       break;
       case'D':
       System.out.println("Poor");
       break;
       case'F':
       System.out.println("Fail");
       break;
       default:
       System.out.println("Invalid grade.ABCDF only");

     }
	}
}