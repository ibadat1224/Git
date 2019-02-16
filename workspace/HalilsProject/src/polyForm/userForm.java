package polyForm;

public class userForm {

	public static void main(String[] args) {

		Field myField = new Field("Sample Field");
		System.out.println(myField.getFieldDefinition());

		System.out.println(myField.displayLabel());

		Field myField2 = new Field("Another short Label");
		System.out.println(myField2.displayLabel());
	}

}
