package javarails;

import java.util.ArrayList;

public class Train {
    public Wagon getWagon(){
        return wagon;
    }
    private Wagon wagon;
    private ArrayList<Route> routes;

    public Train() {
        wagon = new Wagon();
        routes = new ArrayList<>();
    }

    public void addRoute(Route route) {
        routes.add(route);
    }
}
