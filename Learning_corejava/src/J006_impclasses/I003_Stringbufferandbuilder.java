package J006_impclasses;

public class I003_Stringbufferandbuilder {
	public static void main(String[] args) {
		
		
		//syncronised
		double startTime  = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Hello");
		for(int i=1;i<=100000;i++)
		{
			sb.append("java");
		}
		//System.out.println(sb);
		double endTime = System.currentTimeMillis();
		
		//asyncronised
		double startTime1  = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Hello");
		for(int i=1;i<=100000;i++)
		{
			sb1.append("java");
		}
		double endTime1 = System.currentTimeMillis();
		//System.out.println(sb1);
		
		//System.out.println("time takne by buffer : "+(endTime-startTime));
		//System.out.println("time takn by builder : "+(endTime1-startTime1));
		
		System.out.println(System.currentTimeMillis());
	}
}
