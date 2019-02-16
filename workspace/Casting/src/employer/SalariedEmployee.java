package employer;

public class SalariedEmployee extends Employee {

	public SalariedEmployee(String name, int ID) {
		super(name, ID);

	}

	double salary;

	public double getSalary() {
		return salary;
	}

	@Override
	public void getPaid() {

	}

}
