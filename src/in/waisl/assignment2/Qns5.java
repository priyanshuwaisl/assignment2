package in.waisl.assignment2;
import java.util.*;
import java.util.stream.Collectors;



public class Qns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		ArrayList<Integer>l2=new ArrayList<>();
		
		for(int i=0;i<listOfIntegers.size()-1;i++) {
			if(listOfIntegers.get(i)%5==0) {
				l2.add(listOfIntegers.get(i));
				
				
			}
			
		}
		
		System.out.println("Orignal list : " + listOfIntegers);
		System.out.println("Multiple of 5 list: " + l2);
	    

	}

}
