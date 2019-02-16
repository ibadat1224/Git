public class eMail{
	public static void main(String[] args){
	String email="ibadat1224@gmail.com";
	int count=email.length();
	System.out.println(count);
	System.out.println(email.toLowerCase());
	System.out.println(email.toUpperCase());
    char firstChar=email.charAt(0);
    char lastChar=email.charAt(count-1);
    System.out.println(firstChar+""+lastChar);
    boolean validEmail=email.contains("@");
    System.out.println("Is it a valid emai?-"+validEmail);
    validEmail=email.contains(".com");
    System.out.println("Is it a valid email?-"+validEmail);
    validEmail=email.endsWith(".com");
    String firstName="ibadat";
    System.out.println("Is it a valid email?-"+validEmail);
    validEmail=email.startsWith(firstName);
    System.out.println("Is it a valid email?-"+validEmail);
    String domain=email.substring(6);
    System.out.println("Domain name:"+domain);
    int pos=email.indexOf("@");
    domain=email.substring(pos+1);
    System.out.println("Domain name:"+domain);
    domain=email.substring(email.indexOf("@")+1);
    System.out.println("Domain name:+domain");
    String portion=email.substring(0,3);
    System.out.println(portion);
    System.out.println(email);
}
  }