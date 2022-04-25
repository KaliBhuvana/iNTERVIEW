package JavaProgram;

public class Checknumorpos {

	public static void main(String[] args) {
		int n=10;
		if (n>0) {
			System.out.println("The given number "+n+" is positive");
		} else if(n<0) {
			System.out.println("The given number "+n+" is negative");
		}
		else
			System.out.println("The given number "+n+" is neither positive nor negative");
	}

}
