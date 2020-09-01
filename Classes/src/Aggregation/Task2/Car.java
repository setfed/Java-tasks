package Aggregation.Task2;

import java.util.Objects;

public class Car {
    private final int FUEL = 0;

    private String carName;
    private int fuel;
    private int tank;

    private Engine engine = new Engine(5);

    private Wheel frontRight = new Wheel();
    private Wheel frontLeft = new Wheel();
    private Wheel rearRight = new Wheel();
    private Wheel rearLeft = new Wheel();

    Car() {
        this.carName = "-";
        this.fuel = FUEL;
        this.tank = fuel;
    }

    Car(String carName, int tank) {
        if (carName == null || carName.equals("")) {
            throw new IllegalArgumentException("У машины должна быть марка");
        } else
            this.carName = carName;
        if (tank < 0)
            throw new IllegalArgumentException("Ёмкость бака не может быть отрицательной");
        else
            this.tank = tank;
        this.fuel = this.tank;
    }

    Car(String carName, int fuel, int tank) {
        if (carName == null || carName.equals("")) {
            throw new IllegalArgumentException("У машины должна быть марка");
        } else
            this.carName = carName;

        if (tank < 0) {
            throw new IllegalArgumentException("Ёмкость бака не может быть отрицательной");
        } else {
            this.tank = tank;
            this.fuel = fuel;
        }
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String brandName) {
        this.carName = brandName;
    }

    public void setTank(int tank) {
        this.tank = tank;
        this.fuel = this.tank;
    }

    public int getFuel() {
        return this.fuel;
    }

    public void ride() {
        int availableToDecrease = this.fuel - this.engine.getConsumption();
        if (this.fuel == 0 && availableToDecrease < this.engine.getConsumption())
            System.out.println("Ехать невозможно");
        else if (!engine.isStarted()) {
            System.out.println("Дигатель не заведён");
        } else {
            System.out.println("Едем, в машине " + this.fuel + " литров");
            int consumption = this.engine.getConsumption();
            for (int i = fuel; i > 0; i -= consumption) {
                if (fuel - this.engine.getConsumption() < 0) {
                    this.engine.stopEngine();
                    break;
                } else {
                    this.fuel = this.fuel - this.engine.getConsumption();
                    this.engine.increaseMileage();
                    System.out.println("Машина проехала " + this.engine.getMileage() + " км, в баке " + this.getFuel());
                }
            }
            this.engine.stopEngine();
            System.out.println("Мало бензина, необходимо заправится");
            ride();
        }
    }

    public void increaseFuel(int fuel) {
        int available = this.tank - this.fuel;

        if (this.tank == 0)
            System.out.println("Не инициализирована ёмкость бака");
        else if (this.tank < fuel)
            System.out.println("Бак на " + this.tank + " литров, в него не влезет " + fuel + " литров");
        else if (available <= this.tank) {
            this.fuel += fuel;
            System.out.println("Машина успешно заправлена на " + fuel + " литров, теперь в баке " + this.fuel);
        } else if (fuel > available && available != 0) {
            System.out.println("Невозможно заправить на " + fuel + " литров");
            System.out.println("Бак не пуст. Остаток " + available + " литров");
            System.out.println("Заправить можно не больше чем на " + available + " литров");
            int excess = fuel - available;
            this.fuel = this.tank;
            System.out.println("Бак был полностью заправлен, остаток не использован, остаток = " + excess);
        } else {
            this.fuel += fuel;
            System.out.println("Машина успешно заправлена на " + fuel + " литров теперь в баке" + this.tank);
        }
    }

    public void changeWheel(double radius) {
        if (this.engine.isStarted()) {
            System.out.println("Нельзя менять колёса на ходу");
        } else {
            this.frontRight = new Wheel(radius);
            this.frontLeft = new Wheel(radius);
            this.rearRight = new Wheel(radius);
            this.rearLeft = new Wheel(radius);
            System.out.println("Колёса успешно заменены");
        }
    }

    public void startEngine() {
        if (this.fuel != 0)
            this.engine.startEngine();
        else
            System.out.println("Машину не завести, бак пуст");
    }

    public int getMileage() {
        return this.engine.getMileage();
    }

    public void setConsumption(int expense) {
        this.engine.setConsumption(expense);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return tank == car.tank &&
                fuel == car.fuel &&
                carName.equals(car.carName) &&
                engine.equals(car.engine) &&
                frontRight.equals(car.frontRight) &&
                frontLeft.equals(car.frontLeft) &&
                rearRight.equals(car.rearRight) &&
                rearLeft.equals(car.rearLeft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, tank, fuel, engine, frontRight, frontLeft, rearRight, rearLeft);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brandName='" + carName + '\'' +
                ", tank=" + tank +
                ", fuel=" + fuel +
                ", engine=" + engine +
                ", frontRight=" + frontRight +
                ", frontLeft=" + frontLeft +
                ", rearRight=" + rearRight +
                ", rearLeft=" + rearLeft +
                '}';
    }
}