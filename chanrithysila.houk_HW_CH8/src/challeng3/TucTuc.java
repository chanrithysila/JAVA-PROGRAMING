package challeng3;

public class TucTuc extends Vehicle {
	int nbCustomers;
	public TucTuc(String plateID, float weight,int nbCustomers) {
		super(plateID, weight);
		this.nbCustomers = nbCustomers;
	}
	public int getMaximalSpeed() {
		int maxSpeed = 130;
		if(nbCustomers!=maxSpeed) {
			maxSpeed = maxSpeed-5*nbCustomers;
		}
		return maxSpeed;
	}
	public String toString() {
		return "TucTuc" + super.toString();
	}
}

