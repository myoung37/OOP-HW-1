import org.w3c.dom.ls.LSOutput;

public class TravelManager {
    public static void main(String[] args) {
        Airport airport = new Airport("ORD");
        Airline airline = new Airline("United");
        Flight testFlight = new Flight("United", "ORD","MCO","2319","0600");
    }
}
