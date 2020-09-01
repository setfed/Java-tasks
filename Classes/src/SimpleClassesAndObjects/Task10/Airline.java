package SimpleClassesAndObjects.Task10;

public class Airline {
    private String destination;
    private String flightNum;
    private String aircraftType;
    private String departureTime;
    private String weekDay;

    public Airline(String destination, String flightNum, String aircraftType, String departureTime, String weekDay) {
        this.destination = destination;
        this.flightNum = flightNum;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNum='" + flightNum + '\'' +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", weekDay='" + weekDay + '\'' +
                '}';
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }
}
