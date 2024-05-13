package libManager;

import java.util.ArrayList;
import java.util.List;

public class Book {
	private final String isbn;
	private final String title;
	private final List<String> authors;
	private final int year;
	private final String city;
	private final String publisher;
	private final int edition;
	
	public Book(final String isbn, final String title, final List<String> authors, final int year,
			final String city, final String publisher, final int edition) {
		if(isbn == null || title == null || authors == null || year <= 0 || city == null 
				|| publisher == null || edition <= 0) {
			throw new IllegalArgumentException("parameters must not be null and edition and year must be positive and not null");
		}
		
		this.isbn = isbn;
		this.title = title;
		this.authors = authors;
		this.year = year;
		this.city = city;
		this.publisher = publisher;
		this.edition = edition;
	}

	public final String getIsbn() {
		return isbn;
	}

	public final String getTitle() {
		return title;
	}

	public final List<String> getAuthors() {
		return authors;
	}

	public final int getYear() {
		return year;
	}

	public final String getCity() {
		return city;
	}

	public final String getPublisher() {
		return publisher;
	}

	public final int getEdition() {
		return edition;
	}
	
	
}
