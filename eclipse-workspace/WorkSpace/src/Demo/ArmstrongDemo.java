package Demo;

//Java program to determine whether 
//the number is Armstrong number or not
public class ArmstrongDemo {
 
 // Function to calculate x raised 
 // to the power y 
 static int power(int x, long y)
 {
     if (y == 0)
         return 1;
     if (y % 2 == 0)
         return power(x, y / 2) * power(x, y / 2);
     return x * power(x, y / 2) * power(x, y / 2);
 }

 // Function to calculate order of the number 
 static int order(int x)
 {
     int n = 0;
     while (x != 0) {
         n++;
         x = x / 10;
     }
     return n;
 }

 // Function to check whether the given 
 // number is Armstrong number or not
 static boolean isArmstrong(int x)
 {
     // Calling order function
     int n = order(x);
     int temp = x, sum = 0;
     while (temp != 0) {
         int r = temp % 10;
         sum = sum + power(r, n);
         temp = temp / 10;
     }

     // If satisfies Armstrong condition
     return (sum == x);
 }

 // Driver Code
 public static void main(String[] args)
 {
	int result= hey(5);
	System.out.println(result);
	//fib2(5);
	//System.out.println(nums);
    // fib();
     int x = 153;
    // System.out.println("Armstrong "+isArmstrong(x));
     x = 1253;
     //System.out.println("Armstrong "+isArmstrong(x));
 }
 private static int fib2(int n) {

		/*
		 * if (n <= 1) return n;
		 * 
		 * return fib2(n - 1) + fib2(n - 2);
		 */
	 int a = 0, b = 1, c;
	 System.out.println(a);
	 System.out.println(b);
	    for (int i = 2; i <= n; i++) {	
	        c = a + b;
	        System.out.println(c);
	        a = b;
	        b = c;
	    }
	    return 0;
	    
}
static int hey(int n) {
	System.out.println(n);
	 if(n==1||n==0)
		 return 1;
	 return n*hey(n-1);
 }

private static void fib() {
	 int n = 10;
     int a = 0, b = 1;
     for (int i = 0; i < n; i++) {
         System.out.print(a + " "); //0 1 1  2  3  5  8  13  21  34  55
         int sum = a + b; //0+1=1 ,  1+1=2,  1+2=3 , 2+3=5, 3+5=8  
                		 //5+8=13, 8+13=21, 13+21=34, 21+34=55, 34+55=89       
          a = b; // 1  1  2 3  5   8   13   21  34  55
         b = sum;  //1  2  3  5  8 13  21   34  55  89

     }
      }
}
