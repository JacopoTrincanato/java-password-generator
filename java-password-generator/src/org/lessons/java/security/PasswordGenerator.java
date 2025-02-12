package org.lessons.java.security;

//importo lo scanner
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) throws Exception {

        // creo una variabile per il nome
        String nome;

        // creo una variabile per il cognome
        String cognome;

        // creo una variabile per il colore preferito
        String colorePreferito;

        // creo una variabile per il giorno di nascita
        int giornoDiNascita;

        // creo una variabile per il mese di nascita
        int meseDiNascita;

        // creo una variabile per l'anno di nascita
        int annoDiNascita;

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

        // creo l'input per il giorno di nascita dell'utente
        System.out.println("Qual è il giorno in cui sei nato?");
        giornoDiNascita = in.nextInt();
        in.nextLine();

        // creo l'input per il mese di nascita dell'utente
        System.out.println("Qual è il mese in cui sei nato?");
        meseDiNascita = in.nextInt();
        in.nextLine();

        // creo l'input per l'anno di nascita dell'utente
        System.out.println("Qual è l'anno in cui sei nato'?");
        annoDiNascita = in.nextInt();
        in.nextLine();

        // creo una variabile per la data di nascita dove sommo i valori di giorno, mese
        // e anno
        int sommaDataNascita = giornoDiNascita + meseDiNascita + annoDiNascita;

        // stampo a schermo la password
        System.out
                .println("La tua password è " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita);

        // chiudo lo scanner
        in.close();

    }
}
