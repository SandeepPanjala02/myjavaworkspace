
public class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	public void displayAddress() {
		System.out.println("City: "+city);
		System.out.println("State: "+state);
		System.out.println("Country: "+country);
    
   }
}
