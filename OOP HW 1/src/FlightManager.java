import java.util.List;

public class FlightManager {
    List<Flight> flights = new List<Flight>();

    static private FlightManager instance;
    private FlightManager(){

    }
public static FlightManager getInstance(){
        if instance==null{
            instance=new FlightManager();
    }
        return instance;
}
    private void createFlight(){

    }






private Flight getFlightByNumber(flightNumber){

}
}