import Exception.BadParameterException;
import Exception.NullParameterException;

public class FlightFactory {
    private FlightFactory() {
    }

    public static Flight createFlight(String type, Airline airline, Airport origin, Airport destination) throws NullParameterException {
        if (type.equals("commercialFlight")) {
            try {
                return new CommercialFlight(airline, origin, destination);
            } catch(NullParameterException e) {
                return null;
            }
        }
        if (type.equals("passengerFlight")){
            return new PassengerFlight(airline, origin, destination);
        }
        else return null;
    }
}