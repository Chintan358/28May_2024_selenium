package test;

public class PelindromNumber {
	public static void main(String[] args) {
		
		
		int num = 121;
		
		//4000 + 500 + 60 + 1
		//1000 + 600 + 50 + 4
		int temp = num;
		
		int sum = 0;
		
		while(num!=0)
		{
			int rem = num%10;
			sum = (sum*10)+rem;
			num = num/10;
		}
		
		if(sum==temp)
		{
			System.out.println("Pelindrom");
		}
		else
		{
			System.out.println("not pelindrom");
		}
		
		
		
	}
}
