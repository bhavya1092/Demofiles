package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 

  {
	public void display(List <Integer> l)
	
	{
		System.out.println("Using Enchanced for loop");
		
		for(int x : l)
		{
			System.out.println(x);
		}
			Iterator <Integer> it=l.iterator();
			
			System.out.println("Iterator");
			
			while(it.hasNext())
			{
				int x=it.next();
				System.out.println(x);
			}

	}

	public static void main(String[] args) 
	{
		List <Integer> l =new ArrayList <Integer>();
	       l.add(10);
	       l.add(20);
	       l.add(30);
	       l.add(40);
	       l.add(50);
	       l.add(60);
	       
	         Test t = new Test();
	         t.display(l);
		

	}

}
