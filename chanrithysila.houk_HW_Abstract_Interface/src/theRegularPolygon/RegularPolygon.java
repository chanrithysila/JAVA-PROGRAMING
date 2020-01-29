package theRegularPolygon;

import java.util.List;

public interface RegularPolygon {
	int getNumSide();
	int getSideLength();
	
	static int getTotalSides(List<RegularPolygon> sideLenght) {
		int sum = 0;
		for (RegularPolygon regularPolygon : sideLenght) {
			sum += regularPolygon.getNumSide();
		}
		return sum;
	}
	
	
	
}
