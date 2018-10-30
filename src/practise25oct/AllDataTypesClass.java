package practise25oct;
import java.util.Scanner;
public class AllDataTypesClass {

	public static void main(String[] args) {
		//program to use all the data types
		//primitive: boolean byte short int long float double char 
		//non primitive: string,arrays
		Scanner sc=new Scanner(System.in);
		int y=1;
		while(y==1)
		{	System.out.println("Which datatypes do you want to work with?:\n1.If primitive\n2.If Non primitive");
		    int y1=sc.nextInt();
		    if(y1==1)
		    {
		    	int y2=1;
		    	System.out.println("There are 8 primitive datatypes and there are three subcategories among them. They are:\n1.Interger datatypes\n2.Floating point datatypes\n3.String datatypes");
		    	y2=sc.nextInt();
		    	if(y2==1)
		    	{ //integer datatype region
		    		int y3=1;
		    		System.out.println("There are 4 integer datatypes:\n1.boolean\n2.short\n3.int\n4.long\nPlease enter the option with which integer datatype you wanna work with:");
		    		y3=sc.nextInt();
		    		if(y3==1)
		    		{//boolean region
		    			boolean bn = false;
		    			System.out.println("The boolean data type has only two possible values: true and false\nPlease Enter some boolean value:");
		    			bn=sc.nextBoolean();
		    			System.out.println("Entered boolean value is:"+bn);
		    			
		    		}
		    		else if(y3==2)
		    		{//short region
		    			short sh = 0;
		    			System.out.println(" The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive)\nPlease enter some short datatype integer value");
		    			sh=sc.nextShort();
		    			System.out.println("Entered short datatype value is:"+sh);
		    		}
		    		else if(y3==3)
		    		{//int region
		    			int in = 0;
		    			System.out.println("By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2(31) and a maximum value of 2(31)-1. In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.\nPlease enter some int datatype value to display ");
		    			in=sc.nextInt();
		    			System.out.println("Entered int datatype value is:"+in);
		    		}
		    		else if(y3==4)
		    		{//long region
		    			long lo;
		    			System.out.println("The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1\nPlease enter some long value to display");
		    			lo=sc.nextLong();
		    			System.out.println("Entered long datatype value is:"+lo);
		    		}
		    		
		    	}
		    	else if(y2==2)
		    	{  //floating datatype region
		    		System.out.println("There are two floating point data types: float and double\nThough both float and double datatype are used to represent floating point numbers in Java, a double data type is more precise than float. A double variable can provide precision up to 15 to 16 decimal points as compared to float precision of 6 to 7 decimal digits.\nAnother significant difference between float and double is their storage requirement, double is more expensive than float. It takes 8 bytes to store a variable while float just takes 4 bytes");
		    		System.out.println("Enter the option with which floating data type you wanna work with:\n1.Float\n2.Double");
		    		int y4;
		    		y4=sc.nextInt();
		    		if(y4==1)
		    		{//float region
		    			float fl;
		    			System.out.println("Please enter some float datatype value");
		    			fl=sc.nextFloat();
		    			System.out.println("Entered float datatype value is:"+fl);
		    			
		    		}
		    		else if(y4==2)
		    		{//double region
		    			double db;
		    			System.out.println("Please enter some double datatype value");
		    			db=sc.nextDouble();
		    			System.out.println("Entered double datatype value is:"+db);
		    		}
		    	}
		    	else if(y2==3)
		    	{  //string datatype region
		    		char ch;
		    		System.out.println("There is only one primitive datatype in string that is char.\n please enter any character to display");
		    		ch=sc.next().charAt(0);
		    		System.out.println("Entered char datatype value is:"+ch);
		    	}
		    }
		    else if(y1==2)
		    {
		    	//non primitive block
		    	String st;
		    	System.out.println("A variable of a non-primitive type doesn't contain the value directly; instead, it is a reference (similar to a pointer) to an object\nString is a defined non primitive data type:\nPlease enter a string value to print:");
		    	st=sc.nextLine();
		    	System.out.println("Entered string datatype literal is:"+st);
		    }
		    
			System.out.println("\nDo you want to play with datatypes:\n1.If yes\n2.If no");
			y=sc.nextInt();
		}
		if(y==2)
			exit(0);
		
		
		

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
