package Day4Demo;

import java.util.Scanner;

public class Q2 {
	
	public void Alphabetsoup(String str)
	{
		char t[]=new char[str.length()];
		
		int i,j;
		
		char temp;
		
		for(i=0;i<str.length();i++)
		{
			t[i]=str.charAt(i);
		}
		
		
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++)
			{
				if(t[i]>t[j])
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
			}
		}
		
		
		for(i=0;i<str.length();i++)
		{
			System.out.println(t[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the input array:");
		str=s.next();
		Q2  obj=new Q2 ();
		
		obj.Alphabetsoup(str);
		

	}

}
