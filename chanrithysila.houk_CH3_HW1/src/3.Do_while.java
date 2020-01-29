
public class Do_while {
	public static void main(String[] args) {
		 //3. Using do while loop to calculate the average of all odd number from 1 to 50.
		  int b=1;
		  int sums=0;  
		  int nums = 50;    
		 do {
			  if(b %2 != 0) {
		      sums = sums+b; 
			  }
			  b++;
		  }  while( b <= nums);
		  System.out.println("Sum of even number: " + sums/nums);   
	}
}
