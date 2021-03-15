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

	public int getVoto() { return this.voto; }	
	public String getNomeCorso() { return this.nomeCorso; }
	public LocalDate getData() { return this.dataSuperamentoEsame; }

	@Override
	public String toString()
	{
		return String.format("Esame \"%s\" superato con %d in data %s", nomeCorso, voto, dataSuperamentoEsame);
	}
	
	/*
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeCorso == null) ? 0 : nomeCorso.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Voto other = (Voto) obj;
		if(nomeCorso == null)
		{
			if(other.nomeCorso != null)
				return false;
		}
		else if(!nomeCorso.equals(other.nomeCorso))
			return false;
		return true;
	}
*/

	
	
	
	
	
}









