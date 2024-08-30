package test;

public class ArmstrongNumber {
	public static void main(String[] args) {
		
		//100-999 : 
		
		int num = 153;
		int temp = num;
		int sum = 0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			
			num = num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		
	}
}
