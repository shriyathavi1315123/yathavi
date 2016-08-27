import java.util.Scanner;
class VowelCheck
{
public static void main(String arg[])
{
char n;
Scanner in=new Scanner(System.in);
System.out.print("enter the character:");
n=in.next().charAt(0);
if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
 System.out.println(n+ "is a vowel");
else
System.out.println(n+ "is a consonant");
}
}