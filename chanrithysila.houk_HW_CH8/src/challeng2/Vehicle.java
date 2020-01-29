package challeng2;

public abstract class Vehicle {
	String plateID;
	float weight;
	public Vehicle(String plateID, float weight) {
		this.plateID = plateID;
		this.weight = weight;
	}
	public abstract int getMaximalSpeed();
	public String toString() {
		return " [plate id=" + plateID + ", weight=" + weight + "]";
	}
}
