package ch.zuehlke.springfundamentals.dependencyinjection.controller;

import ch.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  private final CustomerService customerService;

  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = this.customerService;
    customerService.deactivateCustomer(customerId);
  }
}
