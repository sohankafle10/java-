import java.util.Scanner;
public class BloodDonation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your age and weight");
int age=sc.nextInt();
int weight=sc.nextInt();
if(age>=18)
{
if(weight>60)
{
System.out.println("you are eligible to donate blood");
}
else
{
System.out.println("you are not eligible to donate blood");
}
}
else
{
System.out.println("sorry age is below 18");
}
}
}

