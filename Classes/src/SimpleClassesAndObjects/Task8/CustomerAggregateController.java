package SimpleClassesAndObjects.Task8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerAggregateController {
    public static void showCustomersInAlphabeticOrder(ArrayList<Customer> customers) {
        customers.sort(Comparator.comparing(Customer::getSurname));
        System.out.println("Showing customers in alphabetic order");
        customers.forEach(x -> System.out.println(x.toString()));
    }

    public static void showCustomersByCardNum(ArrayList<Customer> customers, int start, int end) {
        if (start > end) {
            System.out.println("Seems that it makes no sense");
        } else {
            List<Customer> sorted = customers.stream().filter((Customer c1) -> c1.getBankCardNum() >= start && c1.getBankCardNum() <= end).collect(Collectors.toList());
            System.out.printf("Showing customers with card in interval %s - %s\n", start, end);
            sorted.forEach(x -> System.out.println(x.toString()));
        }
    }


    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Jacjson", "Max", "-", "Flower road 3", 576, 5754);
        Customer customer2 = new Customer(2, "Michelson", "Valery", "Borisovna", "Nikolaev road 124/2", 123, 4456);
        Customer customer3 = new Customer(3, "Proscop", "Michael", "-", "California street", 232, 4712);

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);

        showCustomersInAlphabeticOrder(customers);
        System.out.println();
        showCustomersByCardNum(customers, 100, 300);
    }
}
