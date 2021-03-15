package it.polito.tdp.model;

import java.util.*;

public class Libretto
{
	private List<Voto> voti;
	private Map<String, Voto> votiMap;  //identity map: nome esame -> oggetto Voto
	
	
	public Libretto()
	{
		this.voti = new ArrayList<>();
		this.votiMap = new HashMap<>();
	}

	public void add(Voto newVoto)
	{
		this.voti.add(newVoto);	
		this.votiMap.put(newVoto.getNomeCorso(), newVoto);
	}
	
	/**
	 * verifica se nel libretto esiste gia' un esame con lo stesso nome e la stessa votazione
	 * @param v voto da cercare
	 * @return true o false
	 */
	public boolean esisteDuplicato(Voto v)
	{
		/*
		for(Voto voto : this.voti)
			if(voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto() == v.getVoto())
				return true;
		
		return false;
		*/
		
		Voto votoTrovato = this.votiMap.get(v.getNomeCorso());
		if(votoTrovato == null)
			return false;
		else
			return votoTrovato.getVoto() == v.getVoto();
	}
	
	/**
	 * verifica se nel libretto esiste gia' un esame con lo stesso nome ma votazione diversa
	 * @param v voto da cercare
	 * @return true o false
	 */
	public boolean esisteConflitto(Voto v)
	{
		/*
		for(Voto voto : this.voti)
			if(voto.getNomeCorso().equals(v.getNomeCorso()) && voto.getVoto() != v.getVoto())
				return true;
		
		return false;
		*/
		Voto votoTrovato = this.votiMap.get(v.getNomeCorso());
		if(votoTrovato == null)
			return false;
		else
			return votoTrovato.getVoto() != v.getVoto();
		
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
		/*
		for(Voto v : this.voti)
			if(v.getNomeCorso().toLowerCase().equals(nomeCorso.toLowerCase()))
				return v;
		//else
		return null;
		*/
		return this.votiMap.get(nomeCorso);
	}
}








