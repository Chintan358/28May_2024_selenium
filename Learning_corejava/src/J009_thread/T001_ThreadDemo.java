package J009_thread;


class T1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000); 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T1 : "+i);
		}
	}
}

class T2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T2 : "+i);
		}
	}
}

public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		T1 t1 = new T1();
		T2 t2 = new T2();
		
//		t1.run();
//		t2.run();
		
	//	t1.start();
	//	t2.start();
		
		t1.setName("A");
		t2.setName("B");
		System.out.println(t1.getName()+" "+t2.getName());
		
		System.out.println(t1.getId()+" "+t2.getId());
		
		//t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println(t1.getPriority()+" "+t2.getPriority());
	}
}
