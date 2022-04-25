package JavaProgram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int sum=0;
		int firstNum=0;
		int SecNum=1;
		for (int i = 1; i < 8; i++) {
			
			System.out.print(firstNum);
			System.out.print(SecNum);
			sum=firstNum+SecNum;
			
			firstNum=SecNum;
			SecNum=sum;
			System.out.print(sum);
		}

	}

}
