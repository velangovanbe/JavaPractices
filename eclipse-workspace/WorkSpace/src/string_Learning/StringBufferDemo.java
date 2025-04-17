package string_Learning;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Hello Robert");
		
		sb.append(" james");
		System.out.println(sb);
		System.out.println(sb.delete(0, 7));
		System.out.println(sb.replace(0, 5, "Hi"));
		
	}

}
