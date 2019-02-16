public class Password{
	public static void main(String[] args){
	//minumum 6 characters
	//it should contain %
	String password="abc123";
	if (password.length()>=6){
	System.out.println("Length check passed");
	}else{
	System.out.println("Length check Failed.Must bemore than 6 characters");

    if(password.contains("%")){
    	System.out.println("% requirement passed");
    }else{
    	System.out.println("% requirement failed");

	}

	}
      }