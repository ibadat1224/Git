package whileLoop;

import java.util.Scanner;

public class PrintLetters {
public static void main(String[] args){
 Scanner input=new Scanner(System.in);//create a new scanner
 System.out.println("Enter a word to print:");
 String word=input.nextLine();//let user type a string
 int length=word.length();//
 //System.out.println(length);
// System.out.println(word.charAt(2));;
 for(int index=0;index<length;index++){  //loop from 0 till the lrngth of loops
 System.out.println(word.charAt(index));
}
 
}
}