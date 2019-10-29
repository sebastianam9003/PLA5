package com.trifulcas.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		
		// Cargar el contexto en XML
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextCesar.xml");
		
		//Cargar el contexto sin XML
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PruebaConfigCesar.class);
		
		//Llamamos al Bean
		Codificador code = context.getBean("code", Codificador.class);
		
		
		//Invocación del constructor de Codificador sin spring
		//Codificador code = new Codificador(new Palabras(), new Invertir());
		//Codificador otro = new Codificador(new Palabras(), new Cesar(5));
		
		//Se usa metodos
		System.out.println("Ahora se codifica y decodifica el mismo mensaje ");
		String resultado = code.Codificar(code.getProceso(), code.getCodigo());
		System.out.println("Resultado del Codificar --> " + resultado);
						
		String datluser = code.Decodificar(code.getProceso(), code.getCodigo(), resultado);
		System.out.println("Resultado del Codificar --> " + datluser);
		
		//Cerrar el contexto
		context.close();
		
	}

}
