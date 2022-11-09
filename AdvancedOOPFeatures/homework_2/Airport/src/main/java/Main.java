import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Flight.Type;
import com.skillbox.airport.Terminal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import net.sf.saxon.trans.SymbolicName.F;
import org.checkerframework.checker.units.qual.A;

public class Main {

  public static void main(String[] args) {
    Airport airport = Airport.getInstance();
    findPlanesLeavingInTheNextTwoHours(airport).forEach(System.out::println);
  }

  public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime nowPlusTwo = LocalDateTime.now().plusHours(2);

    List<Flight> PlanesLeavingInTheNextTwoHours = airport.getTerminals().stream()
        .flatMap(t -> t.getFlights().stream())
        .filter(flight -> flight.getType().equals(Type.DEPARTURE))
        .filter(
            flight -> flight.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
                .isAfter(now))
        .filter(
            flight -> flight.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()
                .isBefore(nowPlusTwo)).collect(Collectors.toList());
    return PlanesLeavingInTheNextTwoHours;
  }
}