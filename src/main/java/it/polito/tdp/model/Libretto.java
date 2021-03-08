package it.polito.tdp.model;

import java.util.*;

public class Libretto
{
	private List<Voto> voti;
	
	
	public Libretto()
	{
		this.voti = new ArrayList<>();
	}

	public void add(Voto newVoto)
	{
		this.voti.add(newVoto);	
	}
	
	@Override
	public String toString()
	{
		String lista = "";
		for(Voto v : this.voti)
		{
			if(!lista.isEmpty())
				lista += "\n";
			lista += v.toString();
		}
		return lista;
	}
	
}
