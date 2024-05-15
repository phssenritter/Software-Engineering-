package de.project20.libManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * Test class for the process to delete a book copy.
 */

class DeleteBookCopyTest {
	
	private Library lib = new Library();
	
	/**
	 * Testing the case where a book copy with the given ID is present.
	 */
	@Test
	void testDeleteBookCopy() {
		lib.deleteBookCopy(000001);
		assertFalse(lib.bookCopies.stream().anyMatch(b -> b.getId() == 000001));
	}
	
	/**
	 * Testing a case where a book copy with the given ID is not present.
	 */
	@Test
	void testIdNotFound() {
		int size = lib.bookCopies.size();
		lib.deleteBookCopy(89333333);
		assertTrue(size == lib.bookCopies.size());
	}
	
	/**
	 * Testing a case where the user inserts a negative ID.
	 */
	@Test
	void testNegativeId() {
		assertThrows(IllegalArgumentException.class, () -> lib.deleteBookCopy(-20293));
	}
	
	/**
	 * Testing a case where the user inserts 0 (in words: zero).
	 */
	@Test
	void testInputZero() {
		int size = lib.bookCopies.size();
		lib.deleteBookCopy(0);
		assertTrue(size == lib.bookCopies.size());
		assertDoesNotThrow(() -> IllegalArgumentException.class);
	}
}
