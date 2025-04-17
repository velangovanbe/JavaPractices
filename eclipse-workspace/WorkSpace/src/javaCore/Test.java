package javaCore;

import Lamda_learing.Contract;

public class Test {

	public static void main(String[] args) {
		
		Contract cc = (int a,double b) -> {
			return a+b;
		};
		int result=(int)cc.add2(22, 2.7);

		System.out.println(result);
	}

}
