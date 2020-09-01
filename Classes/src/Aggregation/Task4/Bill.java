package Aggregation.Task4;

import java.util.Objects;

public class Bill {
    private String name;
    private double value;
    private boolean isBlocked = false;

    public Bill(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public Bill(String name) {
        this.name = name;
        this.value = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (!isBlocked)
            this.value = value;
        else
            System.out.println("Счет заблокирован ");
    }

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bill bill = (Bill) o;
        return Double.compare(bill.value, value) == 0 &&
                isBlocked == bill.isBlocked &&
                name.equals(bill.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value, isBlocked);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", isBlocked=" + isBlocked +
                '}';
    }
}