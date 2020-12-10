package chapter7;

import java.util.HashMap;

public class Q25CopyAllOfTheMapping {

	public static void main(String[] args) {
		HashMap<Integer, String> hm1=new HashMap<Integer, String>();		 
		   hm1.put(12,"A");		 
		   hm1.put(22,"B");		   
		   hm1.put(32,"C");
		   hm1.put(42,"D");
		   hm1.put(50,"E");
		   hm1.put(62,"F"); 
		    System.out.println("HashMap 1 elements: "+hm1);  
		    HashMap<Integer, String> hm2=new HashMap<Integer, String>();		 
			   hm2.put(10,"X");		 
			   hm2.put(20,"Y");		   
			   hm2.put(30,"Z");
			   hm2.put(40,"W");
			 System.out.println("HashMap 2 elements: "+hm2); 
			 hm2.putAll(hm1);
			  System.out.println("\nNew map: " + hm2);
	}
   
}
