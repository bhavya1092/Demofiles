package p2;

public class Palindrome 
{
	public void showPalindrome()
	{
	int num=10;
	int rev=0,sam;
	{
	while(num<0)
	{
		sam=num %10;
		rev= rev *10 +sam;
		num=num/10;
	}	
	{
	if(rev==num)
		System.out.println(" Is a Palindrome Number"+num);
	else
	    System.out.println("Is not a Palindrome Number"+num);
	}
	}
	}
	
	public static void main(String[] args) 
	{
	Palindrome p1=new Palindrome();
	p1.showPalindrome();

	}

}
