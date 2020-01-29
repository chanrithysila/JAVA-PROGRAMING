package challeng1;

public class TucTuc {
	public String plateID;
	public float weight;
	public int nbCustomers;

	public TucTuc(String plateID, float weight, int nbCustomers) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}
	public int getMaximalSpeed() {
		int maxSpeed = 130;
		if(nbCustomers != maxSpeed) {
			maxSpeed = maxSpeed-5*nbCustomers;
		}
		return maxSpeed;
	}
	public String toString() {
		return "TucTuc [plate id=" + plateID + ", weight=" + weight + "]";
	}
}
