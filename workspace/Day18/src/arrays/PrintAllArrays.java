package arrays;

public class PrintAllArrays {

	public static void main(String[] args) {
		String[] fruits={"Banana","Apple","Orange","Kiwi","Cherry","Mango","Melon","Berries"};
		for(String fruit:fruits ){
			System.out.println(fruit);
			System.out.println("Inside for each loop");
		}
     System.out.println("For each loop completed");
	
	// create an array of double, assighn values then print each price with $
	
	double[] prices={234.54,1234.50,500.5,10.99};
	System.out.println(prices.length);
	for(double p :prices){
		System.out.println("$"+p);
	}
	//calculate sum of all prices and print
	double sum=0;
	for(double price:prices){
		//sum=sum+price;
	    sum+=price;
	}
	System.out.println("___Grand total:"+sum);
	}

}
