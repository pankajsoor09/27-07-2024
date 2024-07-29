package assignment;

public class Bingo {
	public static void main(String[] args) {
		System.out.println("Command Line Arguments : ");

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		int arr[] = { 7, 25, 5, 19, 30 };

		System.out.print("Given Array : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		if ((num1 >= 1 && num1 <= 40) && (num2 >= 1 && num2 <= 40)) {
			System.out.println("\n Num1 : " + num1);
			System.out.println(" Num2 : " + num2);
		} else {
			System.out.println("Enter numbers between 1 and 40 only");
		}
		boolean status = false;
		boolean status1 = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num1) {
				status = true;
			}
			if (arr[i] == num2) {
				status1 = true;
			}

		}
		if (status && status1) {
			System.out.println("Its a Bingo !");
		} else {
			System.out.println("Not found !");
		}

	}
}
