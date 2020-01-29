package chanrithysila.houk_CH4_HW1;



public class homework1 {
	public static void main(String[] args) {
		String[] employee = {"Doung","Chan","Minea","Mesa","Romdoul","Veha","Por","Kanika"};
		int[] salary = {560,560,500,500,190,190,560,700};
		
		//1
		int max = salary[0];
		for(int i = 0; i < salary.length; i++) {
			if(max < salary[i]) {
				max = salary[i];
			}
		}
		System.out.println("1. Employee who has highest salary:");
		for(int j = 0; j < employee.length; j++) {
			if(max == salary[j]) {
				System.out.println(employee[j] + " has the highest salary of $" + max);
				
			}
		}
		System.out.println("........................................");
		
		
		//2
		int min = salary[0];
		for(int a = 0; a < salary.length; a++) {
			if(min > salary[a]) {
				min = salary[a];
			}
		}
		System.out.println("2. Employee who has lowest salary:");
		for(int b=0;b<employee.length;b++) {
			if(min == salary[b]) {
				System.out.println(employee[b] + " has the lowest salary of $" + min);
			}
		}
		System.out.println("........................................");		
		
		
		//3
		double sum = 0;
		for(int a = 0; a < salary.length; a++) {
			sum += salary[a];	
		}
		System.out.println("3. Employee who has lower salary than average: " + sum/salary.length);
		for(int b=0;b<employee.length;b++) {
			if(min == salary[b]) {
				System.out.println(employee[b] + ": " + min + "$");
			}
		}
		System.out.println("........................................");
		
		
		//4
		System.out.println("4. Employee who has higher salary than average: " + sum/salary.length);
		for(int j = 0; j < salary.length; j++) {
			if(salary[j] > sum/salary.length) {
				System.out.println(employee[j] + ": " +  salary[j] + "$");
			}
		}
		System.out.println("........................................");
	
		//5
		String s = "";
		System.out.println("5.Employee who has same salary:");		
        for(int j= 0; j < salary.length; j++) {
            for(int k = 1; k < salary.length-1; k++) {
                    s = Integer.toString(salary[j]);
                    if(salary[j] == salary[k]) {
                    System.out.println(employee[j] + ": " + s + "$");                    
                    break;
                }
            }
        
        }	
	}
}
