package activities;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<String>();
		hs.add("M");
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		
		System.out.println("Original hashet: "+ hs);
		System.out.println("Size of hashet: "+ hs.size());
		
		System.out.println("Removing A from hashset: "+ hs.remove("A"));
		
		if(hs.remove("Z")) {
			System.out.println("Z is removed from set");
		}
		else {
			System.out.println("Z is not present");
		}
		
		System.out.println("Checking if M is present"+ hs.contains("M"));
		System.out.println("updated set:" + hs);
	}

}
