package challeng1;

public class BatMobile {
	public String plateID;
	public float weight;
	public boolean isBatmanHere;
	public int speed;

	public BatMobile(String plateID, float weight, boolean isBatmanHere) {
		this.plateID = plateID;
		this.weight = weight;
		this.isBatmanHere = isBatmanHere;
	}
	public int getMaximalSpeed() {
		if(isBatmanHere) {
			speed = 500;
		}else {
			speed = 110;
		}
		return speed;
	}
	public String toString() {
		return "BatMobile [plate id=" + plateID + ", weight=" + weight + "]";
	}
}
