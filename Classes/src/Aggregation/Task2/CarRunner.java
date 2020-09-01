package Aggregation.Task2;

public class CarRunner {
    public static void main(String[] args) {
        Car ford = new Car("Ford", 10, 300);
        System.out.println(ford.getCarName());
        ford.ride();
        ford.increaseFuel(100);
        ford.ride();
        ford.startEngine();
        ford.changeWheel(21);
        ford.ride();
        System.out.println("Пробег автомобиля составляет " + ford.getMileage() + " км.");
        System.out.println("Остаток топлива " + ford.getFuel() + " литров.");
        ford.increaseFuel(119);
        ford.ride();
        ford.startEngine();
        ford.ride();
        ford.changeWheel(21);
        System.out.println("Пробег автомобиля составляет " + ford.getMileage() + " км.");
        System.out.println("Остаток топлива " + ford.getFuel() + " литров.");

        System.out.println(ford.toString());
    }
}