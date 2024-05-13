package libManager;

import java.util.Date;

public class BookCopy {
	private long id;
	private Book book;
	private String shelfLocation;
	
	public BookCopy(final long id, final Book book, final String shelfLocation) {
		if(id <= 0 || book == null || shelfLocation == null) {
			throw new IllegalArgumentException("parameters must not be null and id must not be negative or zero");
		}
		this.id = id;
		this.book = book;
		this.shelfLocation = shelfLocation;
	}
	
	private Date addedToLibrary() {
		//TODO;
		return null;
	}
	
	private boolean lent() {
		//TODO;
		return true;
	}
	
	private Date lentDate() {
		//TODO;
		return null;
	}

	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final Book getBook() {
		return book;
	}

	public final void setBook(Book book) {
		this.book = book;
	}

	public final String getShelfLocation() {
		return shelfLocation;
	}

	public final void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}
	
	
}
