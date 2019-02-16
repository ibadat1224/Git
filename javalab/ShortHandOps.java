public class ShortHandOps{
	public static void main(String[] arg){
	    int i =1;
	    System.out.println(i);
	    //i=i+2;
	    i+=2;
	    i+=5; //i=i+5;
        System.out.println(i);
	    
	    i-=10;// 8-10 = -2
	    System.out.println(i);
	   
	    int balance=100;
	    //balance=balance+200;//300
	    balance+=200;//300
	    System.out.println("Current balance:"+balance);

	    balance=balance-6;
	    System.out.println("Current balance:"+balance);

	    int bill=75;
	    balance-=bill;
	    System.out.println("Current balance:"+balance);
   
        String num="125";
        char c='!';
        int iNum=c;      
        System.out.println(iNum);