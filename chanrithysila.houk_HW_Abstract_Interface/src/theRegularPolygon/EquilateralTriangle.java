package theRegularPolygon;

public class EquilateralTriangle extends GetRidDuplicate {
	
	
	final static int NUM_SIZE = 3;
	
	public EquilateralTriangle(int size) {
		super(size);
		
	}
	
	@Override
	public int getNumSide() {
		return NUM_SIZE;
	}

}
