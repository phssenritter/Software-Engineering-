package de.project20.libManager;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for the process of deleting a book.
 */

class DeleteBookTest {
	
	private Library lib = new Library();
	
	/**
	 * Testing the usual case where a book with the given ISBN is present. 
	 */
	@Test
	void testDeleteBook() {
		lib.deleteBook("2947501718342");
		assertFalse(lib.books.stream().anyMatch(b -> b.getIsbn() == "2947501718342"));
	}
	
	/**
	 * Testing the case where the user looks for an ISBN which is not present.
	 */
	@Test
	void testIsbnNotFound() {
		int size = lib.books.size();
		lib.deleteBook("1022293845362");
		assertTrue(size == lib.books.size());
	}
	
	/**
	 * Testing the case where the user inserts a null input.
	 */
	@Test
	void testNullInput() {
		assertThrows(IllegalArgumentException.class, () -> lib.deleteBook(null));
	}
	
	/**
	 * Testing the case where the String is empty
	 */
	@Test
	void testEmptyStringInput() {
		int size = lib.books.size();
		lib.deleteBook("");
		assertTrue(size == lib.books.size());
		assertDoesNotThrow(() -> IllegalArgumentException.class);
	}
	
}
