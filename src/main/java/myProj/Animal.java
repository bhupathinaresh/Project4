package myProj;

public class Animal {
	
	String color="White";
	public void displayColor()
	{
		System.out.println(color);
	}
	public void eating()
	{
		System.out.println("Eating....");
	}
	
	Animal()
	{
		System.out.println("Animal is created");
	}
	
}
class Dog extends Animal
{
	String color="Black";
	public void displayColor()
	{
		System.out.println(color);
		System.out.println(super.color);
		}
	public void eating()
	{
		//System.out.println("Eating");
		super.eating();
	}
	
	public Dog()
	{
		super();
		System.out.println("Dog is created");
		
		
	}
}

