package theValiableThings;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Thing> allThings = new ArrayList<>();
		
		allThings.add(new Bike("Chien",1,false,true));
		allThings.add(new Bike("Klook",2,true,false));
		
		allThings.add(new RiceCooker("Baltra",4,1));
		allThings.add(new RiceCooker("Havell",200,1));
		
		allThings.add(new ItTeacher("Channak",3,true));
		allThings.add(new ItTeacher("Rith",1,false));
		
		for (int i = 0; i < allThings.size(); i++) {
			System.out.println(allThings.get(i));
		}
		
	}

}
