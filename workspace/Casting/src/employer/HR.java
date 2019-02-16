package employer;

import java.util.ArrayList;
import java.util.List;

public class HR {

	public static void main(String[] args) {
		List<Employee> all = new ArrayList<>();
		
		all.add(new SalariedEmployee("Jon Snow")  100001,102  );
		all.add(newHourlyEmployee("Tom Bom")  100002,201  );
		all.add(new SalariedEmployee("Drake Write")  100003,103  );
		all.add(new HourlyEmployee("Kity James")  100004,104  );
		all.add(new SalariedEmployee("Brad Cuper")  10000,101  );
		all.add(new SalariedEmployee("Brandan Tulip")  100006,106  );
		
		
		
	}

}
