package encupsulation;

public class Book {

		
 private String title;
 private String author;
 private String type;
  private double price;
  private boolean onSale;
  
  
  public void setBookInformation(String title,String author,String type,double price1,boolean onSale1){
	  setTitle(title);
	  setAuthor(author);
	  setType(type);
	  price=price1;//setPrice(price1);
	  onSale=onSale1;
	  
  }
      public void setTitleAndAuthor(String bookTitle,String bookAuthor){
    	  //title=bookTitle;
    	  //author=bookAuthor;
    	  setTitle(bookTitle);
    	  setAuthor(bookAuthor);
    	  
      }
  public void setOnSale(boolean bOnsale){
	  onSale=bOnsale;
  }
  public boolean getOnSale(){
	  return onSale;
  }
  
  public void setTitle(String bookTitle){
	  title=bookTitle;
  }
  public String getTitle(){
	  return title;
  }
 public void setAuthor(String bookauthor){
	 author=bookauthor;
 }
 public String getAuthor(){
     return author;
 }
 
 public void setType(String type1) {
     type = type1;
 }

 public String getType() {
     return type;

 }

 public void setPrice(double num) {
     price=num;
 }
 
 public double getPrice(){
     return price;
 }

	
	
}


	 
	 
 

