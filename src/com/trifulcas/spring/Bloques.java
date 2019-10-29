package com.trifulcas.spring;

import java.util.ArrayList;
import java.util.Iterator;

public class Bloques implements IProcesar {
	//Constructor Simple
	public Bloques(){
		
	}
	
	//Metodos solicitados
	public ArrayList<String> dividir(String cadena)
	{
		ArrayList<String> trozos = new ArrayList<String>();
        char[] cuatro = cadena.toCharArray();
        String elemento = "";
           
        for(int i = 0; i < cuatro.length; i++)
        {
           int a = 1+i;
           elemento = elemento + cuatro[i];
           if (a % 4 == 0)
           	{
        	 trozos.add(elemento); 
        	 elemento = "";
           	} else {
           				if (i==(cuatro.length-1)){trozos.add(elemento);}
           		   }
        	
        }
        return trozos;
	}
	
	public String unir(ArrayList<String> cadenas)
	{ 
		Iterator<String> array = cadenas.iterator();
		String elemento = "";
		while(array.hasNext())
		{
			elemento = elemento + array.next();
		}
		return elemento;
	}
}
