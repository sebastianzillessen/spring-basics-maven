package ch.zuehlke.springfundamentals.dependencyinjection;

import ch.zuehlke.springfundamentals.dependencyinjection.controller.CustomerController;
import ch.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;
import ch.zuehlke.springfundamentals.dependencyinjection.service.EmailService;
import ch.zuehlke.springfundamentals.dependencyinjection.service.PostalService;

public class Application {

  public static void main(String[] args) {

    EmailService emailService = new EmailService();
    PostalService postalService = new PostalService();
    CustomerService customerService = new CustomerService(emailService, postalService);

    CustomerController customerController = new CustomerController(customerService);

    customerController.deactivateCustomerAccount("1");
  }

}
