package com.zuehlke.springfundamentals.dependencyinjection;

import com.zuehlke.springfundamentals.dependencyinjection.configuration.AppConfig;
import com.zuehlke.springfundamentals.dependencyinjection.controller.CustomerController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {

    ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

    CustomerController customerController = ctx.getBean(CustomerController.class);

    customerController.deactivateCustomerAccount("1");
  }
}
