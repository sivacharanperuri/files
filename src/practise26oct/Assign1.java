package practise26oct;
import java.util.Scanner;
public class Assign1 {

	public static void main(String[] args) {
		/* Take a String of any length from the users.
            Find the count of each character in the string.
            Store the character and its count in a 2 dimensional array 
		 */
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a string:");
		st=sc.nextLine();
		System.out.println("Entered string is:"+st);
		int len=st.length();
		int i,x;
		int[] count=new int[52];
		for(i=0;i<len;i++)
		{	
			if((st.charAt(i)>='A')&&(st.charAt(i)<='Z'))
			{
				x=st.charAt(i)-'A';
				count[x]=count[x]+1;
				
			}
			else if((st.charAt(i)>='a')&&(st.charAt(i)<='z'))
			{
				x=st.charAt(i)-'a';
				count[x+26]=count[x+26]+1;
				
			}
			
			
		}
		{
			for(int k=0;k<52;k++)
			{
				if(count[k]!=0)
				{
					if(k<26)
					{
					  char l='A';
				      for(int m=0;m<k;m++)
					   l++;
			           System.out.println(l+":"+count[k]);
				
					}
					if(k>=26)
					{
						char l='A';
					      for(int m=0;m<k+6;m++)
						   l++;
				           System.out.println(l+":"+count[k]);
					
						
					}
					
			
				}
		    }
		}
	}
}