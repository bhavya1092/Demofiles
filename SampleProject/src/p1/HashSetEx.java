package p1;

import java.util.HashSet;

public class HashSetEx 

{
	public void displayHashDetails()
	{
		HashSet<String> hset =new HashSet<String>();
		
		hset.add("Bananna");
		hset.add("Orange");
		hset.add("peach");
		hset.add("apple");
		hset.add("grapes");
		
		hset.add("grapes");
		hset.add("peach");
		
		hset.add(null);
		hset.add(null);
		
		System.out.println(hset);
		
		
	}

	

	public static void main(String[] args) 
	{
	
	HashSetEx h1=new HashSetEx();
	h1.displayHashDetails();
	
	
		

	}

}
