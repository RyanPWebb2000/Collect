import java.util.ArrayList;
import java.util.HashSet;


public class Driver {

	public static void main(String[] args) {
		
		//Create a list containing duplicates
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		
		//Create a set from that list. Since sets cannot have duplicate values it only returns the unique elements of the original list.
		HashSet<Integer> set = new HashSet<Integer>();
		for(Integer i : list) {
			set.add(i);
		}
		
		//Print the unique elements
		System.out.println(set);
	}

}
