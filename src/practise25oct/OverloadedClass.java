package practise25oct;

public class OverloadedClass {
	//different parameter types
	public void display(String name,int number)
	{
		System.out.println("Name:"+name+"\tNumber:"+number);
	}
	public void display(String name,float percentage)
	{
		System.out.println("Name:"+name+"\tPercentage:"+percentage);
	}
	
	//different number of parameters
	public void display(String name,String university)
	{
		System.out.println("Name:"+name+"\tuniversity:"+university);
	}
	public void display(String name,String university,float percentage)
	{
		System.out.println("Name:"+name+"\tuniversity"+university+"percentage:"+percentage);
	}
	//different order of parameters
	public void display(String name, double rollnumber)
	{
		System.out.println("Name:"+name+"\tRollnumber"+rollnumber);
	}
	public void display(double rollnumber, String name)
	{
		System.out.println("Rollnumber:"+rollnumber+"\tName:"+name);
	}
}
