import java.util.Scanner;
public class JavaApplication5 {
    public static void main(String[] args)
{
     
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        n=in.nextInt();
        if(n==0)
            System.out.println(n+  "is zero ");
        else if(n<0)
             System.out.println(n+ "is negative");
        else
            System.out.println(n+ "is positive");
    }
    
}
