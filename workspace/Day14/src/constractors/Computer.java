package constractors;

public class Computer {
   private int ram;
   private String model;
   private String os;
   private double  price;

   public Computer(){
	   System.out.println("No argument constractor");
   }
   
   public Computer(String model,String os,int ram,double price){
	   setModel(model);
	   setOs(os);
	   setRam(ram);
	   setPrice(price);
	   
   }
   public void Computer(){
	   System.out.println("No argument or method with same name as class");
   }
   
   
   public int getRam() {
	return ram;
}
public void setRam(int ram) {
	this.ram = ram;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getOs() {
	return os;
}
public void setOs(String os) {
	this.os = os;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
   
	
	
}
