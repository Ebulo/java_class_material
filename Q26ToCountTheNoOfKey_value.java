package chapter7;

import java.util.HashMap;

public class Q26ToCountTheNoOfKey_value {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();		 
		   hm.put(12,"A");		 
		   hm.put(22,"B");		   
		   hm.put(32,"C");
		   hm.put(42,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 
		    System.out.println("HashMap elements: "+hm);  
		    System.out.println("Size of the hash map: "+hm.size());

	}

}  
