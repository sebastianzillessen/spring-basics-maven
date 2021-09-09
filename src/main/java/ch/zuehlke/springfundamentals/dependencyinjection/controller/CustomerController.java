package ch.zuehlke.springfundamentals.dependencyinjection.controller;

import ch.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerController {

  private final CustomerService customerService;

  @Autowired
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void deactivateCustomerAccount(String customerId) {
    customerService.deactivateCustomer(customerId);
  }
}
