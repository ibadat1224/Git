import java.util.Scanner;
	public class SpeedLimit{
    public static void main(String[] args){
	final int SPEED_LIMIT=55;
	Scanner scan=new Scanner(System.in); 
	System.out.println("Enter your current speed:");
	int currentSpeed=scan.nextInt();

	if(currentSpeed>SPEED_LIMIT){
	  System.out.println("Slow down,you might get a ticket");

	
    }else if(currentSpeed==SPEED_LIMIT){
     System.out.println("Good job! Keep it up!");

     

	}else if(SPEED_LIMIT-currentSpeed >= 10){
     System.out.println("Speed up, yor are too slow");
 
	}else if(currentSpeed==0){
		System.out.println("Drive! you are not moving at all");
		
	}
	}
}