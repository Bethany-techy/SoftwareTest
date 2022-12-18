import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void test() {
		// TEST constructor
		assertDoesNotThrow(() -> { Contact c = new Contact("123"); });
		assertThrows(IllegalArgumentException.class, () -> { Contact c = new Contact(null); });
		assertThrows(IllegalArgumentException.class, () -> { Contact c = new Contact("12345678999"); });
		
		// TEST member functions
		Contact c = new Contact("1");
		assertEquals("1", c.getContactID());
		
		assertDoesNotThrow(() -> c.setFirstName("bill"));
		assertEquals("bill", c.getFirstName());
		assertThrows(IllegalArgumentException.class, () -> c.setFirstName(null));
		assertThrows(IllegalArgumentException.class, () -> c.setFirstName("setanamethatisjusttoolong"));
		
		assertDoesNotThrow(() -> c.setLastName("smith"));
		assertEquals("smith", c.getLastName());
		assertThrows(IllegalArgumentException.class, () -> c.setLastName(null));
		assertThrows(IllegalArgumentException.class, () -> c.setLastName("setanamethatisjusttoolong"));
		
		assertDoesNotThrow(() -> c.setPhoneNumber("2122773933"));
		assertEquals("2122773933", c.getPhoneNumber());
		assertThrows(IllegalArgumentException.class, () -> c.setPhoneNumber(null));
		assertThrows(IllegalArgumentException.class, () -> c.setPhoneNumber("123"));
		
		assertDoesNotThrow(() -> c.setAddress("123 Main Street"));
		assertEquals("123 Main Street", c.getAddress());
		assertThrows(IllegalArgumentException.class, () -> c.setAddress(null));
		assertThrows(IllegalArgumentException.class, () -> c.setAddress("Set an address that is too long to test"));
	}

}
