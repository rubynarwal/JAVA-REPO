package q1;

import java.util.ArrayList;
import java.util.List;
public class Demo {
	public static void main(String[] args) {
		List<Emplo> list = new ArrayList<>();
		list.add(new Emplo(10, "akshma", "Surat", 10000));
		list.add(new Emplo(11, "ritu", "haryana", 5000));
		list.add(new Emplo(12, "akshma", "Chennai", 2000));
		list.add(new Emplo(13, "ritu", "haryana", 5200));
		list.add(new Emplo(14, "akshma", "haryana", 2400));
		list.add(new Emplo(15, "ritu", "haryana", 5000));
		list.add(new Emplo(16, "ritu", "Banglore", 8000));
		list.add(new Emplo(17, "ritu", "haryana", 51000));
		list.add(new Emplo(18, "ritu", "haryana", 21000));
		list.add(new Emplo(19, "akshma", "haryana", 35000));
		
		Grace ap = (Emplo emp) -> {
			if(emp.getSalary()<=5000) {
				emp.setSalary(emp.getSalary()+1000);
			}
			return emp;
			
				
		};
		
		for(Emplo emp:list) {
			
			System.out.println(ap.addGr(emp));
		}
		

	}
	
}
