public class SalesReciept{
	public static void main(String[] args){
	//declare variables
	    String item1="Bread";
	    String item2="Banana";
	    String item3="Peanut Butter";

	    double item1Price=5.99;
	    double item2Price=2.50;
	    double item3Price=5.99;

	    double final TAX_RATE=0.05;//5%tax
	    //perform calculations 
	    //get subtotal
	    double subTotal=item1Price+item2Price+item3price;
        //subTotal+=item2Price;
        //subTotal+=item3Price;

        //calculate tax
        double tax=subTotal*TAX_RATE;
        //calculate total after tax
        double totalPrice=subTotal+tax;

        String company="Giant";

        System.out.println("---------------------------------");
        System.out.println("-------Welcome To" +company+"-------");
        System.out.println("Date: 04/23/2017 10:57 AM");

	}
}

  