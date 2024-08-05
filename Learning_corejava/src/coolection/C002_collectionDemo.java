package coolection;

import java.util.ArrayList;
import java.util.Iterator;

public class C002_collectionDemo {
	public static void main(String[] args) {
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Java");
		al1.add("Php");
		
		
		
		ArrayList al = new ArrayList<>();
		al.add(10);
		al.add("Hello");
		al.add(25.36);
		al.add('A');
		al.addAll(al1);
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
