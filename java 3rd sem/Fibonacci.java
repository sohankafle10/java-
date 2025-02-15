class Fibonacci
{
public static void main(String args[])
{
int i, n=10, a=0, b=1, fibo;
for(i=1;i<=10;i++)
{
System.out.println(a);
fibo=a+b;
a=b;
b=fibo;
}
}
}