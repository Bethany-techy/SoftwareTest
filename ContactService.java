import java.util.HashMap;

public class ContactService {
	private HashMap<String, Contact> contactMap;
	
	ContactService() {
		contactMap = new HashMap<String, Contact>();
	}
	
	public void addContact(String id) throws IllegalArgumentException {
		if (contactMap.get(id) != null) {
			throw new IllegalArgumentException("Contact ID" + id + " already exists");
		}
		
		Contact c = new Contact(id);
		contactMap.put(id, c);
	}
	
	public boolean deleteContact(String id) {
		if (contactMap.remove(id) != null) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateContact(String id, String firstName, String lastName, String number, String address) throws IllegalArgumentException {
		Contact c = contactMap.get(id);
		if (c == null) {
			return false;
		}
		c.setFirstName(firstName);
		c.setLastName(lastName);
		c.setPhoneNumber(number);
		c.setAddress(address);
		return true;
	}
}
