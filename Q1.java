package Day4Demo;

import java.util.Scanner;

public class Q1 {
	
	 public static void main(String[] args)
	 {
		 int num, i=2, end, q;
		 
		 int [] arr = new int[100];
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter input:");
		    num = scanner.nextInt();
		    q=num;
		    while(num>0)
		    {
		    	if(num%i==0)
		    	{
		    		arr[i] = i;
		    	}
		    	num = num/i;
		    	i=i+1;
		    	
		    	
		    }
		    end=i;
		    System.out.print(q+"= {");
		    for(i=2;i<end-1;i++)
		    {
		    	System.out.print( arr[i]+ " ");
		    }
		    System.out.print("}");
		 
	 }
}