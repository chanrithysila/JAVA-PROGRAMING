package challeng3;

public class BatMobile extends Vehicle {
	boolean isBatmanHere;
	public BatMobile(String plateID, float weight, boolean isBatmanHere) {
		super(plateID, weight);
		this.isBatmanHere = isBatmanHere;
	}
	
	public int getMaximalSpeed() {
		int speed;
		if(isBatmanHere) {
			speed = 500;
		}else {
			speed = 110;
		}
		return speed;
	}
	public String toString() {
		return "BatMobile" + super.toString();
	}
}
