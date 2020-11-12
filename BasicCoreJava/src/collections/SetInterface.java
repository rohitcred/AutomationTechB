package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();

		set.add("Rohit");
		set.add("Rohit");
		set.add("Danish");
		set.add("Ashish");
		set.add("Priya");

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("****************************");

		set = new LinkedHashSet<>();

		set.add("Rohit");
		set.add("Rohit");
		set.add("Danish");
		set.add("Ashish");
		set.add("Priya");

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println("****************************");

		System.out.println("****************************");

		set = new TreeSet<>();

		set.add("Rohit");
		set.add("Rohit");
		set.add("Danish");
		set.add("Ashish");
		set.add("Priya");

		for (String s : set) {
			System.out.println(s);
		}

	}

}
