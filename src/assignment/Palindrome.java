package assignment;

public class Palindrome {

	public static void main(String[] args) {

		String str = new String("nayan");

		System.out.println("Length of str : " + str.length());
		System.out.println("str toUpperCase : " + str.toUpperCase());
		System.out.println("str toLowerCase : " + str.toLowerCase());

		StringBuffer sb = new StringBuffer(str);

		String s1 = sb.reverse().toString();

		System.out.println("Reversed Str : " + s1);

		if (str.equals(s1)) {
			System.out.println("It is Palindrome");
		} else {
			System.out.println("It is not Palindrome");
		}
	}

}
