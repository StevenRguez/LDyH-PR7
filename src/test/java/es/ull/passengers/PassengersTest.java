package es.ull.passengers;

import es.ull.passengers.Passenger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengersTest {
    @DisplayName("Tests de la clase Passenger")
    @Nested
    class TestsBasicosClasePassenger {
        private Passenger pasajeroUno;
        private Passenger pasajeroDos;
        private Passenger pasajeroTres;

        @BeforeEach
        void setUp() {
            pasajeroUno = new Passenger("SRM", "Steven Rodríguez Morales", "ES");
            pasajeroDos = new Passenger("LMM", "Lola Mento Máximo", "US");
            pasajeroTres= new Passenger("ECS", "Esteban Co Santander", "FR");
        }

        @Test
        void testConstructorIdentificador() {
            assertEquals("SRM", pasajeroUno.getIdentifier());
            assertEquals("LMM", pasajeroDos.getIdentifier());
            assertEquals("ECS", pasajeroTres.getIdentifier());
        }
    }
}
