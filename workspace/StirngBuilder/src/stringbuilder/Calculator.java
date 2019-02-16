package stringbuilder;

public class Calculator {
	int num;

	public Calculator add(int num) {
		this.num += num;
		System.out.println(this.num);
		return this;
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println(c.num);

		c.add(12);
		c.add(13).add(15);
		System.out.println(c.num);
	}
}
