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
	
	@Override
	public boolean equals(Object obj)
	{		
		if(!(obj instanceof Voto))
			return false;
		else
		{
			Voto altroVoto = (Voto)obj;
			if(this.nomeCorso.toLowerCase().equals(altroVoto.nomeCorso.toLowerCase()) && this.voto == altroVoto.voto)
				return true;
			else
				return false;
		}
		/* oppure:
		if(	obj instanceof Voto && 
			((Voto)obj).voto == this.voto &&
			((Voto)obj).nomeCorso.toLowerCase().equals(this.nomeCorso.toLowerCase()) )
			return true;
		else
			return false;
		*/
	}
	
	

	public int getVoto()
	{
		return this.voto;
	}
	
	public String getNomeCorso()
	{
		return this.nomeCorso;
	}

	
	
	
	
}









