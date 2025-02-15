//Fall through Switch
import java.util.Scanner;
class FallThroughSwitch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
switch(month)
{
case 12:
case 1:
case 2:
System.out.println("winter Season");
break;

case 3:
case 4:
case 5:
System.out.println("Summer Season");
break;

case 6:
case 7:
case 8:
System.out.println("Spring Season");
break;

case 9:
case 10:
case 11:
System.out.println("Autumn Season");
break;
default:
System.out.println("The number enter is other than 1 to 12 ");
}
}
}

