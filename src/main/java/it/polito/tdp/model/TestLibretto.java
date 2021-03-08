package it.polito.tdp.model;

import java.time.LocalDate;

public class TestLibretto
{
	public static void main(String[] args)
	{
		System.out.println("Test metodi Libretto\n");
		Libretto libretto = new Libretto();
		
		Voto voto1 = new Voto("Analisi I", 30, LocalDate.of(2019, 2, 15));
		libretto.add(voto1);
		
		libretto.add(new Voto("Fisica I", 28, LocalDate.of(2019, 7, 15)));
		libretto.add(new Voto("Informatica", 24, LocalDate.of(2019, 7, 16)));
		
		System.out.println(libretto);

	}

}
