/*
1.find all numbers greater than a value x in an array a[]= {2,43,66,92,3,5,13,123,432,44,78} 
input : x=100
output: 123 432
 */
package Test_1;

public class greaterNumbers {
public static void main(String args[])
{
	int a[]= {2,43,66,92,3,5,13,123,432,44,78};
	int x=100;
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>x)
		{
			System.out.print(+a[i]+" ");
		}
	}

}
}
