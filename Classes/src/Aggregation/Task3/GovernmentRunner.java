package Aggregation.Task3;

public class GovernmentRunner {
    public static void main(String[] args) {
        District MidTown = new District("MidTown", 10);
        District Yorkville = new District("Yorkville", 10);
        District OldTown = new District("Old Town", 30);
        City Toronto = new City("Toronto", true);

        Toronto.addDistrict(MidTown);
        Toronto.addDistrict(Yorkville);
        Toronto.addDistrict(OldTown);

        City Vancouver = new City("Vancouver");
        District Eastside = new District("Eastside", 40);

        Vancouver.addDistrict(Eastside);
        Toronto.deleteDistrict(MidTown);

        Region Ontario = new Region("Ontario");
        Ontario.addCity(Toronto);
        Ontario.addCity(Vancouver);

        Government Canada = new Government("Canada");
        Canada.addRegion(Ontario);
        Canada.setCapital(Toronto);

        System.out.println("Площадь равна " + Canada.getArea());
        System.out.println("Столица " + Canada.getCapital().getCityName());
        System.out.println("Количество регионов равно " + Canada.getNumOfRegions());
        System.out.println("Региональные центры: " + Canada.getRegionCenters());
    }
}
