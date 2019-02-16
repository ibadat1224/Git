package arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		String[] words={"All","WE","You","Good","Hi","Books","Internet","C#","W++"};
		printArray(words);
		String[] cities={"Tyson","McLean","Pitt","Chicago"};
		printArray(cities);
		
		int[] scores={1,2,3,4,5,6,7,8,9,10};
		printArray(scores);
	}
	//create a method called printArray that accepts an array of strings
	//prints each item in same line separated by comma
	
	public static void printArray( String[] args ){
		for(String elem : args){
			System.out.print(elem+",");
		}
		System.out.println();
	}
	
	public static void printArray( int[] args ){
		for(int elem : args){
			System.out.print(elem+",");
		}
		System.out.println();
	}
	
}

	
	
	
	
	
	
	
	
	