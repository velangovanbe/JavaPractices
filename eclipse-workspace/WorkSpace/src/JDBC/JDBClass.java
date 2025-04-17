package JDBC;

	//import static java.lang.System.*;

	public class JDBClass {
	
		static void fun() {
			int arr[] ={23,78,27,44};
			for(int number:arr) {
				if(number%2==0) {
					System.out.println("Even numbers");
				}
			}
			for(int number:arr) {
				if(number%2!=0) {
					System.out.println("Odd numbers");
				}
			}
			/*
			 * for (int i=0;i<=arr.length();i++) { if(arr.length(i)2%==0) {
			 * 
			 * } }
			 */
			}
	    public static void main(String[] args) {
	    	fun();
	    	
	        String name="Mathi";
	        String reverse ="";
	        for(int i=name.length();i > 0;i--) {
	        	reverse += name.charAt(i - 1);
	        }
	        System.out.println(reverse);
	    }
	}
	/*
	 * String name="Mathi"; 
	 * String reverse=""; 
	 * for(int i=name.length();i>=5;i--) {
	 * reverse+=i-1;//i } System.out.println(reverse);
	 */
