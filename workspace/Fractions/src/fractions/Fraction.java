package fractions;

public class Fraction {
	public int num;
	public int den;

	public Fraction(int n, int d) {
		num = n;
		den = d;
	}

	// fraction 10/1==10
	public Fraction(int n) {
		num = n;
		den = 1;
	}

	// fraction 0/1==0
	public Fraction() {
		this(0, 1);
	}

	public boolean equals(Object o) {
		// if o is a null
		if (o == null) {
			return false;
		}
		// if o is a same object as this
		if (o == this) {
			return true;
		}
		// if o is not fraction
		if (!(o instanceof Fraction)) {
			return false;

		}
		// o is a fraction object
		// cast the argument object into a fraction
		Fraction t = (Fraction) o;
		return (num == t.num && den == t.den);

	}

	//
	// overriden
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(num);
		s.append("/");
		s.append(den);
		return s.toString();
		// return num + "/" + den;

	}

	private int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
