package pack1;

public class StringBuilderDemo {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hello");
		sb.append("Hi");
		System.out.println("After append Hi : " + sb);
		sb.delete(0, 5);
		System.out.println("After delete Hello : " + sb);
		sb.insert(0, "Welcome");
		System.out.println("After insert welcome at 0 : " + sb);
		sb.replace(0, 7, "Hello");
		System.out.println("After replace Hello : " + sb);
		String str = sb.substring(0, 5);
		System.out.println("substring (0,5) : " + str);
		str = sb.substring(5, 7);
		System.out.println("substring (5,7) : " + str);
		char ch =sb.charAt(sb.length()-1);
		System.out.println("Last index : "+ch);

	}

}
