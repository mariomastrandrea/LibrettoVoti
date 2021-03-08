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
	
	public List<Voto> getListaVotiUgualiA(int voto)
	{
		List<Voto> listaVotiUguali = new ArrayList<>();
		for(Voto v : this.voti)
			if(v.getVoto() == voto)
				listaVotiUguali.add(v);
				
		return listaVotiUguali;
	}
	
	
	public Libretto getLibrettoConVotiUgualiA(int voto)
	{
		Libretto librettoConVotiUguali = new Libretto();
		for(Voto v : this.voti)
			if(v.getVoto() == voto)
				librettoConVotiUguali.add(v);
		
		return librettoConVotiUguali;
	}
	
	/**
	 * ricerca un voto del corso specificato tramite parametro
	 * @param nomeCorso stringa del nome del corso
	 * @return
	 */
	public Voto cercaVotoCorso(String nomeCorso)
	{
		for(Voto v : this.voti)
			if(v.getNomeCorso().toLowerCase().equals(nomeCorso.toLowerCase()))
				return v;
		//else
		return null;
	}
}








