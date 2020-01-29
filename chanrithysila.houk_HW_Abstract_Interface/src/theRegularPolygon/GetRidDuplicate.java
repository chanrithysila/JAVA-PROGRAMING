package theRegularPolygon;

public abstract class GetRidDuplicate implements RegularPolygon{

	int size;
	
	public GetRidDuplicate(int size) {
		
		this.size = size;
	}
	@Override
	public int getSideLength() {
		return size;
	}

}
