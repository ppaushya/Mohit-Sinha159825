package Day4Demo;

import java.util.Scanner;

public class Q5 {

	public void ReverseOrder(String str)
	{
		char t[]=new char[str.length()];
		char p[]=new char[str.length()];
		
		int i,j=0;
		
		
		for(i=0;i<str.length();i++)
		{
			t[i]=str.charAt(i);
		}
		
		
		for(i=str.length()-1;i>=0;i--)
		{
			p[j] = t[i];
			j=j+1;
		}
		
		
		for(i=0;i<str.length();i++)
		{
			System.out.println(p[i]);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the input array:");
		str=s.next();
		Q5  obj=new Q5 ();
		
		obj.ReverseOrder(str);
		

	}
}