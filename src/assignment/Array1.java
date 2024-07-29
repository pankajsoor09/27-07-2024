package assignment;

public class Array1 {
	public static void main(String[] args) {
		int[] A = { 3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 6 };
		System.out.println("Length of A : " + A.length);

		int sum = 0;

		for (int i = 0; i < 15; i++) {
			sum += A[i];
		}

		A[15] = sum;
		System.out.println("sum stored in A[15] : " + A[15]);
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("\n-----------------------------------");

		int average = sum / 15;
		A[16] = average;

		System.out.println("Average Stored in A[16] : " + A[16]);

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println("\n----------------------------------");

		int smallest = A[0];

		for (int i = 1; i < A.length; i++) {
			if (A[i] < smallest) {
				smallest = A[i];
			}
		}

		A[17] = smallest;
		System.out.println("Smallest value stored in A[17] : " + A[17]);

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + " ");
		}
	}
}
