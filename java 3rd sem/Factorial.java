public class Factorial
{
public void facta()
{
int fact=1;
for(int i=1;i<10;i++)
{
 fact=fact*i;
}
System.out.println(fact);
}
public static void main(String args[])
{
Factorial f = new Factorial();
f.facta();
}
}
