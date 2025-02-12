package org.lessons.java.security;

//importo lo scanner
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        // creo una variabile per il nome
        String nome = "";

        // creo una variabile per il cognome
        String cognome = "";

        // creo una variabile per il colore preferito
        String colorePreferito = "";

        // creo una variabile per la data di nascita
        int dataNascita;

        Scanner in = new Scanner(System.in);

        // creo l'input per il nome dell'utente
        System.out.println("Qual è il tuo nome?");
        nome = in.nextLine();

        // creo l'input per il cognome dell'utente
        System.out.println("Qual è il tuo cognome?");
        cognome = in.nextLine();

        // creo l'input per il colore preferito dell'utente
        System.out.println("Qual è il tuo colore preferito?");
        colorePreferito = in.nextLine();

        // creo l'input per la data di nascita dell'utente
        System.out.println("Qual è la tua data di nascita?");
        dataNascita = in.nextInt();
        in.nextLine();

        // stampo a schermo la password
        System.out.println("La tua pa");

    }
}
