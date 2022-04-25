package JavaProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RemoveWhiteSpaceandREverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
String str="Hope is the only thing";
		
String str1 = str.replaceAll("\\s", "");

System.out.println(str1);

char[] ch=str1.toCharArray();
String Lowercase = str.toLowerCase();
System.out.println(Lowercase);
for (int i = ch.length-1; i>=0; --i) 
{
	System.out.print(ch[i]);
}
for (int j = 0; j < ch.length; j++) 
	if (j%2!=0) {
		System.out.print(ch[j]);
		
	}
}
}
	
	



		
	


