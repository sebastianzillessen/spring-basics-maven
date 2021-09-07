package ch.zuehlke.springfundamentals.dependencyinjection.dataaccess;

import ch.zuehlke.springfundamentals.dependencyinjection.domain.Customer;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class RemoteCustomerLoader implements CustomerLoader {

  @Override
  public Customer findById(String customerId) {
    try {
      System.out.println("MAKING A REMOTE CALL...");
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return InMemoryDatabase.DATABASE.get(customerId);
  }
}
