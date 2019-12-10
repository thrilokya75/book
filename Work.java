class Animal
{
void eat()
{
System.out.println("i m in eating");
}
void sleep()
{
System.out.println("sleeping");
}
}
class Bird extends Animal
{
void fly()
{
System.out.println("bird is flying");
}
void eat()
{
System.out.println("i m in eating");
}
void sleep()
{
System.out.println("sleeping");
}
}
class Work
{
public static void main(String args[])
{
Bird b=new Bird();
b.eat();
b.sleep();
b.fly();
}
}