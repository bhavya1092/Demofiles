package p1;

import java.util.ArrayList;
import java.util.List;

public class Test 
{
	
   public void display(List <Integer>list)
	{
		for(int x :list)
			System.out.println(x);
	}

	public static void main(String[] args) 
	{
		
     List <Integer> l=new ArrayList <Integer>();
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
