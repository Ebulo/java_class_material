package chapter7;

import java.util.HashMap;

public class Q24ToGetCollectionView {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();		 
		   hm.put(12,"A");		 
		   hm.put(22,"B");		   
		   hm.put(32,"C");
		   hm.put(42,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 
		    System.out.println("HashMap elements: "+hm);  
		    System.out.println("Collection view of the values: "+ hm.values());

	}    

}
 