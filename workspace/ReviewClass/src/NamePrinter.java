
public class NamePrinter {

	public static void main(String[] args) {
String[] nameArray = {"John","dave","Sen","Obama","Bush"}; 
        
        // for loop 
        //System.out.println(nameArray[3]);
//        for (int i = 0; i < nameArray.length; i++) {
//            System.out.println("name number "+(i+1) +" : " + nameArray[i] );
//            System.out.println("name of the length is "+ nameArray[i].length());
//        }
//        
//        for (String studentName : nameArray) {
//            System.out.println("name of the student is "+ studentName);
//            System.out.println("name of the length is "+ studentName.length());
//            
//        }
        
        // reverse order 
        for (int i = nameArray.length-1; i >= 0; i--) {
            System.out.println("name number "+(i+1) +" : " + nameArray[i] );
            System.out.println("name of the length is "+ nameArray[i].length());
        }

	}

}
