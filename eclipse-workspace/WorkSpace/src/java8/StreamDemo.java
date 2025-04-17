package java8;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamDemo {

	//A Stream cannot be stored permanently whichMeans stream will be used to One time Consuming 
	//That will be stored by reference 
	//But Don't store the Stream as temporary ,which is make large code set Instead
	//of it we can go pipeLine Approach by .
	public static void main(String[] args) {

		ArrayList<Employee> empList=new ArrayList<Employee>();
		
		Employee e1=new Employee("Robert", 101, 3, 70000);
		Employee e2=new Employee("Downey", 102, 2, 50000);
		Employee e3=new Employee("Wilson", 103, 5, 100000);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		
		empList
		.stream() //Stream the data  ,here That is Employees 
		.filter(em-> em.getSalary()>50000) //Intermediate operation
		.map(n-> n.getName()) //Intermediate operation
		.forEach(System.out::println); //Terminal operation
		
		//Have to do above thing instead of below way
		
//		Stream<Employee> empStream= empList.stream();
//		
//		Stream<Employee> expEmpStream=empStream
//				.filter(em-> em.getSalary()>50000);
//		
//		Stream<String> empNameStream= expEmpStream.map(emp->emp.getName());
//		empNameStream.forEach(System.out::println);
//				
		
	}

}
