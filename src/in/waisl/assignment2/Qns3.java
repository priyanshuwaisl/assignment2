package in.waisl.assignment2;
import java.util.*;
import java.util.stream.Collectors;
// 3.How do you find frequency of each character in a string using Java 8 streams?

public class Qns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String inputString = "Java Concept Of The Day";

        // Using a Map to find the frequency of each character
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Iterating through each character in the string
        for (char c : inputString.toCharArray()) {
            // Updating the frequency in the map
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        // Displaying the frequency of each character
        charFrequencyMap.forEach((character, frequency) ->
                System.out.println("Character: " + character + ", Frequency: " + frequency));


	}

}
