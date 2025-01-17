/*
4. Check whether string2 is in string1 or not? string1=”this is java”string2= “java” output: True
 */
package Test_1;

import java.util.Arrays;

public class containString {
	public static void main(String args[])
	{    
		boolean flag=false;
		String string1="this is java";
		String string2= "java";
		String strArr1[]=string1.split(" ");
		for(String str: strArr1)
		{
			if(str.equals(string2))
			{
				flag=true;
			    break;
			}
		
		}
		if(flag==true)
			  System.out.println("True");
			else
				System.out.println("False");
			
	
		
	}
}
