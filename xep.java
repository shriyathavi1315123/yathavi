import java.util.Scanner;
public class JavaApplication
{
    public static void main(String[] args) 
{
        int a;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
        a=in.nextInt();
        if(a%2==0)
            System.out.println(a+  "is even no");
        else
            System.out.println(a+  "is odd no");
    }
    
}
