
package revnumb;

import java.util.Scanner;


public class NoRev{
    
    public static void main(String[] args) {
       
        {
int[]c;
int n;
Scanner input=new Scanner(System.in);
System.out.print("enter the array:");
n=input.nextInt();
c=new int[n];
System.out.println("enter"+n+"value:");
for(int i=0;i< c.length;i++)
c[i]=input.nextInt();
for(int i=0,j=n-1;i<n/2;i++,j--)
c[i]=c[i]+c[j]-(c[j]=c[i]);
System.out.println("Reverse order");
for(int i=0;i<c.length;i++)
System.out.println(c[i]);
}
} 
}
    

