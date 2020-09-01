package Aggregation.Task5;

import java.util.Objects;

public class Client {
    private String clientName;
    private int clientAge;
    private String clientPhoneNumbers;

    public Client(String clientName, int clientAge, String clientPhoneNumbers) {
        this.clientName = clientName;
        this.clientAge = clientAge;
        this.clientPhoneNumbers = clientPhoneNumbers;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public int getClientAge() {
        return clientAge;
    }

    public void setClientAge(int clientAge) {
        this.clientAge = clientAge;
    }

    public String getClientPhoneNumbers() {
        return clientPhoneNumbers;
    }

    public void setClientPhoneNumbers(String clientPhoneNumbers) {
        this.clientPhoneNumbers = clientPhoneNumbers;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientAge=" + clientAge +
                ", clientPhoneNumbers='" + clientPhoneNumbers + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientAge == client.clientAge &&
                clientName.equals(client.clientName) &&
                clientPhoneNumbers.equals(client.clientPhoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientName, clientAge, clientPhoneNumbers);
    }
}
