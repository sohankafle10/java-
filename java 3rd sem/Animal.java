class Animal
{
int speed=200;
void run()
{
System.out.println("all animals run");
}
}
class camel extends Animal
{
float height=7.2f;
public static void main(String args[])
{
camel c = new camel();
c.run();
System.out.println(c.speed);
System.out.println(c.run);
}
}
class Dog extends Animal
{
void bark()
{
System.out.println("Dog barks");
}
public static void main(String args[])
{
Dog d=new Dog();
d.bark();
d.run();
System.out.println(d.speed);
}
}
