import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void test() {
		ContactService cs = new ContactService();
		
		//TEST adding some contacts
		assertDoesNotThrow(() -> cs.addContact("1"));
		assertDoesNotThrow(() -> cs.addContact("2"));
		assertDoesNotThrow(() -> cs.addContact("3"));
		
		//TEST adding a contact with a duplicate id and a null id
		assertThrows(IllegalArgumentException.class, () -> cs.addContact("1"));
		assertThrows(IllegalArgumentException.class, () -> cs.addContact(null));
		
		//TEST deleting a contact
		assertTrue(cs.deleteContact("2"));
		assertFalse(cs.deleteContact(null));
		assertFalse(cs.deleteContact("-1"));
		
		//TEST updating a contact
		assertTrue(cs.updateContact("1", "alice", "jones", "7269287253", "135 Charlotte Drive"));
		assertThrows(IllegalArgumentException.class, () -> cs.updateContact("1", null, null, null, null));
		assertFalse(cs.updateContact("-1", null, null, null, null));
	}

}
