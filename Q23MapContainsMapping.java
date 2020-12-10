package chapter7;

import java.util.HashMap;

public class Q23MapContainsMapping {

	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<String, Integer>();		 
		   hm.put("A",34);		 
		   hm.put("B",66);		   
		   hm.put("C",88);
		   hm.put("D",33);
		   hm.put("E",55);
		   hm.put("F",65); 
		    System.out.println("HashMap elements: "+hm); 
		    System.out.println("\nIs key 'A' exists:");
		    if (hm.containsKey("A")) {
		     System.out.println("yes: " + hm.get("A"));
		    	  }
		     else {
		    	   System.out.println("no");
		    }

		    System.out.println("\nIs key 'B' exists: ");
		     if (hm.containsKey("B")) {
		    	 System.out.println("yes: " + hm.get("B"));
		    	  } 
		     else {
		    	   System.out.println("no");
		    	  }
	} 

}
