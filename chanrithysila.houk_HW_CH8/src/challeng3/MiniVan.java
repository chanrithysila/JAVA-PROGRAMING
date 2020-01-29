package challeng3;

public class MiniVan extends Vehicle {
	int nbCustomers;
	public MiniVan(String plateID, float weight,int nbCustomers) {
		super(plateID, weight);
		this.nbCustomers = nbCustomers;
	}

	public int getMaximalSpeed() {
		int maxSpeed = 130;
		if(nbCustomers!=maxSpeed) {
			maxSpeed = maxSpeed-10*nbCustomers;
		}
		return maxSpeed;
	}
	public String toString() {
		return "MiniVan" + super.toString();
	}
}