import java.security.PrivateKey;
import java.util.Date;
import java.util.Objects;

public class Flight {
    private Airline airline;
    private Airport origine;
    private Airport destination;
    private String flightNumber;
    private Date departureTime;

    public Flight(Airline airline, Airport origin, Airport destination, String flightNum, Date departureTime) {
    setAirline(airline);
    setOrigine(origin);
    setDestination(destination);
    setFlightNumber(flightNum);
    setDepartureTime(departureTime);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
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
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Airport getOrigine() {
        return origine;
    }

    public void setOrigine(Airport origine) {
        this.origine = origine;
    }
}
