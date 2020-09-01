package Aggregation.Task4;

import java.util.Comparator;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Client {
    private String name;
    private TreeSet<Bill> bills = new TreeSet<>(Comparator.comparingDouble(Bill::getValue));

    public Client(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Client Max = new Client("Max");

        Bill deposit1 = new Bill("Deposit", 10);
        Bill deposit2 = new Bill("Deposit2", -2);
        Bill deposit3 = new Bill("Deposit2", 200);
        Bill deposit4 = new Bill("Deposit2", -3);

        Max.addBill(deposit1);
        Max.addBill(deposit2);
        Max.addBill(deposit3);
        Max.addBill(deposit4);

        deposit3.setBlocked(true);
        deposit4.setBlocked(true);

        System.out.println(Max.getBills());
        System.out.println("Сумма на всех счетах " + Max.getSumBalance());
        System.out.println("Сумма положительных счетов равна " + Max.getSumBalancePos());
        System.out.println("Сумма отрицательных счетов равна " + Max.getSumBalanceNeg());

        System.out.println("Пользователь имеет счет c параметрами " + Max.showExactBill(new Bill("Deposit2", -2)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set getBills() {
        return bills;
    }

    public void setBills(TreeSet bills) {
        this.bills = bills;
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return name.equals(client.name) &&
                Objects.equals(bills, client.bills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bills);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", bills=" + bills +
                '}';
    }

    public double getSumBalance() {
        double sum = 0;
        for (Bill b : this.bills
        ) {
            if (b.isBlocked())
                sum += b.getValue();
        }
        return sum;
    }

    public double getSumBalancePos() {
        int posSum = 0;
        for (Bill b : this.bills
        ) {
            if (b.isBlocked())
                if (b.getValue() > 0) {
                    posSum += b.getValue();
                }
        }
        return posSum;
    }

    public double getSumBalanceNeg() {
        int negSum = 0;
        for (Bill b : this.bills
        ) {
            if (b.isBlocked())
                if (b.getValue() < 0) {
                    negSum += b.getValue();
                }
        }
        return negSum;
    }

    public Bill showExactBill(Bill searchBill) {
        Bill exactBill = null;
        for (Bill b : this.bills
        ) {
            if (b.equals(searchBill)) {
                exactBill = b;
            }
        }
        return exactBill;
    }
}
