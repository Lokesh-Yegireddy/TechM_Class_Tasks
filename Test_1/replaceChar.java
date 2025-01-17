/*
 1. Write a program to replace a character at a specific index in this string.
Input: String ="Geeks Gor Geeks&quot" , index = 6, ch = 'F' 
Output: "eeks For Geeks."
 */
package Test_1;

public class replaceChar {
 public static void main(String args[]) {
	 String string="Geeks Gor Geeks";
	 int index=6;
	 char ch='F';
	 String SubString=string.substring(0,index);
	 String newString=SubString+ch+string.substring(index+1);
	 System.out.println('"'+newString+"."+'"');
 }
}
