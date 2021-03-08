package it.polito.tdp.model;

import java.time.LocalDate;
import java.util.List;

public class TestLibretto
{
	public static void main(String[] args)
	{
		System.out.println("Test metodi Libretto\n");
		Libretto libretto = new Libretto();
		
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
		
		System.out.println(libretto);
		System.out.println();
		List<Voto> listaVenticinque = libretto.getListaVotiUgualiA(25);
		System.out.println(listaVenticinque);
		System.out.println();

		Libretto librettoVenticinque = libretto.getLibrettoConVotiUgualiA(25);
		System.out.println(librettoVenticinque);
		
	}

}
