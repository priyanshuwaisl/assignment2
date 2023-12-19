package in.waisl.assignment2;
import java.util.*;

import java.util.stream.Collectors;

public class Qns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		System.out.println("Orignal strings : "+decimalList);
		
		//List <Double> sortedDecimals = decimalList.stream().sorted(Comparator.reverseOrder())
		List<Double> sortedDecimals = decimalList.stream()
                .sorted((d1, d2) -> Double.compare(d2, d1)) // Sorting in reverse order
                .collect(Collectors.toList());
		System.out.println("Sorted list in reverse order: " + sortedDecimals);
    
		}
		
	}


