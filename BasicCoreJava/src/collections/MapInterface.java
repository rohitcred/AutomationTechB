package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Ashish");
		map.put(2, "Babita");
		map.put(3, "Mohit");

		System.out.println(map.get(2));
		
		System.out.println("****************");
		
		Set<Integer> keys=map.keySet();

		for(int key:keys)
		{
			System.out.println(map.get(key));
		}


		/*map.keySet("Anand", true);
		map.put("Danish", false);
		map.put("Karishma", false);
		map.put("Mohit", true);

		System.out.println(map.get("Anand"));*/

	}

}
