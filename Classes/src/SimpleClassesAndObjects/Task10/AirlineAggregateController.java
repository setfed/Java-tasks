package SimpleClassesAndObjects.Task10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AirlineAggregateController {
    public static void showFlightForDestination(ArrayList<Airline> flights, String destination) {
        List<Airline> sorted = flights.stream()
                .filter((Airline a1) -> a1.getDestination().equals(destination))
                .collect(Collectors.toList());
        System.out.printf("Showing flights to %s\n", destination);
        sorted.forEach(System.out::println);
    }

    public static void showFlightForADay(ArrayList<Airline> flights, String day) {
        List<Airline> sorted = flights.stream()
                .filter((Airline b1) -> b1.getWeekDay().equals(day))
                .collect(Collectors.toList());
        System.out.printf("Showing flights on %s\n", day);
        sorted.forEach(System.out::println);
    }

    public static void showFlightForADaySortedByTime(ArrayList<Airline> flights, String day) {
        List<Airline> sorted = flights.stream()
                .filter((Airline b1) -> b1.getWeekDay().equals(day))
                .sorted((Airline a1, Airline a2) -> a1.getDepartureTime().compareTo(a2.getDepartureTime()))
                .collect(Collectors.toList());
        System.out.printf("Showing flights on %s sorted by time\n", day);
        sorted.forEach(System.out::println);
    }


    public static void main(String[] args) {
        ArrayList<Airline> flights = new ArrayList<>();
        Airline flight1 = new Airline("Moscow"
                , "13FE"
                , "BOEING"
                , "16:00"
                , "MONDAY");

        Airline flight2 = new Airline("Beirut"
                , "14T"
                , "BOEING"
                , "17:00"
                , "TUESDAY");

        Airline flight3 = new Airline("Moscow"
                , "14T13F"
                , "BOEING"
                , "15:00"
                , "MONDAY");

        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        showFlightForADay(flights, "TUESDAY");
        System.out.println();
        showFlightForADaySortedByTime(flights, "MONDAY");
        System.out.println();
        showFlightForDestination(flights, "Moscow");

    }
}
