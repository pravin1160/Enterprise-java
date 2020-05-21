/*pacakage GenericsDemo;
 works only non-primitive data type
public class Generics{

    public void printArray(String s[])
    {
     for(int i=0;i<s.length;i++)
     {
        System.out.println(s[i]);
     }
   }
 public void printArray(Integers n[])
    {
     for(int i=0;i<n.length;i++)
     {
        System.out.println(n[i]);
     }
   }



 public static void main(String []args)
  {
   Generics gl=new Gernerics();
   String[] countries={"India",Bhutan,"USA","UK"}
   gl.printArray(countries);
   Integer[] number={12,14,16,78}
   gl.printArray(number);
   }
}
*/

public class Generics{

    public <T> void printArray(T s[])
    {
     for(int i=0;i<s.length;i++)
     {
        System.out.println(s[i]);
     }
   }
 public void printArray(Integers n[])
    {
     for(int i=0;i<n.length;i++)
     {
        System.out.println(n[i]);
     }
   }



 public static void main(String []args)
  {
   Generics gl=new Gernerics();
   String[] countries={"India",Bhutan,"USA","UK"}
   gl.printArray(countries);
   Integer[] number={12,14,16,78}
   gl.printArray(number);
   }
}


