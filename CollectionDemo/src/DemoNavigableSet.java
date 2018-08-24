import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<String> set = new TreeSet();
		
		set.add("India");
		set.add("Sri Lanka");
		set.add("New Zealand");
		set.add("Amsterdam");
		
		System.out.println(set);
		System.out.println(set.headSet("India", true));
		System.out.println(set.tailSet("India", false));

	}

}