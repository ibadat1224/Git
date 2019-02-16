package zoo;

public class Tiger extends Animal {

	public static void main(String[] args) {
		Tiger t = new Tiger();
		t.makeNoise();
		t.getAnimalName();
	}

	public String getAnimalName() {
		return super.getAnimalName() + " Tiger";

	}

	@Override
	public void makeNoise() {
		eat();
		super.eat();
		this.eat();
		super.makeNoise();
		System.out.println("Tiger Roar!!!");
	}
}
