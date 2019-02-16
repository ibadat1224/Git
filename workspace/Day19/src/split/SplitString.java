package split;

public class SplitString {

	public static void main(String[] args) {
		String credentials="testuserid,testuserPwd,test";
		
		String[] arrayCreds=credentials.split(",");
		
		System.out.println(arrayCreds.length);
		System.out.println(arrayCreds[0]);
		System.out.println(arrayCreds[1]);
		System.out.println(arrayCreds[2]);

		String[] arr=credentials.split("user");
		System.out.println(arr.length);
		 for(String string:arr){
			 System.out.println(string);
		 }
		 String sentence="I love java programming language exercises, they are fun";
		 String[] words=sentence.split(" ");
		 System.out.println("Number of words:"+words.length);
		 
		 
	}

}
