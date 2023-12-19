package in.waisl.assignment2;
import java.util.*;
import java.util.stream.Collectors;

public class Qns2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		System.out.println("Orignal strings : "+listOfStrings);
		
		List<String>listOfNewStrings = listOfStrings.stream().distinct().collect(Collectors.toList());
 
		
		System.out.println("New strings : "+listOfNewStrings);
		
	}

}
