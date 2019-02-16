import java.util.Scanner;
public class CalculatorV1{
	public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int num1,num2;
	String operator;

	System.out.println("Enter first Number:");
	num1=input.nextInt();

    System.out.println("Enter second Number:");
    num2=input.nextInt();

    System.out.println("Enter an operator");
    operator=input.next();

    if (operator.equals("+")){
       System.out.println(num1+num2);

    }else if(operator.equals("-")){
     System.out.println(num1-num2);

    }else if(operator.equals("*")){
     System.out.println(num1*num2);

    }else if(operator.equals("/")){
      System.out.println(num1/num2);

    }else if(operator.equals("%")){
      System.out.println(num1%num2);

    }else{

    System.out.println("Invalid operator selected.+,-,/,*,%--> only allowed");

    }

	}
}