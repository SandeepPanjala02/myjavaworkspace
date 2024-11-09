
public class MobileDemo {

	public static void main(String[] args) {
		 Battery battery = new Battery(3000);
	        Mobile phone = new Mobile("Apple", "iPhone 15", battery);

	        phone.displayInfo();
	        phone.chargeBattery();
	        phone.displayInfo();
	        phone.stopCharging();
	        
		

	}

}
