/*
2. Take input array as {1, 2, 3, 4, 2, 7, 8, 8, 3} and print the duplicate number from the array..
Input : int a[] = {1, 2, 3, 4, 2, 7, 8, 8, 3}
Output : 2,3,8
 */
package Test_1;

import java.util.Arrays;

public class duplicateNumbers {
public static void main(String asrgs[])
{   
	int[] a= {1,2,3,4,2,7,8,8,3};
	 boolean checked[]=new boolean[a.length];
	for(int i=0;i<a.length;i++)
	{  if(!checked[i]) {
    for(int j=i+1;j<a.length;j++)
    {
    	if(a[i]==a[j]) {
    		System.out.print(a[i]+" ");
    		 checked[i]=true;
    	    break;
    	}}
	}
	
}
	//System.out.println(Arrays.toString(checked));
}
}
