public class LogicalOperators{
	public static void main(String[] args){
	int price=500;
	//i will buy if the price between 700 and 1200;
	if(price>700 && price<=1200){
	   System.out.println("Lets buy it!");

	}else if(price>1200 && price<=1500){
	    System.out.println("Lets negotiate!");

	}else if(price<700){
	 System.out.println("Great Deal!");

	}else{
	  System.out.println("Not buying it");

	}
	}
}