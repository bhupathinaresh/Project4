package myProj;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//HashMap h=new HashMap();
		HashMap <Integer,String> h= new HashMap <Integer,String> ();
		HashMap <Integer,String> g= new HashMap <Integer,String> ();
		h.put(101, "Naresh");
		h.put(102, "Karthi");
		h.put(103, "Arha");
		h.put(104, "Raju");
		h.put(105, "Sushma");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.remove(102));
		System.out.println("before mapping"+h);
		//h.putAll(g);
		//System.out.println ("after mapping" +h);
		//System.out.println("after mapping" +g);
		
		  for(Map.Entry m h.entrySet()) 
		  { 
			  System.out.println(m.getKey()+" "+m.getValue());
			
		   }
		 

	}

}
