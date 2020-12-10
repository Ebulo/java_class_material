package chapter7;

import java.util.HashMap;
import java.util.TreeMap;

public class Q27TogetFirstNLastKey {

	public static void main(String[] args) {		
		 TreeMap <Integer,String> tm = new TreeMap <Integer,String> ();
		   tm.put(12,"A");		 
		   tm.put(22,"B");		   
		   tm.put(32,"C");
		   tm.put(42,"D");
		   tm.put(70,"E");
		   tm.put(62,"F"); 
		  System.out.println("TreeMap elements: " +tm);
		  System.out.println("Lowest key: " +tm.firstKey());
		  System.out.println("Highest key:" + tm.lastKey());
	}  

}
