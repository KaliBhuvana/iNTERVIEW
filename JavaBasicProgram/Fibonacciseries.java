package JavaBasicProgram;

public class Fibonacciseries {

	public static void main(String[] args) {
		int n1=0, n2=1,number=10, n3;
		
		System.out.println(n1);
		System.out.println(n2);
		for(int i=3; i<=number; i++) {
			n3=n1+n2;
			System.out.println(n3);
			
			n1=n2;		
			n2=n3;		
			
			
			
		}
		

		

	}

}
