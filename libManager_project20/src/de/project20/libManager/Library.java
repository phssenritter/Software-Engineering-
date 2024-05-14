package de.project20.libManager;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Library {
	Scanner scanner = new Scanner(System.in);
	List<Customer> customers = new ArrayList<>();
	List<BookCopy> bookCopies = new ArrayList<>();
	List<Book> books = new ArrayList<>();
	List<String> authors = new LinkedList<>();
	
	public Library() {
		createExamples();
		System.out.println("\n--- Willkommen beim LibManager ---");
        System.out.println("1 - Löschen eines Buches");
        System.out.println("2 - Löschen einer Buchkopie");
        System.out.println("3 - Löschen eines Kunden");
        System.out.println("4 - Beenden");
        System.out.print("Wählen Sie eine Option durch Eingabe der Zahl und Enter:\n ");
        int option = scanner.nextInt();
        if(option == 1) {
        	deleteBook();
        	Library library = new Library();
        } else if(option == 2) {
        	deleteBookCopy();
        	Library library = new Library();
        } else if(option == 3) {
        	deleteCustomer();
        	Library library = new Library();
        } else if(option == 4) {
        	closeLibManager();
        	Library library = new Library();
        } else {
        	System.out.println("Falsche Eingabe.");
        	Library library = new Library();
        }
	}
	
	private void createExamples() {
		authors.add("Haasenritter");
		authors.add("Feldmann");
		customers.add(new Customer(000001, "Greiner", "Benjamin", "A-Straße 1", "70176", "Stuttgart"));
		customers.add(new Customer(000002, "Scheffold", "Keno", "A-Straße 2", "70177", "Stuttgart"));
		customers.add(new Customer(000003, "Rockenstein", "Simon", "A-Straße 3", "70178", "Stuttgart"));
		books.add(new Book("2947501718342", "How to get rich", authors, 1985, "Berlin", "Klett Verlag", 1));
		books.add(new Book("2947501712011", "How to get poor", authors, 1995, "Duisburg", "Reclam", 1));
		books.add(new Book("2985601718342", "How to get healthy", authors, 1980, "Berlin", "Klett Verlag", 2));
		bookCopies.add(new BookCopy(000001, books.get(0), "B44"));
		bookCopies.add(new BookCopy(000002, books.get(1), "B45"));
		bookCopies.add(new BookCopy(000003, books.get(2), "B46"));
		
	}

	public void deleteBook() {
		System.out.println("Geben Sie die ISBN des zu löschenden Buches ein:\n");
    	String isbn = scanner.next();
    	int bookAmount = bookCopies.size();
    	books.removeIf(c -> c.getIsbn() == isbn);
    	if(bookCopies.size() == bookAmount) {
    		System.out.println("Keine Buchkopie mit dieser ID gefunden.");
    	}
	}
	
	public void deleteBookCopy() {
    	System.out.println("Geben Sie die ID der zu löschenden Buchkopie ein:\n");
    	long bookId = scanner.nextLong();
    	int bookCopyAmount = bookCopies.size();
    	bookCopies.removeIf(c -> c.getId() == bookId);
    	if(bookCopies.size() == bookCopyAmount) {
    		System.out.println("Keine Buchkopie mit dieser ID gefunden.");
    	}
	}
	
	public void deleteCustomer() {
    	System.out.println("Geben Sie die ID des zu löschenden Kunden ein:\n");
    	long customerId = scanner.nextLong();
    	int customerAmount = customers.size();
    	customers.removeIf(c -> c.getId() == customerId);
    	if(customers.size() == customerAmount) {
    		System.out.println("Kein Kunde mit dieser ID gefunden.");
    	}
	}
	
	public void closeLibManager() {
		System.out.println("Vielen Dank für die Nutzung des LibManagers.");
	}
	
	
}
