package java8;

import java.util.ArrayList;

public class Stream2 {

	public static void main(String[] args) {
		
		ArrayList<String> l = new ArrayList<String>();

		l.add("Robert");
		l.add("Wilson Fisk");
		l.add("Melody");
		l.add("Kavin");

		l
		.stream()
		.map(ls -> ls + " B.E.,")
		.forEach(System.out::println);
		
		
		int []a= {12,23,34,45,56,67};
		int[] b= {45,56};
		
		int i=0;
		while(i<b.length) {
			int no=b[i];
			int j=0;
			while(j<a.length) {
				if(no==a[j]) {
					System.out.println("present");
					break;
				}
			j++;
			}
		i++;
		}
		
	}

}
