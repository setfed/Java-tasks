package Aggregation.Task3;

import java.util.Objects;

public class District {
    private final double AREA = 10;

    private String districtName;
    private double area;

    public District(String districtName, double area) {
        this.districtName = districtName;
        this.area = area;
        System.out.printf("Был создан район: %s\n", this.toString());
    }

    public District(String districtName) {
        this.districtName = districtName;
        this.area = AREA;
        System.out.printf("Был создан район:%s\n", this.toString());
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        District district = (District) o;
        return Double.compare(district.area, area) == 0 &&
                districtName.equals(district.districtName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(districtName, area);
    }

    @Override
    public String toString() {
        return "District{" +
                "districtName='" + districtName + '\'' +
                ", area=" + area +
                '}';
    }
}
