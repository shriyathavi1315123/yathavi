import java.util.Scanner;
public class JavaApplication1{
    public static void main(String[] args) {
        int n1=0,n2=1,n3=0,count;
        Scanner in= new Scanner(System.in);
        System.out.print("enter the count:");
        count=in.nextInt();
        System.out.print(n1+ " " +n2);
        for(int i=2;i<count;i++){
          n3=n1+n2;
        System.out.print(" "  + n3);
            n1=n2;
            n2=n3;
        }
      }
  }