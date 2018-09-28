package Day4Demo;

import java.util.Scanner;

public class Q7 {
	
	 static String LongestWord(String s) 
	    { 
		 String[] word=s.split(" ");
	        String rts=" ";
	        for(int i=0;i<word.length;i++){
	        	   if(word[i].length()>=rts.length()){
	        	      rts=word[i];
	        	   }
	        	}
	        return(rts);
	    } 
	  
	    public static void main(String[] args) 
		    { 	
	    	
	    	
	    	Scanner s=new Scanner(System.in);
			String str;
			System.out.println("Enter the array:");
			str=s.nextLine();
			Q7  obj=new Q7 ();
			
			System.out.println(obj.LongestWord(str));
		
	    }

}
