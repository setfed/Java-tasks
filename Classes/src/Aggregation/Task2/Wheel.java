package Aggregation.Task2;

import java.util.Objects;

public class Wheel {
    private final double RADIUS = 15;

    private double radius;

    Wheel() {
        this.radius = RADIUS;
    }

    Wheel(double radius) {
        if (radius < 14 || radius > 32) {
            throw new IllegalArgumentException("Размер колеса должен быть от 14 до 32 дюймов");
        } else
            this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 14 || radius > 32) {
            throw new IllegalArgumentException("Размер колеса должен быть от 14 до 32 дюймов");
        } else
            this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return Double.compare(wheel.radius, radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                '}';
    }
}
