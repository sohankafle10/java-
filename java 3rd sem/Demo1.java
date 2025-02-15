import java.util.Scanner;
public class Demoo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int n=sc.nextInt();
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
System.out.println("Enter the element in index"+i+":");
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
System.out.println(" Element in index"+i+":");
System.out.println(a[i]);
}
}
}

