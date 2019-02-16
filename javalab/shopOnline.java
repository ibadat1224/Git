
public class shopOnline{
	public static void main(String[] args){
	boolean onSale=false;
	boolean freeShipping=true;
    int price=510;

	if(onSale && freeShipping){
	System.out.println("Buying,on sale and free shipping");
     
	}else if(onSale || freeShipping && price<100){
	System.out.println("Buying,either on sale or free shipping and price less than 100");

    }else if( (!onSale && !freeShipping) && price<70){
	System.out.println("Buying,price is less than $70");

}else{
	System.out.println("Not buying it");
   }
     }
       }