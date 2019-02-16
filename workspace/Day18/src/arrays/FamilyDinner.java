package arrays;

public class FamilyDinner {

	public static void main(String[] args) {
		Dinner Mom=new Dinner("Mom","Seaweed Salad","Dragon Roll Sushi");
		Dinner Dad=new Dinner("Dad","Miso Soup","Salmon Lovers");
		Dinner Child=new Dinner("Child","Shrimp Tempura","Noodles");
		
		System.out.println(Mom.getAppetizer());
		System.out.println(Dad.getMainEntry());
		System.out.println(Dad.getAppetizer());
		
	System.out.println("Cake pieces:"+Dinner.getCakePiecesCount());
	Dad.takeAPieceOfcake();
	Child.takeAPieceOfcake();
	System.out.println("Cake pieces:"+Dinner.getCakePiecesCount());
	
	Mom.takeAPieceOfcake();
	Mom.takeAPieceOfcake();
	System.out.println("Child Cake pieces:"+Child.getCakePiecesCount());
	
  Dinner.takeAPieceOfcake();
  Dinner.takeAPieceOfcake();
  System.out.println("dad cake Pieces:"+Dad.getCakePiecesCount());
  
 Child.takeAPieceOfcake();
 Child.takeAPieceOfcake();
 Mom.takeAPieceOfcake();
 Dad.takeAPieceOfcake();
 
 System.out.println(Dinner.getCakePiecesCount());
 
 Dinner.takeAPieceOfcake();
 
	}

}
