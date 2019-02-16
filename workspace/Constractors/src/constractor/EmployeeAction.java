package constractor;

public class EmployeeAction {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setName("Ibadat");
		e1.setEmployeeId(100L);
		e1.setSalary(10000d);

		Employee e2 = new Employee();
		e2.setName("Meder");
		e2.setEmployeeId(200L);
		e2.setSalary(20000d);

		System.out.println(e1.toString());
		System.out.println(e2.toString());

	}

}
