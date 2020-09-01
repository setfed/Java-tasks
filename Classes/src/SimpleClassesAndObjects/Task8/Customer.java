package SimpleClassesAndObjects.Task8;

public class Customer {
    private int id;
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int bankCardNum;
    private int bankAccountNum;

    public Customer(int id, String surname, String name, String middleName, String address, int bankCardNum, int bankAccountNum) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.bankCardNum = bankCardNum;
        this.bankAccountNum = bankAccountNum;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", bankCardNum='" + bankCardNum + '\'' +
                ", bankAccountNum='" + bankAccountNum + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getBankCardNum() {
        return bankCardNum;
    }

    public void setBankCardNum(int bankCardNum) {
        this.bankCardNum = bankCardNum;
    }

    public int getBankAccountNum() {
        return bankAccountNum;
    }

    public void setBankAccountNum(int bankAccountNum) {
        this.bankAccountNum = bankAccountNum;
    }
}
