import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sn=new Scanner(System.in);
        System.out.print("enter the total numbers to be added:");
        n=sn.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
    }
    System.out.print("sum of " + n + " natural numbers is " + sum);
    
}}