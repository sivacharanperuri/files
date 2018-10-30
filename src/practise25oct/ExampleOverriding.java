package practise25oct;
import java.util.Scanner;
public class ExampleOverriding {

	public static void main(String[] args) {
		LifeClass lif=new LifeClass();
		LifeClass ani=new AnimalClass();
		LifeClass hum=new HumanClass();
		LifeClass bir=new BirdsClass();
		 /* There is no need to call animal activity in addition to human activity because
		  we included super class in human class*/
		 Scanner sc =new Scanner(System.in);
		 int y=1;
		while(y==1)
		{
		 System.out.println("Do you want to know some details about the lifesystem\nPlease enter:\n1.If yes\n2.If not");
		 int input=sc.nextInt();
		 if(input==1)
		 {  
			 System.out.println("Please enter the option among which one you would like to know:\n1.Activities of living organisms\n2.Activities of animals\n3.If you want to know the activity of sub categories of animals");
		  int input1=sc.nextInt();
		    if(input1==1)
			 lif.activity();
		    else if(input1==2)
		       ani.activity();
		    else if(input1==3)
		    {
		    	System.out.println("Enter the option:\n1.Activities of Humans\n2.Activities of birds");
		        int input2=sc.nextInt();
		        if(input2==1)
		    	hum.activity();
		        else if(input2==2)
		        {
		        	bir.activity();
		        }
		    }
		 }
		 else
			 System.exit(0);
		 System.out.println("Do you still want to know some other details:\n1.IF yes\n2.If no");
		 
		y=sc.nextInt();
	    }
	}
}
