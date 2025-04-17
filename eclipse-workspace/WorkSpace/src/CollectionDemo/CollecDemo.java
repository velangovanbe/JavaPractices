package CollectionDemo;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollecDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object ls=new LinkedList();
		Object l=new ArrayList<Object>();
		((LinkedList) l).add(23);
		((LinkedList) l).add(23.32);
		((LinkedList) l).add("asdew");
		((LinkedList) l).add('a');
		//System.out.println(ls);
		
	//	l.add(ls);
System.out.println(l);
	}

}
