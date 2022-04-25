package JavaProgram;

public class ChangeOddIndextoUpper {

	public static void main(String[] args) {
		
		
		String s="changeme";
		
		char[] charArr = s.toCharArray();
	for (int i = 0; i < charArr.length; i++) {
		
		char upper=charArr[i];
		
		if ((i%2)==0) {
			System.out.print(upper);
		} else {
			upper = Character.toUpperCase(upper);
			System.out.print(upper);
			
		}
		
	}	

	}

}
