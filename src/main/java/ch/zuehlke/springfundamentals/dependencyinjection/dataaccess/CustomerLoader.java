package ch.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import ch.zuehlke.springfundamentals.dependencyinjection.domain.Customer;

public class CustomerLoader {

  public Customer findById(String customerId) {
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
