package assignment;

public class Book {

	private String bookTitle;
	private float bookPrice;

	public Book(String bookTitle, float bookPrice) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public float getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(float bookPrice) {
		this.bookPrice = bookPrice;
	}

}
