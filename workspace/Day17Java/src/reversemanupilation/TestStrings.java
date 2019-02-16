package reversemanupilation;
import java.util.Scanner;


public class TestStrings {
public static void main(String[] args) {
	
}
  @Test
  public void test1() {
	  Scanner scan=new Scanner(System.in);
      System.out.println("Enter a string to be reversed:");
      String inputString=scan.next();
      
      StringManupilator strManupilator=new StringManupilator();
      String retString=strManupilator.reverseString(inputString);
      System.out.println(retString);
      
      scan.close();
  }
}

  

