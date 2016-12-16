package p1;

import java.util.ArrayList;
import java.util.List;

   public class Book 
  
     {
	  
 

public void displayBookDetails()
 
    {
	
	Book2 book;
	
	
	
	List<Book2> books=new ArrayList<Book2>();
	
	
	book = new Book2(101,"Java",200);
	books.add(book);
	
	book = new Book2(102,"Spring",300);
	books.add(book);
	
	book = new Book2(103,"Hibernate",400);
	books.add(book);
	
	book = new Book2(104,"HTML",500);
	books.add(book);
	
     for(Book2 b : books)
     {
  
		System.out.println("ID :" +b.getId());
		System.out.println("Name :" +b.getName()); 
		System.out.println("Price :" + b.getPrice());
		
      }
    }
	
	  public static void main(String[] args) 
	
	  {
		  Book b1 = new Book();
		  b1.displayBookDetails();
	  
	  }
	

	    }


