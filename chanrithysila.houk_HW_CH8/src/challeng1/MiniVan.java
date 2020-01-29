package challeng1;

public class MiniVan {
	public String plateID;
	public float weight;
	public int nbCustomers;

	public MiniVan(String plateID, float weight, int nbCustomers) {
		this.plateID = plateID;
		this.weight = weight;
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
		return "MiniVan [plate id=" + plateID + ", weight=" + weight + "]";
	}
}
