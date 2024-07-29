package assignment;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Command Line Arguments : ");

		int num1 = Integer.parseInt(args[0]);
		System.out.println("Num1 : " + num1);

		int num2 = Integer.parseInt(args[1]);
		System.out.println("Num2 : " + num2);

		int result = 0;

		System.out.print(num1 + "," + num2 + ",");

		for (int i = 0; i < 13; i++) {

			result = num1 + num2;
			num1 = num2;
			num2 = result;

			System.out.print("," + result);
		}

	}

}
