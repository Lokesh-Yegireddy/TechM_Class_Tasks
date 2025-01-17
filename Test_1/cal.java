/*
7. wap to accept two numbers & an operator (+, -, *, /) from the user, perform the operations based
on the operators?
 */
package Test_1;

import java.util.*;
public class cal {
public static void main(String args[])
{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter any value");
	 int num1=sc.nextInt();
	 System.out.println("Enter any value");
	 int num2=sc.nextInt();
	 System.out.println("Enter any operation : +,-,*,/");
	 char ch=sc.next().charAt(0);
	 switch(ch) {
	 case '+' : System.out.println("Addition :"+(num1+num2));
	             break;
	 case '-' : System.out.println("Subtraction :"+(num1-num2));
	             break;
	 case '*' : System.out.println("Multiplication :"+(num1*num2));
	             break;
	 case '/' : System.out.println("Division :"+(num1/num2));
	             break;
	 default :
		       System.out.println("Invalid Operator");
	 
	 
}}
}
