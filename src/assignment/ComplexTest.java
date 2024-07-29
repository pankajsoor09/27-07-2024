package assignment;

public class ComplexTest {

	public static void main(String[] args) {

		Complex number1 = new Complex(10, 15);
		System.out.println("1st complex number : ");
		number1.display();
		Complex number2 = new Complex(5, 8);
		System.out.println("2nd complex number : ");
		number2.display();

		Complex addResult = number1.addition(number2);
		System.out.println("Addition Result : ");
		addResult.display();

		Complex subResult = number1.substraction(number2);
		System.out.println("Substraction Result : ");
		subResult.display();

	}

}
