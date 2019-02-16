public class MultiIfs{
	public static void main(String[] args){
	int score=-11;//1-5, 5 is highest

	if(score==5){
	  System.out.println("Excellent!");
	}else if(score==4){
	  System.out.println("Good");

	}else if(score>0 && score<4){
	  System.out.println("Poor");
}else{
	System.out.println("Out of range.Scores are 1-5 only!");
}
	}
	}
