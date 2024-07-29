package pack1;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("sb : " + sb);
		sb.append("Hi");
		System.out.println("After appending Hi : " + sb);
		char ch = sb.charAt(5);
		System.out.println("char at 5th index : " + ch);
		sb.delete(0, 5);
		System.out.println("After delete (0,5) : " + sb);
		sb.insert(0, "Welcome");
		System.out.println("After insert (0,Welcome) : " + sb);
		sb.replace(7, 9, "Hello");
		System.out.println("After replace (7,9,Hello) : " + sb);
		String str = sb.substring(7);// sb will not be changed . new reference str will hold the change cause substring return type is string
		System.out.println("Result of substring(7) : " + str);
		str = sb.substring(0, 7);
		System.out.println("Result of substring(0,7) : " + str);
		sb.reverse();
		System.out.println("Reverse of sb : " + sb);
		sb.reverse();
		System.out.println("Reverse of sb : " + sb);
	}

}
