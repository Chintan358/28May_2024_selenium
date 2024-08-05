package coolection;

import java.util.HashSet;
import java.util.Iterator;

public class C003_HashsetDemo {
	public static void main(String[] args) {
		
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("node");
		set.add("java");
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
