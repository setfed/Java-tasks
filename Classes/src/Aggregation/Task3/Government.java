package Aggregation.Task3;

import java.util.ArrayList;
import java.util.Objects;

public class Government {
    private String governmentName;
    private City capital;
    private ArrayList<Region> regions = new ArrayList<>();
    private double area;

    public Government(String governmentName) {
        this.governmentName = governmentName;
        System.out.printf("Было создана государство %s\n", this.toString());
    }

    public String getGovernmentName() {
        return governmentName;
    }

    public void setGovernmentName(String governmentName) {
        this.governmentName = governmentName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void addRegion(Region region) {
        this.regions.add(region);
        this.area += region.getArea();
        System.out.printf("Регион %s был добавлен в государство %s\n", region, this.getGovernmentName());
    }

    public void deleteRegion(Region removeRegion) {
        for (int i = 0; i < this.regions.size(); i++) {
            if (this.regions.get(i).equals(removeRegion)) {
                this.regions.remove(i);
                this.area -= removeRegion.getArea();
                System.out.printf("Регион %s был удален из государства %s\n", removeRegion.getRegionName(), this.getGovernmentName());
                break;
            }
        }
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Government that = (Government) o;
        return Double.compare(that.area, area) == 0 &&
                governmentName.equals(that.governmentName) &&
                Objects.equals(capital, that.capital) &&
                Objects.equals(regions, that.regions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(governmentName, capital, regions, area);
    }

    @Override
    public String toString() {
        return "Government{" +
                "governmentName='" + governmentName + '\'' +
                ", capital=" + capital +
                ", regions=" + regions +
                ", area=" + area +
                '}';
    }

    public int getNumOfRegions() {
        return this.regions.size();
    }

    public ArrayList<String> getRegionCenters() {
        ArrayList<String> regionCenters = new ArrayList<>();
        for (Region r : this.regions
        ) {
            for (City c : r.getCities()
            ) {
                if (c.isRegionCenter) {
                    regionCenters.add(c.getCityName());
                }
            }
        }
        return regionCenters;
    }
}