package doWhileLoop;
import java.util.Random;
import java.util.Scanner;

public class GuessANumber {
  public static void main(String[] args){
	 Scanner scan=new Scanner(System.in);
	 Random rnd=new Random();
	 System.out.println("Welcome to Guess Numbers Leagues!");
	
	 System.out.println("Your mission is guess the right number");
    System.out.println("You have only five attempts!");
     
    int secretNumber=rnd.nextInt(100);
     
    int numberOfAttempts=1;
    int userNumber;
    
    do{
	 System.out.println("Guess the number:");
    
	 userNumber=scan.nextInt();
     if(userNumber==secretNumber){
    	 System.out.println("You got it!");
    	 
     }else{
    	 numberOfAttempts++;
    	 System.out.println("Attempt#"+numberOfAttempts);
    	 
      if(userNumber>secretNumber){
    	  System.out.println("Too high");
      }else{
    	  System.out.println("Too low");
      }
      
      }
  if(numberOfAttempts>6){
	  System.out.println("You lost! Game over");
   break;
  }
  }while(userNumber!=secretNumber);
  System.out.println("Secret number:"+secretNumber);
    
  
    }
  }
  
    

