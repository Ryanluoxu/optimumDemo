package ComparableEx;

public class Book implements Comparable<Book> {
	
	@Override
	public int compareTo(Book b) {	// here we override compareTo method
		return this.getiSBN() - b.getiSBN();	// change
	}
	
	String bookName;
	int iSBN;

	public Book(String bookName, int iSBN) {
		this.bookName = bookName;
		this.iSBN = iSBN;
	}

	

	public int getiSBN() {
		return iSBN;
	}



	public void setiSBN(int iSBN) {
		this.iSBN = iSBN;
	}



	public String getBookName() {	
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return iSBN + " " + bookName;
	}
}
