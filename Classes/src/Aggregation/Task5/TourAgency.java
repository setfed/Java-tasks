package Aggregation.Task5;

import java.util.*;
import java.util.stream.Collectors;

public class TourAgency {
    private Set<Client> clients = new HashSet<>();
    private Set<Tour> tours = new HashSet<>();

    public static void sortByCost(List<Tour> recommendedTours) {
        recommendedTours.sort(Comparator.comparingInt(Tour::getCost));
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Tour> getTours() {
        return tours;
    }

    public void setTours(Set<Tour> tours) {
        this.tours = tours;
    }

    public void initClients() {
        clients.add(new Client("Tom", 20, "80536573423"));
        clients.add(new Client("Nik", 35, "80438795644"));
        clients.add(new Client("Ann", 27, "67867678764"));
        clients.add(new Client("Jon", 24, "78945365454"));
        clients.add(new Client("Mary", 25, "6767676761"));
    }

    public void initTours() {
        tours.add(new Tour(TourType.VACATION, TransportType.TRAIN, true, 5, 50));
        tours.add(new Tour(TourType.VACATION, TransportType.TRAIN, true, 6, 30));
        tours.add(new Tour(TourType.EXCURSION, TransportType.TRAIN, true, 10, 100));
        tours.add(new Tour(TourType.THERAPY, TransportType.AIRCRAFT, true, 15, 300));
        tours.add(new Tour(TourType.SHOPPING, TransportType.CAR, false, 5, 50));
        tours.add(new Tour(TourType.CRUISE, TransportType.WATERCRAFT, true, 14, 500));
    }

    public List<Tour> recommendToursForClient(TourType[] tourWishes, TransportType transportwWish, boolean foodWish, int days, int cost) {
        Set<Tour> filtered = new TreeSet<>();
        List<Tour> recommended = new ArrayList<>();

        for (TourType tourW : tourWishes) {
            for (Tour tour : this.tours) {
                filtered = this.tours.stream()
                        .filter(t -> t.getTourType().equals(tourW))
                        .filter(t -> t.getTransportType().equals(transportwWish))
                        .filter(t -> t.isFood() == foodWish)
                        .filter(t -> t.getNumberOfDays() < days)
                        .filter(t -> t.getCost() < cost)
                        .collect(Collectors.toSet());
            }
            recommended.addAll(filtered);
        }
        return recommended;
    }
}
