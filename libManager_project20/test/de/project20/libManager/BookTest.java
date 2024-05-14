package de.project20.libManager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BookTest {

    @Test
    public void testRemoveBook(){
        books.remove("2947501718342");
        assertNull(books.getBook("2947501718342"));
    }
}
