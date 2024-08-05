package coolection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C004_LinkedHashsetDemo2 {
	public static void main(String[] args) {
		
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
