package es.ull.flights;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {
    @DisplayName("Tests de la clase ")
    @Nested
    class EconomyFlightTest {

        private Flight vueloUno;
        private Flight vueloDos;
        private Flight vueloTres;

        @BeforeEach
        void setUp() {
            vueloUno = new Flight("TF3471", 64);
            vueloDos = new Flight("LP232", 90);
            vueloTres= new Flight("BC7529", 108);
        }

        @Test
        void testConstructorIdentificadorVuelo() {
            // Identificador de vuelo
            assertEquals("TF3471", vueloUno.getFlightNumber());
            assertEquals("LP232", vueloDos.getFlightNumber());
            assertEquals("BC7529", vueloTres.getFlightNumber());
        }

        @Test
        void testConstructorIdentificadorAsientos() {
            // Identificador del número de asientos de cada vuelo
            assertEquals(0, vueloUno.getNumberOfPassengers());
            assertEquals(0, vueloDos.getNumberOfPassengers());
            assertEquals(0, vueloTres.getNumberOfPassengers());
        }

        @Test
        void shouldThrowExceptionWhenFlightNumberIsInvalid() {
            assertThrows(RuntimeException.class, () -> new Flight("INVALID123", 100));
        }
    }
}
