public class CompareStrings{
	public static void main(String[] args){
	 String userName="testUserName";
	 if( userName.equalsIgnoreCase("TESTUSERname")  ){
	 System.out.println("Valid userName, now Enter Password");
	 }else{
	 System.out.println("Invalid userName, Access denied");

	 }
	}
}