import java.util.Scanner;

public class JavaApplication4 {
    public static void main(String[] args) {
        int n;
        int count=0;
        Scanner in=new Scanner(System.in);
        System.out.print("enter a integer");
        n=in.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
         System.out.print(count);
        }