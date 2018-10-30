package practise25oct;

public class ExampleMethodOverloading {

	public static void main(String[] args) {
		//Method overloading with different types of parameters
		OverloadedClass obj=new OverloadedClass();
		System.out.println("Overloading by changing the type of parameter:");
		obj.display("charan", 95426);
		System.out.println("Changing the second parameter from int to float");
		obj.display("charan", 95.356f);
		
		//Method overloading with the difference in the number of parameters
		System.out.println("\nOverloading by changing number of parameters:");
		obj.display("charan","Vidyanikethan", 95.356f);
		System.out.println("Changing number of parameters from 3 to 2");
		obj.display("charan", "Vidyanikethan");
		
		//Method overloading with changing the order of parameters
		System.out.println("\nOverloading by changing the order of parameters:\n");
		obj.display(240876,"charan");
		System.out.println("Changing the order of string and char data types");
		obj.display("charan", 240876);
		
	}

}
