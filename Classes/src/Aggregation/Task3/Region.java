package Aggregation.Task3;

import java.util.ArrayList;
import java.util.Objects;

public class Region {
    private String regionName;
    private ArrayList<City> cities = new ArrayList<>();
    private double area;

    public Region(String regionName) {
        this.regionName = regionName;
        System.out.printf("Была создана область %s\n", this.toString());
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void addCity(City city) {
        this.cities.add(city);
        this.area += city.getArea();
        System.out.printf("Город %s был добавлен в город %s\n", city, this.getRegionName());
    }

    public void deleteCity(City removeCity) {
        for (int i = 0; i < this.cities.size(); i++) {
            if (this.cities.get(i).equals(removeCity)) {
                this.cities.remove(i);
                this.area -= removeCity.getArea();
                System.out.printf("Город %s был удален из области %s\n", removeCity.getCityName(), this.getRegionName());
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Region{" +
                "regionName='" + regionName + '\'' +
                ", cities=" + cities +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Region region = (Region) o;
        return Double.compare(region.area, area) == 0 &&
                Objects.equals(regionName, region.regionName) &&
                Objects.equals(cities, region.cities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regionName, cities, area);
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
}
