import java.util.Scanner;
public class SumNatural {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sn=new Scanner(System.in);
        System.out.print("enter the total numbers to be added:");
        n=sn.nextInt();
        int i=1;
        while(i<=n)
        {
            sum=sum+i;
            i++;
    }
    System.out.print("sum of " + n + " natural numbers is " + sum);
    
}}