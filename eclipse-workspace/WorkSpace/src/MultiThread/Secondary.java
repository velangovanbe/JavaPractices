package MultiThread;

public class Secondary 	extends Main{
	public static void main(String[] args) {
	Secondary obj=new Secondary();
	obj.test();
	System.out.println(obj.recursion(5));////5*4*3*2*1=120
	}
	private int recursion(int num) {//5
		if(num==0)//while num==0
			return 1;
		else
			System.out.println(num);//5
			return num*recursion(num-1);//5* -4 //4* -3 //3* -2 //2* -1 //1  
	}//5*4*3*2*1=120
	
	public void display() {
System.out.println("In sec");		
	}
}
