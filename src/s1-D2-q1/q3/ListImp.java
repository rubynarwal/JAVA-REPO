package q3;
import java.util.ArrayList;
import java.util.List;


public interface ListImp {

	public static void Listr(List<String> list) {
		for(String city:list) {
			System.out.println(city);
		}
	}
	public static void main(String[] args) {
		List<String> city = new ArrayList<>();
		city.add("har");
		city.add("delhi");
		city.add("goa");
		city.add("hyderabad");
		city.add("kerla");
		
		Listr pl = ListImp :: Listr;
		pl.display(city);
		
		
	}
}
