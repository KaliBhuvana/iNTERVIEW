package JavaBasicProgram;

public class ArmstrongNumber {
	
	//Armstrong number means the sum of the cube of the individual given number is equal to the given number


	public static void main(String[] args) {
		int n=153, sum=0, r,org;
		
		org=n;
		while(n>0) {
			
			r=n%10;
			n=n/10;
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
