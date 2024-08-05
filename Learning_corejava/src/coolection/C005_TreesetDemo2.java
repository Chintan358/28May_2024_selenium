package coolection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C005_TreesetDemo2 {
	public static void main(String[] args) {
		
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("node");
		set.add("java");
		
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
				
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
