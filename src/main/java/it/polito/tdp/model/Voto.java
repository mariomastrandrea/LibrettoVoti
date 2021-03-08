package it.polito.tdp.model;

import java.time.LocalDate;

// POJO - Plain Old Java Object
// Java Bean
// Semplice contenitore di dati -- non ha "logica"

/**
 * Memorizza il risultato di un esame singolo
 * @author mariomastrandrea
 */
public class Voto
{
	private String nomeCorso;
	private int voto; //lode???
	private LocalDate dataSuperamentoEsame;	//data superamento esame
	
	
	public Voto(String nomeCorso, int voto, LocalDate dataSuperamentoEsame)
	{
		this.nomeCorso = nomeCorso;
		this.voto = voto;
		this.dataSuperamentoEsame = dataSuperamentoEsame;
	}


	@Override
	public String toString()
	{
		return String.format("Esame \"%s\" superato con %d in data %s", nomeCorso, voto, dataSuperamentoEsame);
	}

	
	
	
	
}









