
public class Mobile {
	private String brand;
    private String model;
    private Battery battery;

    public Mobile(String brand, String model, Battery battery) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
    }

    public void chargeBattery() {
        battery.startCharging();
    }

    public void stopCharging() {
        battery.stopCharging();
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Battery Capacity: " + battery.getCapacity());
        System.out.println("Battery Charging: " + battery.isCharging());
    }

	

}
