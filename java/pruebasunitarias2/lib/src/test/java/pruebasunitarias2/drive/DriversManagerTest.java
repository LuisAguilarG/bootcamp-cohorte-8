package pruebasunitarias2.drive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class DriversManagerTest {

	// Creamos e inicializamos un objeto de tipo "DriversManager"
	private DriversManager driversManager = new DriversManager();
	
	@Test
	void isAddPassenger() {
		// Creamos e inicializamos un objeto de tipo "Passenger"
		Passenger passenger1 = new Passenger("Carlos Eduardo", "ABC123");
		// Añadimos el "passenger1" a una lista del "DriversManager"
		driversManager.addPassenger(passenger1);
		// Si al "driversManager" le damos por parámetro un ID y el método nos devuelve un objeto de tipo "Passenger" que coincida.
		assertEquals(passenger1, driversManager.getPassenger("ABC123"));
	}
	
	@Test
	void isAddDriver() {
		Driver driver1 = new Driver("Luis", "2465DD", 50);
		driversManager.addDriver(driver1);
		// Esperamos un objeto "driver1" del método getDriver del manager cuando le damos como parámetro un id.
		assertEquals(driver1, driversManager.getDriver("2465DD"));
		}
}
