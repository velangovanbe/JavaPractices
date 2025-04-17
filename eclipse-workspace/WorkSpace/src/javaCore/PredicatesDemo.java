package javaCore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

public class PredicatesDemo {

	//Predicate Joining or chaining
	
	// Predicate Return Data type boolean , it has test method as Functional
	// Interface
	// With Type of argument like Integer,String,Collection etc..

	public static void main(String[] args) {

		Predicate<Integer> c = age -> (age > 20);

		// System.out.println(c.test(25));

		Predicate<String> s = name -> (name.length() > 7);

		// System.out.println(s.test("Mathivanan"));

		ArrayList al = new ArrayList();
		Predicate<Collection> cc = vl -> vl.size() > 5;
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		al.add(12);
		//System.out.println(cc.test(al));
		int [] ar= {45,2,3,5,12,23,43};
		Predicate<Integer> p= i-> (i%2!=0);
		Predicate<Integer> p2= i-> i<10;
		/*
		 * for (int j = 0; j < ar.length; j++) { //System.out.println(p.test(ar[j])); }
		 */
		//For negative or opposite
	  // check(ar,p.negate());
		
		//For both condition
	   //check(ar,p.and(p2));
	   
	   //For one or both
	   check(ar,p.or(p2));
	}

	private static void check(int[] ar, Predicate<Integer> p) {
		for (int j = 0; j < ar.length; j++) {
			boolean result=p.test(ar[j]);
			if(result)
			   System.out.println(ar[j]);
		}	
	}

}
