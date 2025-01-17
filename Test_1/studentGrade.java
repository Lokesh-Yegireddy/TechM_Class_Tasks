/*
8.wap to display the grade of student avg=80 – printA, if avg is <80& >=60 print B grade. Avg =40
print c grade else print grade D
 */
package Test_1;

import java.util.*;
public class studentGrade {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Subject 1 Marks");
	float s1=sc.nextFloat();
	System.out.println("Enter Subject 2 Marks");
	float s2=sc.nextFloat();
	System.out.println("Enter Subject 3 Marks");
	float s3=sc.nextFloat();
	System.out.println("Enter Subject 4 Marks");
	float s4=sc.nextFloat();;
	System.out.println("Enter Subject 5 Marks");
	float s5=sc.nextFloat();
	float average=(s1+s2+s3+s4+s5)/5;
	System.out.println("Average Marks :"+average);
	if(average>=80)
		System.out.println("Grade : A");
	else if(average<80 && average>=60)
		System.out.println("Grade : B");
	else if(average>=40 && average<60)
		System.out.println("Grade : C");
	else
		System.out.println("Grade : D");
	
}
}
