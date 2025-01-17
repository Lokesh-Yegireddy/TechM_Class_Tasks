/*
5. Check the two Strings are anagram or not Anagaram:Two strings must be equal 
input:Ramu umar
output:Anagram
 */
package Test_1;

import java.util.Arrays;

public class anagramString {
public static void main(String args[])
{
	String st1="Ramu";
	String str1=st1.toLowerCase();
	char c1[]=str1.toCharArray();
	String st2="umar";
	String str2=st2.toLowerCase();
	char c2[]=str2.toCharArray();
	// System.out.println(c1);
	// System.out.println(c2);
	if(str1.length()==str2.length())
	{
		if(!str1.equals(str2))
		{   
			 Arrays.sort(c1);
			// System.out.println(c1);
			 Arrays.sort(c2);
			
			// System.out.println(c2);
			
			 if(Arrays.equals(c1, c2))
			 {
				 System.out.println("It is An Anagram String");
			 }
			 else
				 System.out.println("Not An Anagram String...!");
			 
		}
		else 
			System.out.println("Not An Anagram String ---> It Is Identical String");
			
		
	}
	else 
		System.out.println("Not An Anagram String...!");
	
}
}
