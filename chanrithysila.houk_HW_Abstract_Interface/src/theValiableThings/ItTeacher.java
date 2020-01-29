package theValiableThings;

public class ItTeacher extends Thing{
	private int yearsOfExperience;
	private boolean isBackBreakWorking;
	
	public ItTeacher(String name, int yearsOfExperience, boolean isBackBreakWorking) {
		super(name);
		this.isBackBreakWorking = isBackBreakWorking;
		this.yearsOfExperience = yearsOfExperience;
	}

	@Override
	public boolean isValid() {
		if(yearsOfExperience > 2 && isBackBreakWorking) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		String outPut;
		if(isValid()) {
			outPut = " is Valid IT Teacher";
		}else {
			outPut = " not Valid IT Teacher";
		}
		return super.toString() + outPut;
	}
	
	 
}
