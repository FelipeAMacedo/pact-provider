package br.com.felipe.pactprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.felipe.pactprovider.config.BeanConfigurator;

@SpringBootApplication
@Import(BeanConfigurator.class)
public class PactProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(PactProviderApplication.class, args);
	}

}
