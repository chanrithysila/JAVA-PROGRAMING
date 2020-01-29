import java.util.Scanner;

public class homework {
	public static void main(String[] args) {				  		  		      		  		  		  		 		  		    		    
		  //5. make pagination logic to display entities.
		 	System.out.println("Enter A or a todisplay 10 entities per page");
		    System.out.println("Enter B or b todisplay 20 entities per page");
		    System.out.println("Enter C or c todisplay 50 entities per page");
		    System.out.println("Enter D or d todisplay 100 entities per page");
		    System.out.println("Enter E or e todisplay 200 entities per page");
		    System.out.println("-----------------------------------");
		    
		    String get;
		    Scanner entities = new Scanner(System.in);
		    System.out.println("Enter:");
		    get = entities.nextLine();
			int number = 0;
		    switch (get) {
		        case "A":
		        case "a":
					number = 10;
		            System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:10");
		            break;
		        case "B":
		        case "b":
					number = 20;
		        	System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:20");
		            break;
		        case "C":
		        case "c":
					number = 50;
		        	System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:50");
		            break;
		        case "D":
		        case "d":
					number = 100;
		        	System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:100");
		            break;
		        case "E":
		        case "e":
					number = 200;
		        	System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:200");	
		            break;
		        default:
		        	System.out.println("Entities:150");
		            System.out.println("Entities To Dispaly Per page:5");		            
		            break;
		    }
		    entities.close();
		    System.out.println("===================================");
		    
		    int[] arr = {10,20,50,100,200};
			for(int x = 0 ; x < arr.length;x++) {
				System.out.print("|" + "Pag:" + arr[x]);
			}
			System.out.println("|");
	}

}
