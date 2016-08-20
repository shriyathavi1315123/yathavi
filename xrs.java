

import java.util.Scanner;
public class JavaApplication7 {

    public static void main(String[] args) {

        int len;
       String str,rev="";
       Scanner ks=new Scanner(System.in);
       System.out.print("enter the string to be reversed:");
       str=ks.nextLine();
       len=str.length();
       for(int i=len-1;i>=0;i--)
       {
           rev=rev+str.charAt(i);
       }
            System.out.println("the reversed string is "  +rev);  
    }
    
}