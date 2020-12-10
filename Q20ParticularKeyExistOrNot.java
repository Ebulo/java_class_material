package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q20ParticularKeyExistOrNot {
	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();		 
		   hm.put(10,"A");		 
		   hm.put(12,"B");		   
		   hm.put(30,"C");
		   hm.put(32,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 	
		   for(Map.Entry m : hm.entrySet()){    
		  	    System.out.println(m.getKey()+" "+m.getValue());   
		      }
		      System.out.println("Key exist/not: "+hm.containsKey(30));
		      System.out.println("value exist/not: "+hm.containsValue("C")); 
	}

}
 