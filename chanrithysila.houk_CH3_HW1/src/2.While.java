
public class While {
	public static void main(String[] args) {
		//2. Using while loop to calculate the sum of all even number from 1 to 50.
		  int a=1;
		  int sum=0;  
		  int num = 50;    
		  while( a <= num){
			  if(a %2 == 0) {
		      sum = sum+a; 
			  }
			  a++;
		  }
		  System.out.println("Sum of even number: " + sum);
	}
}
