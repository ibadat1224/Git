package employer;

public abstract class Employee {

	String name;
	int ID;

	public Employee(String name, int ID) {
		super();
		this.name = name;
		this.ID = ID;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public abstract void getPaid();

	@Override
	public String toString() {
		return "Employee [name=" + name + ", ID=" + ID + "]";
	}

	public final void displayEmployeePolicy() {
		System.out.println();
	}

	static void showEmployeeManual() {

	}
}
