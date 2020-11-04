import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


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
		
		
		//Create a HashMap containing the same elements as list (Take note of the insertion order)
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		hm.put(5, 5);
		hm.put(4, 4);
		hm.put(100000000, 7);
		hm.put(10, 10);
		hm.put(111, 500);
		hm.put(11, 600);
		
		//Print to demonstrate that the order is not guaranteed and it is not sorted
		System.out.println(hm);
		
		//Create a TreeMap with the same values as the HashMap
		TreeMap<Integer, Integer> tm = new TreeMap<>();
		
		tm.put(5, 5);
		tm.put(4, 4);
		tm.put(100000000, 7);
		tm.put(10, 10);
		tm.put(111, 500);
		tm.put(11, 600);
		
		//Print to demonstrate the the order is guaranteed to be sorted
		System.out.println(tm);
		
		/*
		 * You should use a tree amp if you need to guarantee the order of the pairs
		 */
	}

}
