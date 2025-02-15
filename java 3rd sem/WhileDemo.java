import java.util.Scanner;
class WhileDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
while (num<=10)
{
System.out.println("The result is:"+num);
num++;
}
}
}

