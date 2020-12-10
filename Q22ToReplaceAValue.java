package chapter7;

import java.util.HashMap;
import java.util.Map;

public class Q22ToReplaceAValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();		 
		   hm.put(12,"A");		 
		   hm.put(22,"B");		   
		   hm.put(32,"C");
		   hm.put(42,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 
		    System.out.println("HashMap elements: "+hm);  
		    hm.replace(22, "Araddhya");
		    System.out.println("\nNew HashMap elements: "+hm);

	}  

}
 