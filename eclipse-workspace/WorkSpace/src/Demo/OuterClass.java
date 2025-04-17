package Demo;

public class OuterClass {
	//public int b=34;
interface demo{
	String name="Robert";
	int fun2();
	void fun3();
	public int b=34;
}
interface demo2 extends demo{
	int b=2;
}

/*
 * class Tem{ System.out.println("Hello"); }
 */	int a=23;
class InnerClass implements demo{
	 //int b=34;
	double inMeth(OuterClass obj) {
		//obj.b=23;
		double x=b*2.0;
			//System.out.println("Value of a= "+a*3);
			return x;
	}
	@Override
	public int fun2() 
	{
	System.out.println();
	return 0;
	}
	@Override
	public void fun3() {		
	}
}
void fun(OuterClass obj) {
	InnerClass ic=new InnerClass();
	double result=ic.inMeth(obj);
System.out.println("The multiplication value from inMeth= "+result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc=new OuterClass();
oc.fun(oc);
	}

}
