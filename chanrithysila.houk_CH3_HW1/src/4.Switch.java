import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		 //4. Using switch to solve the problem as below.
	  	String order;
	    Scanner check = new Scanner(System.in);
	    System.out.println("Enter your order:");
	    order = check.nextLine();
	    switch (order) {
	        case "A":
	        case "a":
	            System.out.println("you order BayChha");
	            break;
	        case "B":
	        case "b":
	            System.out.println("you order Ice Tea");
	            break;
	        case "C":
	        case "c":
	            System.out.println("you order Soup");
	            break;
	        default:
	            System.out.println("Out of order...");
	            break;
	    }
	    check.close();

	}
}
