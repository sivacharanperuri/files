package practise25oct;

public class ExampleStaticPolymorphism {
	
	static void addition(int a, int b, int c)
	{
		System.out.println("The sum of the three numbers is:"+(a+b+c));
	}
	static void addition(int a, int b)
	{
		System.out.println("The sum of the two numbers is:"+(a+b));
	}

	public static void main(String[] args) {
		//Without creating object
		System.out.println("Without creating object");
		ExampleStaticPolymorphism.addition(1,2);
		ExampleStaticPolymorphism.addition(30,40,40);
		
		//Creating object
		System.out.println("Creating object");
		ExampleStaticPolymorphism object1=new ExampleStaticPolymorphism();
		object1.addition(500,2);
		object1.addition(252,540,620);
	}

}
