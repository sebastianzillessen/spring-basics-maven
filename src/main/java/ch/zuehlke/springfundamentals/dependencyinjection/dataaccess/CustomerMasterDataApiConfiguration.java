package ch.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import ch.acme.customermasterdata.api.CustomerMasterDataClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerMasterDataApiConfiguration {
    @Bean
    public CustomerMasterDataClient cmdClient() {
        return new CustomerMasterDataClient();
    }
}
