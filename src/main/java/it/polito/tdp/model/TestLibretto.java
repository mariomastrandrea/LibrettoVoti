package it.polito.tdp.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto
{	
	public static void main(String[] args)
	{
		System.out.println("Test metodi Libretto\n");
		Libretto libretto = new Libretto();
		
		//1
		Voto voto1 = new Voto("Analisi I", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		
		libretto.add(new Voto("Fisica I", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 7, 18)));
		libretto.add(new Voto("Algebra Lineare e Geometria", 25, LocalDate.of(2019, 9, 3)));
		libretto.add(new Voto("Fisica II", 25, LocalDate.of(2019, 7, 10)));
		libretto.add(new Voto("Tecniche di Programmazione", 27, LocalDate.of(2021, 6, 30)));
		libretto.add(new Voto("Sistemi telematici", 22, LocalDate.of(2021, 1, 26)));
		libretto.add(new Voto("Economia e Organizzazione Aziendale", 25, LocalDate.of(2020, 7, 17)));
		libretto.add(new Voto("Ricerca Operativa", 30, LocalDate.of(2020, 4, 12)));
		libretto.add(new Voto("Chimica", 25, LocalDate.of(2019, 2, 3)));
		libretto.add(new Voto("Programmazione ad oggetti", 28, LocalDate.of(2021, 1, 25)));
		
		System.out.println("Libretto:");
		System.out.println(libretto);
		
		//2
		System.out.println("\nLista esami con voto 25:");
		List<Voto> listaVenticinque = libretto.getListaVotiUgualiA(25);
		System.out.println(listaVenticinque);

		System.out.println("\nLibretto esami con voto 25:");
		Libretto librettoVenticinque = libretto.getLibrettoConVotiUgualiA(25);
		System.out.println(librettoVenticinque);
		
		//3
		System.out.println("\nCerca esame \"Tecniche di Programmazione\":");
		Voto esameTecnicheDiProgrammazione = libretto.cercaVotoCorso("Tecniche di Programmazione");
		System.out.println(esameTecnicheDiProgrammazione);
		System.out.println();

		//4
		Voto analisiDoppione = new Voto("Analisi I", 30, LocalDate.of(2020, 1, 2));
		System.out.println("Esiste un voto doppione: <<" + analisiDoppione + ">> nel libretto?\nRisposta: " + (libretto.esisteDuplicato(analisiDoppione)? "sì" : "no"));
		if(libretto.esisteDuplicato(analisiDoppione))
			System.out.println("Voto gia' presente: " + libretto.cercaVotoCorso(analisiDoppione.getNomeCorso()));
		System.out.println();

		//5
		Voto chimicaConflitto = new Voto("Chimica", 29, LocalDate.of(2020, 5, 6));
		System.out.println("Esiste il voto in conflitto: <<" + chimicaConflitto + ">> nel libretto?\nRisposta: " + (libretto.esisteConflitto(chimicaConflitto)? "sì" : "no"));
		if(libretto.esisteDuplicato(analisiDoppione))
			System.out.println("Voto gia' presente: " + libretto.cercaVotoCorso(chimicaConflitto.getNomeCorso()));
		System.out.println();
	}

}
