import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public final class FlightManager {
    private static List<Flight> flights;

    private static FlightManager ourInstance;

public static FlightManager getInstance() throws Exception{
        if (ourInstance==null){
            ourInstance=new FlightManager();
    }
        return ourInstance;
}
    private FlightManager(){
    flights =  new ArrayList<Flight>();
    }

    public String createFlight(String type, Airline airline, Airport origin, Airport destination){
    Flight flight = FlightFactory.createFlight(type,airline,origin,destination);
    flights.add(flight);
    return flight.getFlightNumber();
    }

    public Optional<Flight> getFlightByFlightNumber(String flightNumber) {
        return flights.stream()
                .filter(flt -> flt.getFlightNumber().equals(flightNumber))
                .findFirst();
    }
}
