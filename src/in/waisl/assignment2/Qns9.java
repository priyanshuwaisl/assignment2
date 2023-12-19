package in.waisl.assignment2;
import java.util.*;

public class Qns9 {

	public static void main(String[] args) {
	
		 Map<String, Integer> map = new HashMap<>();
	        map.put("One", 1);
	        map.put("Two", 2);
	        map.put("Three", 3);

	        // Specified key for which you want to get the value
	        String keyToFind = "Two";

	        // Getting the value associated with the specified key
	        Integer value = map.get(keyToFind);

	       
	        if (value != null) {
	            System.out.println("The value for key '" + keyToFind + "' is: " + value);
	        } else {
	            System.out.println("Key '" + keyToFind + "' not found in the map.");
	        }

	}

}
