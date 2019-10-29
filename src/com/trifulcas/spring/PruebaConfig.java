package com.trifulcas.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.trifulcas.spring")
public class PruebaConfig {

	@Bean
	public Palabras palabra() {return new Palabras();
	}
	
	@Bean
	public Invertir invertir() { return new Invertir();
	
	}
	
	@Bean
	public String setCadena() { return "Es un dia muy largo.";
			
	}
	
	@Bean
	public Codificador code() { return new Codificador(palabra(), invertir(), setCadena());
	}
}
	
