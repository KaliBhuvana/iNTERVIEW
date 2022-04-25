package JavaProgram;

public class FindIntersection {

	public static void main(String[] args) {
		int[] arr = {0,1,2,3,4,5,6,7,8,9};
	     int[] arr1 = {1,3,5,7,9};
	     
	     for (int i = 0; i < arr.length; i++) {
	    	 for (int j = 0; j < arr1.length; j++) {
				if (arr[i]==arr1[j]) {
					System.out.println(arr[i]);
					
				}
			}
			
		}

	}

}
