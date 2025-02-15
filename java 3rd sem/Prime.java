class Prime
{
public static void main(String args[])
{
int a=10, count=0, i=1;
for(i=1; i<=10; i++)
{
if(a%i==0)
count ++;

}
if(count==2)
{
System.out.println("the number is prime");
}
else
{
System.out.println("the number is composite");
}
}
}