package Demo;

public class ObjectDemo {

	
	static String mess="info";
	static String name="robert";
	{
	mess="Info";	
	}
static {
	main();
	new ObjectDemo().demo();
}
public static void main(String[] args) {

//	ObjectDemo obj=new ObjectDemo();
//	obj.demo();
//			
//	ObjectDemo.main();

}
	public static void main() {
		//System.out.println("Hello "+name+" "+mess);
		System.out.println(name);
		System.out.println(mess);
	}

	private void demo() {
		System.out.println("Hi "+name+" "+mess);
		name="Downey";
		System.out.println(name);
		
	}

}
