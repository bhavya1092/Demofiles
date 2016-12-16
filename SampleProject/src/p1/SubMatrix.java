package p1;

public class SubMatrix 

{
	int row,column;
	int m1[][]={{1,3,5},{2,5,6},{7,3,4}};
	int m2[][]={{2,4,2},{8,4,2},{6,4,1}};
	int m3[][]=new int[3][3];
	
	  public void displaySubMatrix()
	
	  {
       
		 System.out.println("Matrix Subtraction");
         System.out.println("First Matrix :");
    	for( int i=0;i<3;i++)
    	{
    		for( int j=0;j<3;j++)
    			
    		{
    			System.out.print("  " +m1[i][j]);
    			
    		}
    		   System.out.println();
    	}
    	
	         System.out.println("Second Matrix");
	          
	           for( int i=0;i<3;i++)
	           {
	        	   for(int j=0;j<3;j++)
	        	   {
	        		   System.out.print("  " +m2[i][j]);
	        		   
	        	   }
	        	         System.out.println();
	        	   
	           }
	        	   
	  
	  
	          
	             System.out.println("Resulting m3 : ");
	               {
	               
	               for(int i=0;i<3;i++)
	            	   
	               {
	            	   for(int j=0;j<3;j++)
	            	     {
	            		   m3[row][column]=m1[i][j]-m2[i][j];
		            	   
	            		   
	            		   System.out.print("  " +m3[row][column]);
	                      }
	            	  
	            	   System.out.println();
	            	   
	            	   //m3[row][column]=m1[row][column]-m2[row][column];
	            	   
	               
	            }         
	               }
	  }
	               
	            public static void main(String[] args) 
	         
	            {
		SubMatrix s1=new SubMatrix();
		s1.displaySubMatrix();
		
	            }
	}


