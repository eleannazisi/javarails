package javarails;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;

public class JavaRails {
    private ArrayList<Train> trains;
    private Train train;

    public JavaRails(){
        trains = new ArrayList<>();
        train = new Train();
        Route route = new Route("Athens", "Thiva", LocalDateTime.of(2026, 11, 10, 9, 0));

        train.addRoute(route);
        trains.add(train);

    }


    public void runApp(){
        Scanner input = new Scanner(System.in);
            System.out.println("Welcome");
            System.out.println("1. Book");

            int choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter your name: ");
                String name = input.next();

                Passenger passenger = new Passenger(name);

                train.getWagon().bookSeat(1, passenger);



        }
    }

   public static void main(String[] args) {
        JavaRails javarails = new JavaRails();
        javarails.runApp();
    }
}
