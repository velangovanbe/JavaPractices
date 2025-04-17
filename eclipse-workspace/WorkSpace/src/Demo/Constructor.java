package Demo;

class A
{
    public A()
    {
    super();
    System.out.println( "in A");
    }
    public A(int n)
    {
    this();
    System.out.println( "in A int");
    }
}
    class B extends A
    {
    public B(){
    super(4);
    System.out.println( "in B");
    }
    public B(int n)
    {
    this();
    System.out.println( "in B int");
    }
}
    // class Demo{
//     public static void main(String arg[])
//     {
//    // A obj=(A)new B(); 
//    //((B) obj).show2();
//    A obj1=new B();
//    obj1.show1();
//     }
// }
 public class Constructor
{
public static void main(String a[])
{
B obj = new B(5);
}
}