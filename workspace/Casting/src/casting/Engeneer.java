package casting;

public class Engeneer extends Person implements Smarty {

	int trainingID;

	public Engeneer(String name, int age, int trainingID) {
		super(name, age);
		this.trainingID = trainingID;

	}

	public int getTrainingID() {
		return trainingID;
	}

	public void setTrainingID(int trainingID) {
		this.trainingID = trainingID;
	}

	void design(String name) {
	}

	@Override
	public String toString() {
		return "Engeneer [name = " + name + ", Age= " + age + ", TrainingID =" + trainingID + "]";
	}

	public static void main(String[] args) {
		Engeneer e1 = new Engeneer("Tom", 30, 12345);
		// System.out.println(e1);

		Person e2 = new Engeneer("Kate", 20, 23456);
		// System.out.println(e2);

		Object e3 = new Engeneer("Jake", 35, 65789);
		// System.out.println(e3);

		System.out.println(e1);
		e1.design("rocket");

		System.out.println(e2.toString());

		Engeneer c1 = (Engeneer) e2;
		c1.design("airplane");
	}

}
