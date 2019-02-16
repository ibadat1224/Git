package reversemanupilation;

public class StringManupilator {
public static void main(String[] args) {
	
}
	public String reverseString(String inString){
		int String=inString.length();
		String reversed="";
		for(int index=-1;index>=0;index--){
			reversed+=inString.charAt(index);
			
		}
		
		return reversed;
	}
}
