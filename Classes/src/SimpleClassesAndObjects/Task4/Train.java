package SimpleClassesAndObjects.Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Train {
    private String destination;
    private int trainNum;
    private String departureTime;

    public Train(String destination, int trainNum, String departureTime) {
        this.destination = destination;
        this.trainNum = trainNum;
        this.departureTime = departureTime;
    }

    public Train() {
    }

    public static void sortByTrainNum(ArrayList<Train> trains) {
        trains.sort(Comparator.comparingInt(train -> train.trainNum));

        for (Train train : trains
        ) {
            System.out.println(train.trainNum + " " + train.destination + " " + train.departureTime);
        }

    }

    public static void showTrainInfo(ArrayList<Train> trains, int trainNum) {
        boolean check = false;
        while (!check) {
            for (Train train : trains
            ) {
                if (train.trainNum == trainNum) {
                    System.out.printf("Поезд №%d отправляетя в %s в %s", train.trainNum, train.departureTime, train.destination);
                    check = true;
                }
            }

            if (!check) {
                System.out.println("Нет поезда с номером " + trainNum);
                check = true;
            }
        }
    }

    public static void sortByDestinationAndDepartureTime(ArrayList<Train> trains) {
        trains.sort((p1, p2) -> {
            if (p1.destination.compareTo(p2.destination) == 0) {
                return p1.departureTime.compareTo(p2.departureTime);
            } else {
                return p1.destination.compareTo(p2.destination);
            }
        });

        for (Train train : trains
        ) {
            System.out.println(train.trainNum + " " + train.departureTime + " " + train.destination);
        }
    }


    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите желаемый выбор:\n" +
                "1. Сортировка и вывод информации о поездах по их номерам\n" +
                "2. Вывод информации о выбранном поезде\n" +
                "3. Сортировка и вывод информации о поездах по пункту назначения\n");

        Train train1 = new Train("Москва", 23, "16:24");
        Train train2 = new Train("Москва", 25, "16:14");
        Train train3 = new Train("Нью-Йорк", 1, "3:50");
        Train train4 = new Train("Нью-Йорк", 6, "4:50");
        Train train5 = new Train("Нью-Йорк", 9, "1:50");

        ArrayList<Train> trains = new ArrayList<>();

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);

        choice = sc.nextInt();
        switch (choice) {
            case 1:
                sortByTrainNum(trains);
                break;
            case 2:
                System.out.println("Введите желаемый номер поезда");
                int train = sc.nextInt();
                showTrainInfo(trains, train);
                break;
            case 3:
                sortByDestinationAndDepartureTime(trains);
                break;
        }
        sc.close();
    }
}
