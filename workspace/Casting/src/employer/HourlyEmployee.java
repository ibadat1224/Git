package employer;

public class HourlyEmployee extends Employee {

	int wage;
	String hours;

	public HourlyEmployee(String name, int ID, int wage, String hours) {
		super(name, ID);
		this.wage = wage;
		this.hours = hours;
	}

	@Override
	public void getPaid() {

	}

	@Override
	public String toString() {
		return "HourlyEmployee [name=" + name + ", ID=" + ID + ", Wage=" + wage + ",hour=" + hours + "]";
	}
}
