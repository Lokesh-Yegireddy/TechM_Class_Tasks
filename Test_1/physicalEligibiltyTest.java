/*
9.wap to accept height &weight of a person if height is >=5.5 weight >55kgs then display a massage
person is eligible for physical test other wise print not eligible
*/
package Test_1;

import java.util.*;
public class physicalEligibiltyTest {
	public static void main(String asrgs[]) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter Your Height");
float height=sc.nextInt();
System.out.println("Enter Your Weight");
float weight=sc.nextInt();
if(height>=5.5 && weight>55)
	System.out.println("Eligible For Physical Test");
else
	System.out.println("Not Eligible For Physical Test");
	
}
}