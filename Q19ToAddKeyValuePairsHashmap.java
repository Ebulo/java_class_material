package chapter7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q19ToAddKeyValuePairsHashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		 
		   hm.put(10,"A");	  	 
		   hm.put(12,"B");		   
		   hm.put(30,"C");
		   hm.put(32,"D");
		   hm.put(50,"E");
		   hm.put(62,"F"); 
		   System.out.println(hm);
		  /* HashMap<Integer,String> map=new HashMap<Integer,String>();  
		      map.put(77,"X"); 
		      map.put(80,"Y"); 
		      map.putAll(hm);
		      for(Map.Entry m:map.entrySet()){    
		           System.out.println(m.getKey()+" "+m.getValue());    
		          }*/
		          



		  /*    Iterator it=hm.entrySet().iterator();
		   while(it.hasNext())
		   {
		      Map.Entry add=(Map.Entry)it.next();		 
		      System.out.println(add.getKey()+"–>"+add.getValue());
		   }*/
		    
	}}
