package com.trifulcas.spring;

import java.util.ArrayList;
import java.util.Iterator;

public class Codificador {

	private IProcesar Proceso;
	private ICodificar Codigo;
	private String Cadena;
	
	public Codificador (IProcesar _proceso, ICodificar _codigo, String _cadena)
	{
		Proceso = _proceso;
		Codigo = _codigo;
		Cadena = _cadena;
	}
	
	public IProcesar getProceso()
	{
		return Proceso;
	}
	
	public void setProceso(IProcesar _proceso)
	{
		this.Proceso = _proceso;
	}
	
	public ICodificar getCodigo()
	{
		return Codigo;
	}
	
	public void setCodigo(ICodificar _codigo)
	{
		this.Codigo = _codigo;
	} 
	
	public String getCadena() 
	{
		return Cadena;
	}
	
	public void setCadena(String _cadena)
	{
		this.Cadena = _cadena;
	}
	
	public String Codificar(IProcesar word, ICodificar code)
	{
		ArrayList<String> trozosUnidos = new ArrayList<String>();
		ArrayList<String> trozos = word.dividir(Cadena);
				//System.out.println("Estoy en el metodo --> " + code);
		Iterator<String> aux = trozos.iterator();
		while(aux.hasNext())
		{
			String cadena2 = aux.next();
			trozosUnidos.add(code.codificar(cadena2));
		}	
		
		return word.unir(trozosUnidos);
		
	}
	
	public String Decodificar(IProcesar word, ICodificar code, String cadena)
	{
		ArrayList<String> trozosUnidos = new ArrayList<String>();
		ArrayList<String> trozos = word.dividir(cadena);
				
		Iterator<String> aux = trozos.iterator();
		while(aux.hasNext())
		{
			String cadena2 = aux.next();
			trozosUnidos.add(code.decodificar(cadena2));
		}	
		
		return word.unir(trozosUnidos);
	}
}
