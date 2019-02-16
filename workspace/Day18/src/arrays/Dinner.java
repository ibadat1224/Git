package arrays;

public class Dinner {
private String person,appetizer,mainEntry;
public static int cakePieces=10;


public Dinner(String person,String appetizer,String mainEntry){
	this.person=person;
	this.appetizer=appetizer;
	this.mainEntry=mainEntry;
	
}
public static void takeAPieceOfcake(){
	if(cakePieces<=0){
		System.out.println("No more cake!!");
	}else{
	cakePieces--;
	}
	
}
public static int getCakePiecesCount(){
	return cakePieces;
	
}
public String getAppetizer() {
	return appetizer;
}
public void setAppetizer(String appetizer) {
	this.appetizer = appetizer;
}
public String getMainEntry() {
	return mainEntry;
}
public void setMainEntry(String mainEntry) {
	this.mainEntry = mainEntry;
}
public static int getCakePieces() {
	return cakePieces;
}
public static void setCakePieces(int cakePieces) {
	Dinner.cakePieces = cakePieces;
}
}


