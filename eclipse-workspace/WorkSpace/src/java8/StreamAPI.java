package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;

public class StreamAPI {

	// Filter------by Predicate means return only boolean

	// Map --------by Function means return implementation like concatenation ,Up or
	// Low case etc

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<String>();

		l.add("Robert");
		l.add("Wilson Fisk");
		l.add("Melody");
		l.add("Kavin");

		l.stream().map(ls -> ls + " B.E.,").forEach(System.out::println);

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

		/*
		 * int a=13,b=2; long c; var v=12;
		 */

		// map()
		ArrayList<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(15);
		num.add(3);

		num.stream().map(no -> no / 2);
		// .forEach(System.out::println);

//	System.out.println(c=a/b+v);

	

	}

}
