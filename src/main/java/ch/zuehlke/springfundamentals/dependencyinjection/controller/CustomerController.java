package ch.zuehlke.springfundamentals.dependencyinjection.controller;

import ch.zuehlke.springfundamentals.dependencyinjection.service.CustomerService;

public class CustomerController {

  public void deactivateCustomerAccount(String customerId) {
    CustomerService customerService = new CustomerService();
    customerService.deactivateCustomer(customerId);
  }
}
