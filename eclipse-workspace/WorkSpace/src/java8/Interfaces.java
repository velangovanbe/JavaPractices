package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Double colon or Method reference  -----  ::

public class Interfaces {
	
	public Interfaces(int model) {
		System.out.println(model);
	}
	 

  public static void show(int price) {
		System.out.println(price);
	}
	public static void main(String[] args) {
		Consumer<Integer> cc =no->System.out.println(no);
		//cc.accept(23);
	  ArrayList<Integer> al=new ArrayList<Integer>();
	  al.add(12);
	  al.add(11);
	  al.add(10);
	  //Method Reference or ::
	  //al.forEach(System.out::println);
	
	  //Interfaces obj=new Interfaces();
		/*
		 *Using object reference for non static method-------obj
		 * 
		 * Contract c= obj::show;
		 *  c.display(10000);
		 */
		
		//Using class name for static method calling -------Interfaces
		Contract c= Interfaces::show;
		 //c.display(123);
		
		//For Constructor calling
		c=Interfaces::new;
		 c.display(34);
	}
}
