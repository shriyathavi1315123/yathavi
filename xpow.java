import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
    int a,b,c;
    Scanner yat=new Scanner(System.in);
    System.out.print("enter the number: ");
    a=yat.nextInt();
    System.out.print("enter the power of a: ");
    b=yat.nextInt();
    c=(int)Math.pow(a,b);
    System.out.print(c);
    }
}