/*
2. Given a string s, write a Java program to print all words with even length in the given string.
Example to print even length words in a String
Input: s = “i am Geeks for Geeks and a Geek” 
Output: am Geek
 */
package Test_1;

import java.util.Arrays;
public class evenWords {
 public static void main(String args[])
 {   
	 String SubString="";
	 String Output="";
	 String s="i am Geeks for Geeks and a Geek";
	 String[] stringArray=s.split(" ");
	// System.out.println(Arrays.toString(stringArray));
	 
	 for(int i=0; i<stringArray.length;i++)
	 {
		if(stringArray[i].length()%2==0)
		{
			Output+=stringArray[i]+" ";
		}
		
	 }
	 System.out.println(s);
	 System.out.println("Output :"+Output);
 }
}

		
		
