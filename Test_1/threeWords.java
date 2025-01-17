/*
3. The program will recieve 3 English words inputs from Scanner classs
   These three words will be read one at a time, in three separate line 
   The first word should be changed like all vowels should be replaced by *
   The second word should be changed like all consonants should be replaced by @
   The third word should be changed like all char should be converted to upper case
   Then concatenate the three words and print them Other than these concatenated word,
    no other characters/string should or message should be written to output 
    For example if you print how are you then output should be h*wa@eYOU
 */
package Test_1;

import java.util.*;
public class threeWords {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Word");
	String firstWord=sc.next();
	System.out.println("Enter Second Word");
	String secondWord=sc.next();
	System.out.println("Enter Third Word");
	String thirdWord=sc.next();
    String result="";
    for (char c : secondWord.toCharArray()) {
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
        if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
              c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')) {
            result += "@";
        } else {
            result += c;
        }
    } else {
        result += c;
    }
}
  
	String newFirstWord=firstWord.replaceAll("[aeiouAEIOU]", "*");
	String newSecondWord=result;
	String newThirdWord=thirdWord.toUpperCase();
	System.out.println(newFirstWord+newSecondWord+newThirdWord);
	
}
}
