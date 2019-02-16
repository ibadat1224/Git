public class SalesReciept{
	public static void main(String[] args){
	//declare variables
	    String item1="Bread";
	    String item2="Banana";
	    String item3="Peanut Butter";

	    double item1Price=5.99;
	    double item2Price=2.50;
	    double item3Price=5.99;

	    final double TAX_RATE=0.05;//5%tax
	    //perform calculations 
	    //get subtotal
	    double subTotal=item1Price+item2Price+item3Price;
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
        System.out.println();//add an empty line
        System.out.println("---------------");
        System.out.println("1."+item1+"   $"+item1Price);
        System.out.println("2."+item2+"   $"+item2Price);
        System.out.println("3."+item3+"   $"+item3Price);
        System.out.println();
        System.out.println("Subtotal:    $"+subTotal);
        System.out.println("Tax:    $"+tax);
        System.out.println("-------------");
        System.out.println("Total:    $"+totalPrice);

        System.out.println();
        System.out.println("Thank you for shopping with us.See you soon again!");


	}
}

  