import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args) {
	HashMap<Integer,Integer> h1=new HashMap<>();
	h1.put(1,1);
	h1.put(2,1);
	System.out.println(h1);
	Iterator<Entry<Integer,Integer>> i1=h1.entrySet().iterator();
	while(i1.hasNext())
	{
	    Entry<Integer,Integer> e2=i1.next();
	    System.out.println(e2.getKey()+":"+e2.getValue());
	}
	h1.replace(1,h1.get(1)+1);
	System.out.println(h1);
	System.out.println(h1.size());
	System.out.println(h1.values());
	}
}
