import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner lg=new Scanner(System.in);
        a=lg.nextInt();
        b=lg.nextInt();
        c=lg.nextInt();
        if(a>b&&a>c)
            System.out.println(a+ "is greater");
        else if(b>c)
             System.out.println(b+ "is greater");
        else
            System.out.println(c+ "is greater");
    }
    
}
