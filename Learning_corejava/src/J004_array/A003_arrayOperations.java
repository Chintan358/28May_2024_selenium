package J004_array;

import java.util.Iterator;

public class A003_arrayOperations {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,20,10,5,2,6,89,80,14,12,15};
		
		int sum = 0;
		
		for(int i=0;i<a.length;i++)
		{
			//sum = sum + a[i];
			sum += a[i];
		}
		System.out.println("sum is : "+sum);
		System.out.println("Avg is : "+(sum/a.length));
		
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max  =a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
			
			
		}
		
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
	}
}
