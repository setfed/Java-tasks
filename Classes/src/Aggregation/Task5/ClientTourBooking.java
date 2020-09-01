package Aggregation.Task5;

import java.util.List;

import static Aggregation.Task5.TourType.EXCURSION;
import static Aggregation.Task5.TourType.VACATION;
import static Aggregation.Task5.TransportType.TRAIN;

public class ClientTourBooking {
    public static void main(String[] args) {
        TourAgency tourAgency = new TourAgency();
        tourAgency.initClients();
        tourAgency.initTours();

        List<Tour> recommended = tourAgency.recommendToursForClient(new TourType[]{VACATION, EXCURSION}, TRAIN, true, 15, 1000);
        TourAgency.sortByCost(recommended);

        for (Tour tour : recommended
        ) {
            System.out.println(tour.toString());
        }
    }
}
