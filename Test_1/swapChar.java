/*
3. write a Java program to swap the pairs of characters of a string. 
 If the string contains an odd number of characters then the last character remains as it is.
Examples:
Input: str = “Java”
Output: aJav
 */
package Test_1;

public class swapChar {
public static void main(String [] args)
{  
	char temp;
	String str="ramisgoodboy";
	char[] charArray=str.toCharArray();
	if(str.length()%2==0)
	{    
		for(int i=0;i<charArray.length;i=i+2)
		{
			temp=charArray[i];
			charArray[i]=charArray[i+1];
			charArray[i+1]=temp;
		}
		System.out.println(charArray);
	}
	else {
		 charArray=str.toCharArray();
	for(int i=0;i<charArray.length-1;i=i+2)
	{
		temp=charArray[i];
		charArray[i]=charArray[i+1];
		charArray[i+1]=temp;
	}
	 System.out.println(charArray);
}
}
}