package ch.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import ch.zuehlke.springfundamentals.dependencyinjection.domain.Customer;

public interface CustomerLoader {
    Customer findById(String customerId);
}
