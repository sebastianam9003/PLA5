package com.trifulcas.spring;

public class Cesar implements ICodificar {
	//Propiedades
	private int Paso;
	private String[] ABCD = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	//Constructor.
	public Cesar(){
		Paso = 2;
	}
	public Cesar(int _paso){
		Paso = _paso;
	}
	
	//Metodos solicitado
	public String codificar(String cadena)
	{
		String palabras = cadena.toUpperCase();
		char[] aCaracteres = palabras.toCharArray();
		String devolver = "";
		boolean saliDelFor = false;
		
		for(int i=0;i<aCaracteres.length;i++)
		{
			for(int x=0;x<ABCD.length;x++)
			{
				if (String.valueOf(aCaracteres[i]).equals(ABCD[x]))
						{
					     int a = x + Paso;
					     if (a>(ABCD.length-1)) { a = a - ABCD.length;}
					     
					     devolver = devolver + ABCD[a];
					     saliDelFor = false;
					     break;
						}
				saliDelFor = true;
			}
			if (saliDelFor == true)
			{
				devolver = devolver + String.valueOf(aCaracteres[i]);
			}
			
		}
	return devolver;
	}
	
	public String decodificar(String cadena)
	{
		String palabras = cadena.toUpperCase();
		char[] aCaracteres = palabras.toCharArray();
		String devolver = "";
		boolean saliDelFor = false;
	
		for(int i=0;i<aCaracteres.length;i++)
		{
			for(int x=0;x<ABCD.length;x++)
			{
				if (String.valueOf(aCaracteres[i]).equals(ABCD[x]))
					{
				     int a = x - Paso;
				     if (a<0) { a = ABCD.length + a;}
				     
				     devolver = devolver + ABCD[a];
				     saliDelFor = false;
				     break;
					}
				saliDelFor = true;
			}
			if (saliDelFor == true)
				{
					devolver = devolver + String.valueOf(aCaracteres[i]);
				}
		
		}
		return devolver;
	}
}
