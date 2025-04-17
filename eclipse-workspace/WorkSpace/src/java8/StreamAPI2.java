package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAPI2 {

	// filter()------by Predicate means return only boolean which is used for condition

	// map() --------by Function means return implementation like concatenation ,Up or
	// Low case or which is used for processing etc

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		l.add("Robert");
		l.add("Wilson Fisk");
		l.add("Melody");
		l.add("Kevin");

	//	l.stream().map(ls -> ls + " B.E.,").forEach(System.out::println);

		// IntStream s =Arrays.stream(ls);
		// s=s.sorted();
		// s.forEach(ss-> System.out.println(ss));
		// s.forEach(System.out::println);

		/*
		 * Arrays .stream(ls) .sorted() .forEach(System.out::println);
		 */

		// OptionalDouble[5.166666666666667]
		/*
		 * System.out.println(Arrays .stream(ls) .average());
		 */

		// Optional Class
		// 7.0
		/*
		 * Arrays .stream(ls) .unordered();
		 */
		// .distinct()
		// .forEach(System.out::println);
		// .average();
		// .max();
		// .min();
		// .findFirst();
		// .findAny();
		// .count();
		// .reduce(0, (a,b)->a+b);
		// .filter(n -> n%2!=0)
		// .forEach(System.out::println);
		//skip()
		//limit()
		/*
		 * int a=13,b=2; long c; var v=12;
		 */

		// map()
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(3);

		list.stream()
		.map(no -> no / 2)
		.limit(2)
		.skip(1);
		// .forEach(System.out::println);

       //	System.out.println(c=a/b+v);

	
//Converting ArrayList to Array
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(15);
		list1.add(3);
		
		Object[] obj=list1
		.stream()
		.toArray();
		
          for(Object num:obj) {
        	//  System.out.println(num);
          }
       
 //Total the Array values (Stream)
          
          int []nums= {12,23,34,11};
          int total=0;
          total=total+nums[0];
          total=total+nums[1];
          total=total+nums[2];
          total=total+nums[3];
          
        //  System.out.println(total); 
          
          //It can be reWritten as below by reduce() 
          
          ArrayList<Integer> numbers = new ArrayList<>();
  	        numbers.add(12);
  		    numbers.add(15);
  		    numbers.add(15);
  		   // numbers.add(15);
  		    
  		//For even numbers
  		 Optional<Integer> data=numbers
  				.stream()
  				.reduce((a,b)->a+b);
  		System.out.println(data.get());	
  		    
  		 //For odd numbers
  		
  		
  		   int result= numbers
  		    .stream() 
  		    .reduce(0,(a,b)->a+b);
  		  System.out.println(result);	   
  		   
//Get max number from an ArrayList using Stream
  		   
  		 ArrayList<Integer> lst = new ArrayList<>();
	        lst.add(122);
		    lst.add(151);
		    lst.add(331);
		    lst.add(125);
          
//		   Optional<Integer> result2= lst
//		    .stream()
//		    .max((elem1,elem2) ->elem1.compareTo(elem2));
//		    System.out.println(result2.get());
		  

		    //Parallel Stream 

//		    lst
//		   .parallelStream()
//		   .forEachOrdered(System.out::println);
//		   	   
		 
//sequence to parallel conversion
		    lst
			   .stream()
			   .parallel();
			  // .forEach(System.out::println);
			  	    
//How to Stream the HashMap 
		    HashMap<String, Integer> hm=new HashMap<String, Integer>();
		    
		    hm.put("Robert",100);
		    hm.put("Downey",200);
		    hm.put("Nelson",300);
		    
//Sorting based on Key :Alphabetical order
		    
		    hm
		    //.keySet()
		    .entrySet()  //In these case entrySet() which is pair --- means, key and value? 
		    .stream();
		  //.sorted(Map.Entry.comparingByValue())
		    
		    //.sorted(Map.Entry.comparingByKey());
		   
		    // .forEach(System.out::println);

		    

//Convert Map into List or Set
		    
		    //List by .collect(Collectors.toList());
		    
		    List<String> ll= hm
		    .keySet()
		    .stream()
		    .collect(Collectors.toList());
		  //  System.out.println(ll);
		    
		  
		    //Set
		    
		    Set<String> l2= hm
				    .keySet()
				    .stream()
				    .collect(Collectors.toSet());
				  //  System.out.println(l2);
		    
				    List<Integer> data2=Arrays.asList(1,2,3,4);
				    //data
				   // .forEach(System.out::println);
	}

}
