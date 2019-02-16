package mypakcage;

public class VotingMachine {

	public static void main(String[] args) {
		// how many ways of creating Voter Object
		Voter v1 = new Voter("Adam", 25);
		/// Voter.count++;
		Voter v2 = new Voter("Jon", 27);
		/// Voter.count+++;
		System.out.println(Voter.count);

		v1.getName();
		v2.getName();
		v1.getName();
		v2.getName();
		v1.getName();
		v2.getName();

		System.out.println(v1.countOfGetNameCall);

	}

}
