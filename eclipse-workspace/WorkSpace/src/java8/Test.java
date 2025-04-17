package java8;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//demo();
		forEach();
		}

	private static void forEach() {
		
		List<Integer> ls=Arrays.asList(12,23,4,5,6,2);
		System.out.println(ls);
		
		//Normal for and Enhancement for called as External Looping  
		//ForEach method called internal Looping 
		ls.forEach((elem)->System.out.println(elem));

	}

	static void demo() {
		Contract cc = (int a,double b) -> {
			return a+b;
		};
		int result=(int)cc.add2(22, 2.7);

		System.out.println(result);
	}
}
