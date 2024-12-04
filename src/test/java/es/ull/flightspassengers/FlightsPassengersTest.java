package es.ull.flightspassengers;

import es.ull.flights.Flight;
import es.ull.passengers.Passenger;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightsPassengersTest {
    @DisplayName("Tests de las clases Flight y Passenger")
    @Nested
    class TestsBasicosAeropuerto {

        @Test
        void shouldJoinFlightSuccessfully() {
            Flight flight = new Flight("AA123", 10);
            Passenger passenger = new Passenger("12345", "John Doe", "US");
            passenger.joinFlight(flight);
            assertEquals(flight, passenger.getFlight());
            assertEquals(1, flight.getNumberOfPassengers());
        }

        @Test
        void shouldSwitchFlightsSuccessfully() {
            Flight flight1 = new Flight("AA123", 10);
            Flight flight2 = new Flight("BB234", 10);
            Passenger passenger = new Passenger("12345", "John Doe", "US");

            passenger.joinFlight(flight1);
            passenger.joinFlight(flight2);

            assertEquals(flight2, passenger.getFlight());
            assertEquals(0, flight1.getNumberOfPassengers());
            assertEquals(1, flight2.getNumberOfPassengers());
        }

        @Test
        void shouldThrowExceptionWhenCannotAddToNewFlight() {
            Flight fullFlight = new Flight("AA123", 0);
            Passenger passenger = new Passenger("12345", "John Doe", "US");

            assertThrows(RuntimeException.class, () -> passenger.joinFlight(fullFlight));
        }
    }
}
