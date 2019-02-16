package arrays;

public class ForLoopsWithArrays {

	public static void main(String[] args) {
		String[] letters={"a","b","c"};
		int index=0;
		System.out.println(letters[index]);
		index++;
		System.out.println(letters[index]);
		index++;
	System.out.println(letters[index]);
		
      for(int index2=0;index2<letters.length;index2++){
    	  System.out.println(letters[index2]);
    
    	 //  print this arrays backwards
    	   
    	   
   		for(int idx=letters.length-1;idx>=0; idx--){
   			System.out.println();
   		}
       }
	}

}
