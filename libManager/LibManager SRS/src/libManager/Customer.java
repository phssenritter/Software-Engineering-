package libManager;


import java.util.List;

public class Customer {
	private long id;
	private String name;
	private String firstName;
	private String address;
	private String zipCode;
	private String city;
	
	
	public Customer(final long id, final String name, final String firstName, final String address, 
			final String zipCode, final String city) {
		if(id <= 0 || name == null || firstName == null 
				|| address == null || zipCode == null || city == null) {
			throw new IllegalArgumentException("parameters must not be null and id must not be negative or zero");
		}
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
	}
	
	private boolean feesPayed() {
		return true;
	}
	
	private List<BookCopy> bookCopies() {
		//TODO
		return null;
	}
	
	public final long getId() {
		return id;
	}

	public final void setId(long id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getFirstName() {
		return firstName;
	}

	public final void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public final String getAddress() {
		return address;
	}

	public final void setAddress(String address) {
		this.address = address;
	}

	public final String getZipCode() {
		return zipCode;
	}

	public final void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public final String getCity() {
		return city;
	}

	public final void setCity(String city) {
		this.city = city;
	}
	
	public List<Customer> getCustomers() {
		//TODO
		return null;
	}
}
