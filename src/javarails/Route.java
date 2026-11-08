package javarails;

import java.time.LocalDateTime;

public class Route {
    private String departureCity;
    private String destinationCity;
    private LocalDateTime departureDateTime;

    public Route(String departureCity, String destinationCity, LocalDateTime departureDateTime) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDateTime= departureDateTime;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public LocalDateTime getDepartureDateTime() {
        return departureDateTime;
    }
}
