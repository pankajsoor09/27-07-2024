package assignment;

public class BookTest {

	Book arr[];

	void createBooks(int n) {
		arr = new Book[n];
		arr[0] = new Book("Java Programming", 350.55f);
		arr[1] = new Book("Let Us C        ", 200.00f);
	}

	void showBooks() {
		System.out.println("Book Title   \t\t        Price");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getBookTitle() + "\t\tRs." + arr[i].getBookPrice());
		}
	}

	public static void main(String[] args) {
		BookTest test = new BookTest();
		test.createBooks(2);
		test.showBooks();
	}
}

/*
 * void create book (int num) Book arr[] book array of numsize arr = new book }
 * void showBook() {
 * 
 * booktest test = new book test() test.createBook(2); test.show books(); }
 * 
 * 
 * { Book[] edition = new Book[2];
 * 
 * edition[0] = new Book("Java Programming", 350.55f); edition[1] = new
 * Book("Let us c", 200.00f);
 * 
 * System.out.println("----Book Details----"); System.out.println(); for (int i
 * = 0; i < edition.length; i++) { System.out.println("Book name : " +
 * edition[i].getBookTitle()); System.out.println("Cost of Book : " + "Rs." +
 * edition[i].getBookPrice());
 * 
 * System.out.println("-----------------------");
 * 
 * }
 * 
 * }
 * 
 */