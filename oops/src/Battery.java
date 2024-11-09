
public class Battery {
	private int capacity;
    private boolean isCharging;

    public Battery(int capacity) {
        this.capacity = capacity;
        this.isCharging = false;
    }

    public void startCharging() {
        isCharging = true;
        System.out.println("Battery charging started.");
    }

    public void stopCharging() {
        isCharging = false;
        System.out.println("Battery charging stopped.");
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isCharging() {
        return isCharging;
    }

	

}
