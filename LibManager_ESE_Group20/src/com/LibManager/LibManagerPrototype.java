package com.LibManager;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.kerberos.DelegationPermission;

public class LibManagerPrototype {
	
	public static void main(String[] args) {
		/**
		 * Generated list to demonstrate the process of removing a customer
		 */
		List<Integer> customerIdList = new LinkedList<>();
		for(int i = 1; i < 10; i++) {
			customerIdList.add(i);
		}
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\n Herzlich Willkommen im Hauptmenü des LibManager!");
		System.out.println("Bitte geben Sie das Passwort ein: (Passwort für den Prototyp: 1234)");
		int password = scanner.nextInt();
		/**
		 * Just the prototype, no exact verification needed
		 */
		if(password != 1234) {
			throw new IllegalArgumentException("Wrong Password.");
		}
		
		while(true) {
			System.out.println("Geben Sie die Zahl Ihrer gewünschten Aktion ein:");
			System.out.println("1 Löschen eines Kunden");
			System.out.println("2 Löschen eines Buches");
			System.out.println("3 Löschen einer Buchkopie");
			System.out.println("4 Anwendung beenden");
			
			int action = scanner.nextInt();
			if(action == 1) {
				System.out.println("Bitte geben Sie die ID des zu löschenden Kunden ein: (IDs im Prototyp: zwischen 1 und 9)");
				int id = scanner.nextInt();
				if(!customerIdList.contains(id)) {
					System.out.println("Kunde mit der ID " + id + " nicht gefunden.\n");
				}
				for(int i = 0; i < customerIdList.size(); i++) {
					if(customerIdList.get(i) == id) {
						System.out.println("Wollen Sie den Kunden mit der ID " + id + " wirklich löschen?");
						System.out.println("1 Ja \n2 Nein");
						int deleteConfirmation = scanner.nextInt();
						if(deleteConfirmation == 1) {
							customerIdList.remove(i);
							// TODO: delete the other data from the removed customer
							System.out.println("Kunde wurde gelöscht.\n");
							break;
						} else if(deleteConfirmation == 2) {
							break;
						} else if(deleteConfirmation != 2){
							System.out.println("Falsche Eingabe.\n");
							break;
						} 
					}
				} 

				
			} else if(action == 2) {
				System.out.println("Im Prototyp noch nicht verfügbar.\n");
			} else if(action == 3) {
				System.out.println("Im Prototyp noch nicht verfügbar.\n");
			} else if(action == 4){
				break;
			} else {
				throw new IllegalArgumentException("Für diese Eingabe gibt es keine Aktion.\n");
			}
			
		}
		
	}
}
