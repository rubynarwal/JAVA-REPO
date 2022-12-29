package q2;
import java.util.ArrayList;

import java.util.Collections;
public class Cities {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("haryana");
		list.add("pune");
		list.add("goa");
		list.add("faridabad");
		list.add("chandigrah");
		
		SRT sort = cities -> {
			Collections.sort(cities);
			return cities ;
			
			
		};
		System.out.println(sort.sortlist(list));
		
	}

}
