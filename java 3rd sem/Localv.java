public class Localv
{
int a=10;
public void loc()
{

int b=a+1;
System.out.println(b);
}
public static void main(String args[])
{
Local L=new Local(System.in);
L.loc();
}
}
