import java.util.Scanner;
public class JavaApplication2 {

public static void main(String[] args) {
      String org;
	Scanner in=new Scanner(System.in);
	org=in.nextLine();
                int len=org.length();
		String name=org.toUpperCase();	
		String rev="";
		for(int i=len-1;i>=0;i--)
		{
			
			rev=rev + name.charAt(i);
			
		}

	System.out.println(rev);
	if(rev.equals(name))
	{
		System.out.println(" palindrome");

	}
	else
	{
		System.out.println("not palindrome");
	}
		}
	}
