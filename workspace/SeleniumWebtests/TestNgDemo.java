
public class TestNgDemo {

	public static void main(String[] args) {
		@BeforeTest
		public void setUp(){
			System.out.println("This going to run before eeeevrything ");
		}
	}

}
