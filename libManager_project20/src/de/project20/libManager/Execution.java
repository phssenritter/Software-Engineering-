package de.project20.libManager;

import java.util.Scanner;

public class Execution {
	Scanner scanner = new Scanner(System.in);
	Library library = new Library();
	
	public Execution() {
		execute();
	}
	
	public void execute() {
		System.out.println("\n--- Willkommen beim LibManager ---");
        System.out.println("1 - Löschen eines Buches");
        System.out.println("2 - Löschen einer Buchkopie");
        System.out.println("3 - Löschen eines Kunden");
        System.out.println("4 - Beenden");
        System.out.print("Wählen Sie eine Option durch Eingabe der Zahl und Enter:\n ");
		int option = scanner.nextInt();
	    if(option == 1) {
			System.out.println("Geben Sie die ISBN des zu löschenden Buches ein:\n");
	    	String isbn = scanner.next();
	    	library.deleteBook(isbn);
	    	
	    } else if(option == 2) {
	    	System.out.println("Geben Sie die ID der zu löschenden Buchkopie ein:\n");
	    	long bookId = scanner.nextLong();
	    	library.deleteBookCopy(bookId);
	    	execute();
	    } else if(option == 3) {
	    	System.out.println("Geben Sie die ID des zu löschenden Kunden ein:\n");
	    	long customerId = scanner.nextLong();
	    	library.deleteCustomer(customerId);
	    	execute();
	    } else if(option == 4) {
	    	library.closeLibManager();
	    } else {
	    	System.out.println("Falsche Eingabe.");
	    	execute();
	    }
	}
}
