package theValiableThings;

public class Bike extends Thing{
	private int age;
	private boolean isFrontBreakWorking;
	private boolean isBackBreakWorking;
	
	public Bike(String name, int age, boolean isFrontBreakWorking, boolean isBackBreakWorking) {
		super(name);
		this.age = age;
		this.isFrontBreakWorking = isFrontBreakWorking;
		this.isFrontBreakWorking = isBackBreakWorking;
		
	}

	@Override
	public boolean isValid() {
		if(age < 2 && (isFrontBreakWorking || isBackBreakWorking)) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		String outPut;
		if(isValid()) {
			outPut = " is valid Bike";
		}else {
			outPut = " not valid Bike";
		}
		return super.toString() + outPut;
	}
	
}
