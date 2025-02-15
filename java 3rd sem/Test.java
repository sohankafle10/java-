class Test
{
public void m1()
{
System.out.println("m1 method");
}
public void m2()
{
m1();
System.out.println("m2 method");
}
public static void main(String args[])
{
Test t=new Test();
t.m2();
}
}