package practice;


class InsufficinetfundException extends RuntimeException
{
	
}


class HdfcBank
{
	double balance;
	
		public void getBalance()
		{
			
			System.out.println(balance);
		
		}
		
		public void deposit (double amt)
		{
			balance=balance+amt;
		}
		
		public void witdraw(double amt) throws InsufficinetfundException
		{
			if(amt>balance)
			{
				throw new InsufficinetfundException();
			}
			else
			{
				balance=balance-amt;
			}
		}
	
}
public class Bank {

	public static void main(String[] args) {
		
		HdfcBank hb = new HdfcBank();
		
		hb.getBalance();
		
		hb.deposit(5000);
		hb.deposit(6000);
		hb.getBalance();
		try {
			hb.witdraw(15000);
		} catch (InsufficinetfundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		hb.getBalance();
		
	}

}
