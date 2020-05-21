/*An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, you can say that interfaces can have abstract methods and variables. It cannot have a method body.
Java Interface also represents the IS-A relationship.

It cannot be instantiated just like the abstract class.

Since Java 8, we can have default and static methods in an interface.

Since Java 9, we can have private methods in an interface.
The Java compiler adds public and abstract keywords before the interface method. Moreover, it adds public, static and final keywords before data members.
In other words, Interface fields are public, static and final by default, and the methods are public and abstract.

*/

interface I1
{
   public abstract void show();

   default void display()
   {

   }


   static void run()
   {



    }
}
interface I2
{

void display();
}
class Test implements I1,I2
{
  public void show()
  {
     System.out.println("1");
  }
    public void display()
   {
   System.out.println("1");

   }
 public static void main(String[] args)
 {

   Test t=new test();
  t.show();
 }
