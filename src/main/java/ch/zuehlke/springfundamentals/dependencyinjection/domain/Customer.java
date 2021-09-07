package ch.zuehlke.springfundamentals.dependencyinjection.domain;

public class Customer {
    private final String id;
    private final String name;
    private final MailingAddress mailingAddress;
    private final String emailAddress;

    public Customer(String id, String name, MailingAddress mailingAddress, String emailAddress) {

        this.id = id;
        this.name = name;
        this.mailingAddress = mailingAddress;
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "Customer: " +
                "id: " + this.id +
                "name: " + this.name +
                "email: " + this.emailAddress +
                "mailingAddress: " + this.mailingAddress;
    }

    public boolean hasEmailAddress() {
        return emailAddress != null && !emailAddress.isBlank();
    }

    public String getEmailAddress() {
        return this.emailAddress;

    }

    public MailingAddress getMailingAddress() {
        return this.mailingAddress;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
