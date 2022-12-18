
public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public Contact(String contactID) {
		if (contactID == null || contactID.length() > 10) {
			throw new IllegalArgumentException ("ContactID '" + contactID + "' is invalid");
		}	
		
		this.contactID = contactID;
		this.firstName = "";
		this.lastName = "";
		this.number = "1234567890";
		this.address = "";
	}
	
	public String getContactID() { return contactID; }
	
	public String getFirstName() { return firstName; }
	public void setFirstName(String fn) {
		if (fn == null || fn.length() > 10) {
			throw new IllegalArgumentException("First Name '" + fn + "' is invalid");
		}
		firstName = fn;
	}
	
	public String getLastName() { return lastName; }
	public void setLastName(String ln) {
		if (ln == null || ln.length() > 10) {
			throw new IllegalArgumentException("Last Name '" + ln + "' is invalid");
		}
		lastName = ln;
	}
	
	public String getPhoneNumber() { return number; }
	public void setPhoneNumber(String pn) {
		if (pn == null || pn.length() != 10) {
			throw new IllegalArgumentException("Phone Number must be exactly 10 digits");
		}
		number = pn;
	}
	
	public String getAddress() { return address; }
	public void setAddress(String addr) {
		if (addr == null || addr.length() > 30) {
			throw new IllegalArgumentException("Address '" + addr + "' is invalid");
		}
		address = addr;
	}
}
