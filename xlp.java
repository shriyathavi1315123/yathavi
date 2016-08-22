import java.util.Scanner;
public class JavaApplication3
{
 public static void main(String[] arg)
{
    int a;
    Scanner sh=new Scanner(System.in);
    System.out.print("enter the year:");
    a=sh.nextInt();
    if(a%4==0)
      System.out.println(a+ "is a leap year");
    else
      System.out.println(a+ "is not a leap year");
 }
}