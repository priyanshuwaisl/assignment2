package in.waisl.assignment2;
import java.util.*;
// Write a Java program to copy one array list into another?
public class Qns7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 List<String> originalList = new ArrayList<>();
	        originalList.add("Apple");
	        originalList.add("Banana");
	        originalList.add("Orange");

	        // Creating a new ArrayList to copy into
	        List<String> copiedList = new ArrayList<>();

	        	        copiedList.addAll(originalList);

	       
	        System.out.println("Original ArrayList: " + originalList);
	        System.out.println("Copied ArrayList: " + copiedList);

	}

}
