package coolection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		//defalut size : 10
		//new size = oldsize * 3/2 + 1 = 16
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("php");
		al.add("android");
		al.add("ios");
		al.add("Java");
		al.add(null);
		
		//al.add(1,"node");
		//al.set(1, "Node");
		//al.remove(4);
		//System.out.println(al.get(1));
		
		//System.out.println(al.size());
		
//		for(String s : al)
//		{
//			System.out.println(s);
//		}
		
		
		Iterator<String> itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}
}
