package exeption;

import java.io.IOException;

public class Final {

	public static void main(String[] args) {

	}

}

class Super {
	void playWithFire() throws IOException {

	}

	void playWithFire1() throws RuntimeException {

	}
}

class Sub extends Super {

	@Override
	void playWithFire() {

		// void playWithFire() throws ClassNotFoundException{ BAD

	}
}