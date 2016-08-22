import java.util.Scanner;
public class JavaApplication1 {
    public static void main(String[] args) {
        char ch;
        Scanner scan=new Scanner(System.in);
        ch=scan.next().charAt(0);
        if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
            System.out.println(ch+ "is an alphabet");
        else
            System.out.println(ch+ "is not an alphabet");
    }
    
}