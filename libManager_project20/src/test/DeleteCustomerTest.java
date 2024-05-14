package de.project20.libManager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for the process to delete a customer
 */
class DeleteCustomerTest {
	
	private Library lib = new Library();
	
	/**
	 * Testing the case where a customer with the given ID is present.
	 */
	@Test
	void testDeleteCustomer() {
		lib.deleteCustomer(000001);
		assertFalse(lib.customers.stream().anyMatch(b -> b.getId() == 000001));
	}
	
	/**
	 * Testing a case where a book copy with the given ID is not present.
	 */
	@Test
	void testIdNotFound() {
		int size = lib.customers.size();
		lib.deleteCustomer(89333333);
		assertTrue(size == lib.customers.size());
	}
	
	/**
	 * Testing a case where the user inserts a negative ID.
	 */
	@Test
	void testNegativeId() {
		assertThrows(IllegalArgumentException.class, () -> lib.deleteCustomer(-20293));
	}
	
	/**
	 * Testing a case where the user inserts 0 (in words: zero).
	 */
	@Test
	void testInputZero() {
		int size = lib.bookCopies.size();
		lib.deleteCustomer(0);
		assertTrue(size == lib.bookCopies.size());
		assertDoesNotThrow(() -> IllegalArgumentException.class);
	}
}
