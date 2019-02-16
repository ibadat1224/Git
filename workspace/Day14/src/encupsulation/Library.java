package encupsulation;

public class Library {

	public static void main(String[] args) {
		Book book1=new Book();
	
		book1.setTitle("Selenium CookBook");
		book1.setAuthor("Unmesh");
		book1.setPrice(36.89);
		book1.setOnSale(false);
		
		
		
		//create one more book object/instance.
        Book book2=new Book();
        book2.setTitle("Software Testing");
        book2.setAuthor("Ron Patton");
        book2.setPrice(19.99);
        book2.setOnSale(true);
        
        System.out.println(book1.getAuthor());
        System.out.println(book2.getPrice());
        System.out.println(book2.getTitle());
        
        book2=book1;
        System.out.println(book2.getTitle());
        System.out.println(book1.getAuthor());
        
        book2.setOnSale(true);
        System.out.println(book1.getOnSale());
        Book book3=new Book();
        book3.setBookInformation("Introduction to Java",  "Yang","Harcover", 50.50, false);
        System.out.println(book3.getTitle()+"by"+book3.getAuthor());
        
        
        Book book4=new Book();
        book4.setTitleAndAuthor("Jenkins CI","Unmesh");
        System.out.println(book4.getTitle()+"by"+book4.getAuthor());
        
        
        
    }

}

		
		
	


