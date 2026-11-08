package javarails;

public class Booking {
    private Passenger passenger;
    private Route route;
    private Seat seat;

    public Booking(Passenger passenger, Route route, Seat seat) {
        this.passenger = passenger;
        this.route = route;
        this.seat = seat;
    }
}
