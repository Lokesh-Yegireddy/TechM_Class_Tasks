/*
11.Given an integer n, perform the following conditional actions:should be between (1 to 100)
I) if n is odd, print weird
ii) if n is even and in the inclusive range of 2 to 5 print not weird
iii) if n is even & it is in the inclusive range of 6to20 print wweird
iv) if n is even &>20 print not weird
 */
package Test_1;

import java.util.*;
public class weird {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Any Integer Value between 1 to 100");
	int n=sc.nextInt();
	if(n>=1&&n<=100) {
	if(n%2!=0)
	{
		System.out.println("weird");
	}
	
	else if(n%2==0&&n>=2 && n<=5)
		System.out.println("not weird");
	else if(n%2==0&&n>=6 && n<=20)
		System.out.println("wweird");
	else if (n%2==0&&n>20)
		System.out.println("not weird");
	
	}
	else
		System.out.println("Enter Any Integer Between 1 to 100 Only");
}
}
