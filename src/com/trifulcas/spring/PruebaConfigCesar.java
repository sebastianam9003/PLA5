package com.trifulcas.spring;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.trifulcas.spring")
public class PruebaConfigCesar {

	@Bean
	public Palabras palabra() {return new Palabras();
	}
	
	//Se le pone un paso = 5
	@Bean
	public Cesar cesar() { return new Cesar(5);
	
	}
	
	@Bean
	public String setCadena() { return "Es un dia muy largo.";
			
	}
	
	@Bean
	public Codificador code() { return new Codificador(palabra(), cesar(), setCadena());
	}
}
