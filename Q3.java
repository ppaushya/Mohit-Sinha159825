package Day4Demo;
import java.util.Scanner;

public class Q3 {
	
	public String LetterCapitalize(String str)
	{
		char ch[]=new char[str.length()];
		
		int i,j;
		
		char temp;
		
		for(i=0;i<str.length();i++)
		{
			ch[i]=str.charAt(i);
		}
		
		
		for(i=0;i<str.length();i++)
		{ 
            if (i == 0 && ch[i] != ' ' ||  
                ch[i] != ' ' && ch[i - 1] == ' ') { 
  
                if (ch[i] >= 'a' && ch[i] <= 'z') { 
  
                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
                } 
            } 
  
            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
  
                ch[i] = (char)(ch[i] + 'a' - 'A');             
        } 
  
        String st = new String(ch); 
        return st; 
	}
	
	
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		String str;
		System.out.println("Enter the array:");
		str=s.nextLine();
		Q3  obj=new Q3 ();
		
		System.out.println(obj.LetterCapitalize(str));
		

	}


}
