package ExCollection;

import java.util.HashMap;
import java.util.Map;

public class MapEx {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(0, "red");
		hashmap.put(1, "blue");
		hashmap.put(2, "green");
		hashmap.put(3, "black");
		hashmap.put(4, "yellow");
		for (Map.Entry x : hashmap.entrySet()) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
	}

}
