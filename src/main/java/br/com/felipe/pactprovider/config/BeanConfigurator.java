package br.com.felipe.pactprovider.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.felipe.pactprovider.domain.service.ProviderService;

@Configuration
public class BeanConfigurator {

	@Bean
	public ProviderService providerService() {
		return new ProviderService();
	}
}
