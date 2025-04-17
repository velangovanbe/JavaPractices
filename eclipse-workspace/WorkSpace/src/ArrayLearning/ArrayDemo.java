package ArrayLearning;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayDemo  obj=new ArrayDemo();
	//	obj.subArray();
		obj.addingTwoArrays();
				
		
		
		//Checking Number in Array 
		int[] ls= {12,43,54,32,13};
		Scanner sc= new Scanner(System.in);
//		System.out.println("Enter the no: ");
//		int i=sc.nextInt();
//		for(int j=0;j<ls.length;j++) {
//			if(i==ls[j]) {
//					//System.out.println("No is there");	
//				break;
//			}
//		}
//			
	}
	
	//Adding two array (of different length) to store it another array by length

	private void addingTwoArrays() {
		int []a= {12,23,34,45};
		int[] b= {45,56,3,2,43,23};
		
		int big=a.length>b.length?a.length:b.length;
		int []c=new int[big];
		
		int small=a.length<b.length?a.length:b.length;
		for(int i=0;i<small;i++) {
			c[i]=a[i]+b[i];
		}
		for(int i=small;i<big;i++) {
			
			c[i]=b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		
	}

	private void subArray() {
		int []a= {12,23,34,45,56,67};
		int[] b= {45,56};
		
		int i=0;
		while(i<b.length) {
			int no=b[i];
			int j=0;
			boolean present=false;
			while(j<a.length) {
				if(no==a[j]) {
					present=true; 
					System.out.println("present");
				}
				j++;
			}
			if(present==false) {
				System.out.println("Not there");
			}
			i++;
		}
	}

}
