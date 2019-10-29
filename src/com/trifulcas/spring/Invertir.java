package com.trifulcas.spring;

public class Invertir implements ICodificar {
	//Constructor simple.
	public Invertir(){}
	
	//Metodos solicitado (codificar = decodificar en este caso)
	public String codificar(String cadena)
	{
		char[] aCaracteres = cadena.toCharArray();
		String devolver = "";
		
		for(int i=aCaracteres.length-1;-1<i;i--)
		{
			devolver = devolver + String.valueOf(aCaracteres[i]);
		}
	return devolver;
	}
	
	public String decodificar(String cadena)
	{
		char[] aCaracteres = cadena.toCharArray();
		String devolver = "";
		
		for(int i=aCaracteres.length-1;-1<i;i--)
		{
			devolver = devolver + String.valueOf(aCaracteres[i]);
		}
	return devolver;
	}
}
