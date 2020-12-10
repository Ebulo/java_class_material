package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q21ToRemoveParticularKeyOrValue {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();		 
		   hm.put(12,"A");		 
		   hm.put(22,"B");		   
		   hm.put(32,"C");
		   hm.put(42,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 
		    System.out.println("HashMap elements: "+hm);  
		
		   hm.remove(22, "B");  
		    System.out.println("\nNew HashMap elements: "+hm);  
	} 

}
/* System.out.println("HashMap elements: ");
for(Map.Entry m : hm.entrySet()){    
	    System.out.println(m.getKey()+" "+m.getValue());    
{*/
