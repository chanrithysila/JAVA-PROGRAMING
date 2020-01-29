package challeng3;

import java.util.ArrayList;
import java.util.List;

public class VehicleConvoy extends Main {
	List<Vehicle> convoy = new ArrayList<Vehicle>();
	
	public void addVehicle(Vehicle vehicle) {
		convoy.add(vehicle);//add object to arraylist
	}
//	@SuppressWarnings("unchecked")//use to disable warning
	public int getMaximalSpeed() {
		int lowest = convoy.get(0).getMaximalSpeed();
		for(int i = 0; i < convoy.size(); i++) {
			if(convoy.get(i).getMaximalSpeed() < lowest) {
				lowest = convoy.get(i).getMaximalSpeed();
			}
		}
		
		return lowest;
	}

}
