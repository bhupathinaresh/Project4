package myProj;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	      ArrayList b=new ArrayList();
		 //  ArrayList <String> b=new ArrayList <String>();
		   
		   b.add("Sushma");
		   b.add("Naresh");
		   b.add("Karthi");
		   b.add("Arha");
		   b.add(3344);
		   b.add('B');
		   
		   System.out.println(b);
		   System.out.println(b.size());
		   System.out.println(b.remove(0));
		   System.out.println(b);
		   System.out.println(b.add("Sam"));
		   System.out.println(b);
		   
		   for (Object s:b)
			{
				System.out.println(s);
			}

	}   

}
