package Aggregation.Task3;

import java.util.ArrayList;
import java.util.Objects;

public class City {
    boolean isRegionCenter;
    private String cityName;
    private ArrayList<District> districts = new ArrayList<>();
    private double area;

    public City(String cityName) {
        this.cityName = cityName;
        this.isRegionCenter = false;
        System.out.printf("Был создан город %s\n", this.toString());
    }

    public City(String cityName, boolean isRegionCenter) {
        this.cityName = cityName;
        this.isRegionCenter = isRegionCenter;
        System.out.printf("Был создан город %s\n", this.toString());
    }

    public void addDistrict(District district) {
        this.districts.add(district);
        this.area += district.getArea();
        System.out.printf("Район %s был добавлен в город %s\n", district, this.getCityName());
    }

    public void deleteDistrict(District removeDistrict) {
        for (int i = 0; i < this.districts.size(); i++) {
            if (this.districts.get(i).equals(removeDistrict)) {
                this.districts.remove(i);
                this.area -= removeDistrict.getArea();
                System.out.printf("Район %s был удален из города %s\n", removeDistrict.getDistrictName(), this.getCityName());
                break;
            }
        }
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(ArrayList<District> districts) {
        for (District d : districts
        ) {
            this.area += d.getArea();
        }
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    public void setRegionCenter(boolean regionCenter) {
        isRegionCenter = regionCenter;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", isRegionCenter=" + isRegionCenter +
                ", districts=" + districts +
                ", area=" + area +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return isRegionCenter == city.isRegionCenter &&
                Double.compare(city.area, area) == 0 &&
                cityName.equals(city.cityName) &&
                Objects.equals(districts, city.districts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName, isRegionCenter, districts, area);
    }

    public ArrayList<District> getDistricts() {
        return districts;
    }
}