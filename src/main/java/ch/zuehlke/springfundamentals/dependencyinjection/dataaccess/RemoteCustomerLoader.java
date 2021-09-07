package ch.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import ch.acme.customermasterdata.api.CmdCustomerDto;
import ch.acme.customermasterdata.api.CustomerMasterDataClient;
import ch.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import ch.zuehlke.springfundamentals.dependencyinjection.domain.MailingAddress;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class RemoteCustomerLoader implements CustomerLoader {

  private final CustomerMasterDataClient customerMasterDataClient;

  public RemoteCustomerLoader(CustomerMasterDataClient customerMasterDataClient) {
    this.customerMasterDataClient = customerMasterDataClient;
  }

  @Override
  public Customer findById(String customerId) {
    CmdCustomerDto loadedCustomer = customerMasterDataClient.findById(customerId);

    return new Customer(loadedCustomer.getId(),
        loadedCustomer.getName(),
        new MailingAddress(loadedCustomer.getStreet(), loadedCustomer.getCity()),
        loadedCustomer.getEmailAddress());
  }
}
