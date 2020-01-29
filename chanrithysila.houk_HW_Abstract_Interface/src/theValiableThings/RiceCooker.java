package theValiableThings;

public class RiceCooker extends Thing{
	private int age;
	private int numberOfUse;
	public RiceCooker(String name, int age, int numberOfUse) {
		super(name);
		this.age = age;
		this.numberOfUse = numberOfUse;
	}
	@Override
	public boolean isValid() {
		if(age < 5 && numberOfUse < 500) {
			return true;
		}else {
			return false;
		}
	}
	@Override
	public String toString() {
		String outPut;
		if(isValid()) {
			outPut = " is Valid Rice Cooker";
		}else {
			outPut = " not Valid Rice Cooker";
		}
		return super.toString() + outPut;
	}
	
}
