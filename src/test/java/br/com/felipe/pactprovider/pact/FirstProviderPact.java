package br.com.felipe.pactprovider.pact;

import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

import au.com.dius.pact.core.model.annotations.PactFolder;
import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.loader.PactBroker;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;

@Provider("api_provider")
@PactBroker(host = "localhost", port = "9292", scheme = "http", consumers = "test_consumer")
@PactFolder("pacts")
@SpringBootTest
public class FirstProviderPact {

    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void testTemplate(PactVerificationContext context) {
      context.verifyInteraction();
    }
}
