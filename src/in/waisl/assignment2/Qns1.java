package in.waisl.assignment2;
import java.util.*;

public class Qns1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer>l1=new ArrayList<>();
		ArrayList<Integer>l2=new ArrayList<>();
		ArrayList<Integer>l3=new ArrayList<>();
		
		l1.add(71);
		l1.add(18);
		l1.add(42);
		l1.add(21);
		l1.add(67);
		l1.add(32);
		l1.add(95);
		l1.add(14);
		l1.add(56);
		l1.add(87);
		
		System.out.println("Orignal array list"+l1);
		
		for(int i=0;i<l1.size()-1;i++) {
			if(Integer.valueOf(l1.get(i))%2==0) {
				l2.add(l1.get(i));
				
			}
			else {
				l3.add(l1.get(i));
			}
		}
		
		
		System.out.println("Even numbers : "+l2);
		System.out.println("Odd numbers : "+l3);
		
		
		
		
		
		
		

	}

}
