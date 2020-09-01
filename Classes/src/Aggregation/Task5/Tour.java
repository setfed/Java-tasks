package Aggregation.Task5;

import java.util.Objects;

public class Tour {
    private TourType tourType;
    private TransportType transportType;
    private boolean food;
    private int numberOfDays;
    private int cost;

    public Tour(TourType tourType, TransportType transportType, boolean food, int numberOfDays, int cost) {
        this.tourType = tourType;
        this.transportType = transportType;
        this.food = food;
        this.numberOfDays = numberOfDays;
        this.cost = cost;
    }

    public TourType getTourType() {
        return tourType;
    }

    public void setTourType(TourType tourType) {
        this.tourType = tourType;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return food == tour.food &&
                numberOfDays == tour.numberOfDays &&
                cost == tour.cost &&
                tourType == tour.tourType &&
                transportType == tour.transportType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tourType, transportType, food, numberOfDays, cost);
    }

    @Override
    public String toString() {
        return "Tour{" +
                "tourType=" + tourType +
                ", transportType=" + transportType +
                ", food=" + food +
                ", numberOfDays=" + numberOfDays +
                ", cost=" + cost +
                '}';
    }
}