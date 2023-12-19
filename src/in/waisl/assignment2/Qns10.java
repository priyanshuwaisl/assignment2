package in.waisl.assignment2;
import java.util.*;
// 10.	Write a Java program to delete all elements from a Tree Map?

public class Qns10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);

        // Displaying the TreeMap before clearing
        System.out.println("TreeMap before clearing: " + treeMap);

        // Clearing all elements from the TreeMap
        treeMap.clear();

        // Displaying the TreeMap after clearing
        System.out.println("TreeMap after clearing: " + treeMap);


	}

}
