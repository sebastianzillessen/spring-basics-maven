package ch.zuehlke.springfundamentals.dependencyinjection.service;

import ch.zuehlke.springfundamentals.dependencyinjection.dataaccess.CustomerLoader;
import ch.zuehlke.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerService {

  private static final String DEACTIVATION_MESSAGE = "Your customer account has been successfully removed";
  private final EmailService emailService;
  private final PostalService postalService;

  public CustomerService(EmailService emailService, PostalService postalService) {
    this.emailService = emailService;
    this.postalService = postalService;
  }

  public void deactivateCustomer(String customerId) {

    CustomerLoader customerLoader = new CustomerLoader();
    Customer customer = customerLoader.findById(customerId);

    if (customer.hasEmailAddress()) {
      String emailAddress = customer.getEmailAddress();
      emailService.send(emailAddress, "Customer Account", DEACTIVATION_MESSAGE);
    }

    postalService.sendLetter(customer.getMailingAddress(), DEACTIVATION_MESSAGE);
  }
}
