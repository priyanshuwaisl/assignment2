package in.waisl.assignment2;
import java.util.*;
// 8.	Write a Java program to join two array lists?
public class Qns8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        
        System.out.println("Orignal array list-1: " + list1);


        // Creating the second ArrayList
        List<String> list2 = new ArrayList<>();
        list2.add("Grapes");
        list2.add("Mango");
        list2.add("Pineapple");
        System.out.println("Orignal array list-1: " + list2);


             list1.addAll(list2);

       
        System.out.println("Joined ArrayList: " + list1);


	}

}
