import java.util.Date;
import java.util.Objects;
import java.util.UUID;

import Exception.NullParameterException;

public class PassengerFlight implements Flight{
    private Airline airline;
    private Airport origin;
    private Airport destination;
    private UUID flightNumber;
    private Date departureTime;
    private Integer capacity;

    public PassengerFlight(Airline airline, Airport origin, Airport destination) throws NullParameterException {
        setAirline(airline);
        setOrigin(origin);
        setDestination(destination);
        setFlightNumber();
        setDepartureTime();
        setCapacity();
    }



    @Override
    public int hashCode() {
        return Objects.hash(airline, origin, destination, flightNumber, departureTime);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airline=" + getAirline() +
                ", origin=" + getOrigin() +
                ", destination=" + getDestination() +
                ", flightNumber='" + getFlightNumber() + '\'' +
                ", departureTime=" + getDepartureTime() +
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

    public Integer setCapacity() {
        return this.capacity;
    }

    public Integer getCapacity() {
        return capacity;
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

    public Airport getOrigin() {
        return origin;
    }

    private void setOrigin(Airport origin) throws NullParameterException {
        if(origin.equals(null)){
            throw new NullParameterException("origin cannot be null");
        }
        this.origin = origin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PassengerFlight that = (PassengerFlight) o;
        return Objects.equals(airline, that.airline) && Objects.equals(origin, that.origin) && Objects.equals(destination, that.destination) && Objects.equals(flightNumber, that.flightNumber) && Objects.equals(departureTime, that.departureTime);
    }
}
