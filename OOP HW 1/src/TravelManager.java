import Exception.BadParameterException;
import Exception.NullParameterException;

public class TravelManager {
public static void main(String[] args){
    try{
        Airline airline = new Airline("United");
        Airport origin = new Airport("ORD");
        Airport destination = new Airport("SFO");

        CommercialFlight flight = new CommercialFlight(airline, origin, destination);
        System.out.println(flight);
    } catch (NullParameterException ex) {
        ex.printStackTrace();
    } catch (BadParameterException ex) {
        ex.printStackTrace();
    }
}

}
