package ParentPkg;


class Arr{
	int a[][][][]=
		{
		 {
		  { 
		   {2,34,34},
		   {23,23,4,3},
		   {32,123,45}
		   },
		
		   {
			{2,34,34},
			{23,23,4},
			{32,123,45}	
			} 
		   },
		{
		 {
   		  {2,34,34},
		  {23,23,4,3},
		  {32,123,45}
		},
	     {
		  {2,34,34},
		  {23,23,4},
		  {32,123,45}
		  }
		}
	};
	static String name="Downey";
 void view() {
	System.out.println(a[1][0][2][1]);
System.out.println(name);
}
}
 class Training {
public static String d="Robert";
private void syso() {
	// TODO Auto-generated method stub
System.out.println(d);
System.out.println(Arr.name);
}
	static public void main(String...args) {
		Arr obj=new Arr();
		obj.view();
Training t=new Training();
t.demo();
t.syso();
	}
void demo() {
	innerClass ic=new innerClass(0, 0);
	ic.fun();
	class innerClass{
		void fun() {
			System.out.println("fun method");
		}
	static String d="Robert";
		static void meth() {
			int a=23;
		}
	}
}
}
