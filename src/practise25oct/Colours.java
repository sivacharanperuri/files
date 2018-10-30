package practise25oct;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Colours {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings:");
		int l=sc.nextInt();
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter the Strings"+i);
			//arr.add(sc.next());
			arr.add(sc.next());
		}
	   Random ran=new Random();
		System.out.println("how many elements you want to select in random");
		int k=sc.nextInt();
		for(int i=0;i<k;i++)
		{
			int a=ran.nextInt(l);
			System.out.println(arr.get(a));
			
		}

	}

}
