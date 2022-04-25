package JavaProgram;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
int n=53, sum=0, r,org;
		
		org=n;
		while(n>0) {
			
			r=n%10;
			n=n/10;
			System.out.println(n);
			sum=sum+(r*r*r);
			}
		if (org==sum) {
			System.out.println("It is an armstrong number");
			}
		else {
			System.out.println("It is not an armstrong number");
			
		}
	
		

	}

}
