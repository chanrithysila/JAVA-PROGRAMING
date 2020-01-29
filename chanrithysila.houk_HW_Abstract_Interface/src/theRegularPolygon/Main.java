package theRegularPolygon;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		EquilateralTriangle regularPolygon = new EquilateralTriangle(3);
		Square square = new Square(4);
		
		List<RegularPolygon> sideLenght = new ArrayList<>();
		sideLenght.add(regularPolygon);
		sideLenght.add(square);
		System.out.println("The sum of regularPolygon is " + RegularPolygon.getTotalSides(sideLenght));
	}

}
