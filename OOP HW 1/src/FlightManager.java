import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

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
    flights =  new ArrayList();
    }

    public UUID createFlight(String type, Airline airline, Airport origin, Airport destination){
    return null;
    }

    public Flight getFlightByNumber(UUID flightNumber){
    return null;
}
}
