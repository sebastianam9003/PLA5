package com.trifulcas.spring;

import java.util.ArrayList;
import java.util.Iterator;


public class Palabras implements IProcesar {
	//Constructor Simple
	public Palabras(){
		
	}
	//Metodos solicitados
	public ArrayList<String> dividir(String cadena)
    {
        ArrayList<String> trozos = new ArrayList<String>();
        String[] array = cadena.split(" ");
        
        for(int i = 0; i < array.length; i++)
        {
            trozos.add(array[i]);
        }
        return trozos;
    }  
	
	public String unir(ArrayList<String> cadenas)
	{
		String elemento = "";
		Iterator<String> aux = cadenas.iterator();
		
		while(aux.hasNext()){
			if (elemento == "")
				{
						elemento = elemento + aux.next();
				} else {
						elemento = elemento + " " + aux.next();
						}
			
		}
		return elemento;
	}
}
