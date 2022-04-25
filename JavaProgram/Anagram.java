package JavaProgram;

import java.util.Arrays;

public class Anagram {


public static void main(String[] args) {
	String s1="pot";
	String s2="top";
	
	char[] s1a = s1.toCharArray();

	char[] s2a = s2.toCharArray();	
	
	Arrays.sort(s1a);
	Arrays.sort(s2a);
	String s1b = String.valueOf(s1a);
	String s2b = String.valueOf(s2a);
	System.out.println("Given String:" +s1+ "&" +s2);
	
	System.out.println("Sorted String:" +s1b+ "&" +s2b);
	

	if (s1b.equals(s2b)) 
		
		System.out.println("this string is an Anagram");

		else
			System.out.println("this string is not an Anagram");
		
	}

}

