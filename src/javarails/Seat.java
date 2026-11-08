package javarails;

public class Seat {
    private int seatNumber;
    private Passenger passenger;

    public Seat(int seatNumber){
       this.seatNumber = seatNumber;
       passenger = null;
    }

    public boolean isAvailable() {
        return passenger == null;
    }
    public void book(Passenger passenger) {
        if(isAvailable()) {
            this.passenger = passenger;
        }
    }
}
