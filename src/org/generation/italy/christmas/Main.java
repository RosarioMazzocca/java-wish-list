package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		ArrayList<String> wishlist = new ArrayList<String>();

		boolean continua = true;
		String si = "s";
		String no = "n";

		do {
			System.out.println("Aggiungi elemento alla lista dei desideri: ");
			wishlist.add(scanner.nextLine());
			System.out.println("La tua lista contiene " + wishlist.size() + " desideri/o");
			System.out.println("Continuare? (s/n) ");
			String siNo = scanner.nextLine();
			if (siNo.equals(no)) {
				continua = false;
			} else if (siNo.equals(si)) {
				continua = true;
			} else {
				System.out.println("Errore: valore non valido. Inserisci 's' oppure 'n' ");
			}
		} while (continua);
		System.out.println("Lista conclusa");

		System.out.println("Ecco la tua lista: ");

		Collections.sort(wishlist);
		for (int i = 0; i < wishlist.size(); i++) {
			System.out.println(wishlist.get(i));
		}
		
		System.out.println("Inserisci il tuo nome: ");
		String nome = scanner.nextLine();
		System.out.println("Inserisci il tuo indirizzo: ");
		String indirizzo = scanner.nextLine();
		
		
		LetteraBabboNatale lettera = new LetteraBabboNatale (nome, indirizzo, wishlist);
		
		try {
			System.out.println(lettera.invia());
		} catch (Exception a) {
			System.out.println("Errore: " + a.getMessage());
		}
		
		scanner.close();
	}

}
