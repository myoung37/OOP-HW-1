import java.util.Date;
import java.util.Objects;
import java.util.UUID;

public class CommercialFlight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;

    public CommercialFlight(Airline airline, Airport origin, Airport destination, String flightNum, Date departureTime) {
    setAirline(airline);
    setOrigine(origine);
    setDestination(destination);
    setFlightNumber();
    setDepartureTime();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommercialFlight flight = (CommercialFlight) o;
        return airline.equals(flight.airline) && origine.equals(flight.origine) && destination.equals(flight.destination) && Objects.equals(flightNumber, flight.flightNumber) && Objects.equals(departureTime, flight.departureTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airline, origine, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + airline +
                ", origine=" + origine +
                ", destination=" + destination +
                ", flightNumber='" + flightNumber + '\'' +
                ", departureTime=" + departureTime +
                '}';
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber.toString();
    }

    private void setFlightNumber() {
        this.flightNumber = UUID.randomUUID();
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    private void setDepartureTime() {
        this.departureTime = new Date(2022, 04, 22, 22, 30);
    }

    public Airport getOrigine() {
        return origine;
    }

    public void setOrigine(Airport origine) {
        this.origine = origine;
    }
}
