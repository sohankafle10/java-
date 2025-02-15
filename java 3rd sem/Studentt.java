 class Studentt
{
int id;
String name;
Studentt (int id,String name)
{
this.id=id;
this.name=name;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String args[])
{
Studentt s1=new Studentt(1,"Ram");
Studentt s2=new Studentt(2,"Sita");
s1.display();
s2.display();
}
}
