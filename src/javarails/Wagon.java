package javarails;

import java.util.ArrayList;

public class Wagon {
    private ArrayList<Seat> seats;
    public Wagon() {
        seats = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            seats.add(new Seat(i));
        }
    }

    public void bookSeat(int seatNumber, Passenger passenger) {
        Seat seat = seats.get(seatNumber - 1);

        if (seat.isAvailable()) {
            seat.book(passenger);
            System.out.println("javarails.Booking succesful");
        } else {
            System.out.println("javarails.Seat is booked");
        }
    }
}
