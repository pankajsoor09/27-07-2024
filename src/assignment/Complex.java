package assignment;

public class Complex {

	private int real;
	private int imaginary;

	public Complex(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	void display() {
		System.out.println(real + "+" + imaginary + "i");

	}

	Complex addition(Complex number) {
		int r = this.real + number.real;
		int i = this.imaginary + number.imaginary;
		return new Complex(r, i);
	}

	Complex substraction(Complex number) {
		int r = this.real - number.real;
		int i = this.imaginary - number.imaginary;
		return new Complex(r, i);
	}

}
