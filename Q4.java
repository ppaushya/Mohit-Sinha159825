package Day4Demo;

import java.util.Scanner;

public class Q4 {
	
	public String LetterChanges(String str)
	{
		char ch[]=new char[str.length()];
		char ch1[]=new char[str.length()];
		int pr[]=new int[str.length()];
		int pr1[]=new int[str.length()];
		int i,j;
		
		char temp;
		
		for(i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		for(i=0;i<str.length();i++) {
				pr[i] =  (int) ch[i];
		}
		
		for(i=0;i<str.length();i++)
		{
		         pr1[i]=pr[i]+1;
        } 
         
		for(i=0;i<str.length();i++)
		{
			ch1[i]=(char) pr1[i];
		}
		
		
        String st = new String(ch1); 
        return st; 
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the array:");
		str=s.nextLine();
		Q4  obj=new Q4 ();
		
		System.out.println(obj.LetterChanges(str));
		

	}


}
