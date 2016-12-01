package p1;

class Parent

{
	public Parent()
	{
		System.out.println("Super class constructor");
	}
	
	protected void show()
	{
		System.out.println("Parent method");
	}
}
class sample extends Parent
{
	public sample()
	{
		System.out.println("sample constructor");
	}
	public void showSample()
	{
		super.show();
		System.out.println("sample method");
	}
}
public class Child extends Parent{
	
	public Child()
	{
		System.out.println("Child constructor");
	}
	
	public void show()
	{
		super.show();
		System.out.println("Child method");
	}

	public static void main(String[] args) {
		
		Child c1=new Child();
		c1.show();
		sample s1=new sample();
		s1.showSample();
		}

}
