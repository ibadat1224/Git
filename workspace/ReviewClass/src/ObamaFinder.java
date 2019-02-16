
public class ObamaFinder {

	public static void main(String[] args) {
		
		 
		        String[] nameArray = { "John", "Obama", "Sen", "dave", "Bush" };
		        String target = "Obama";
		 
		        boolean obamaFound = valueExist(nameArray, target) ; 
		        //System.out.println(obamaFound);
		        }
		 
		    public static boolean valueExist(String[] strArr, String strValue) {
		 
		        boolean result=false; 
		 
		        for (String item : strArr) {
		 
		            System.out.println("comparing " + item + " to " + strValue);
		 
		            if (item.equals(strValue)) {
		                System.out.println("obama found");
		                result = true; 
		                break; 
		            }else{
		                result = false; 
		            }
		                
		        }
		 
		        return result;
		    }
		 
		}
		 


	


