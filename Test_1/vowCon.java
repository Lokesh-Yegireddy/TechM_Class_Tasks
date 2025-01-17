/*
  10.wap to accept a character from the user & check character is vowel or consonant
 */
package Test_1;

import java.util.*;
public class vowCon {
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Any Character : ");
	 char ch=sc.next().charAt(0);
	 ch=Character.toLowerCase(ch);
	 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
	 {
		 System.out.println(ch+" is Vowel");
	 }
	 else
		 System.out.println(ch+" is Consonet");
}
}
