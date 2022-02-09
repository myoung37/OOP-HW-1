import java.util.Objects;
import Exception.BadParameterException;
import Exception.NullParameterException;

public class Airline {
    private String name;

    public Airline(String name) throws NullParameterException, BadParameterException {
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;
        return Objects.equals(name, airline.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Airline{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    private void setName(String name) throws BadParameterException, NullParameterException {
       if(name == null){
           throw new NullParameterException("Airline name cannot be null");
       }
       if (name.length() > 8){
           throw new BadParameterException("Invalid Name");
       }
        this.name = name;
    }

}
