package Aggregation.Task2;

import java.util.Objects;

public class Engine {
    private int mileage = 0;
    private boolean isStarted = false;
    private int consumption = 5;

    public Engine(int consumption) {
        this.consumption = consumption;
    }

    public void startEngine() {
        this.isStarted = true;
        System.out.println("Двигатель заведён");
    }

    public void stopEngine() {
        this.isStarted = false;
    }

    public boolean isStarted() {
        return this.isStarted;
    }

    public int getConsumption() {
        return this.consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getMileage() {
        return this.mileage;
    }

    public void increaseMileage() {
        this.mileage++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return mileage == engine.mileage &&
                isStarted == engine.isStarted &&
                consumption == engine.consumption;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mileage, isStarted, consumption);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "mileage=" + mileage +
                ", isStarted=" + isStarted +
                ", consumption=" + consumption +
                '}';
    }
}
