import java.util.*;
import java.util.Map.Entry;
public class Main
{
	public static void main(String[] args) {
//     Create an HashSet
		HashSet<Integer> h1=new HashSet<>();
//     Add Elements using add method
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		System.out.println(h1);
//     Check whether an element is present or not using contains in HashSet
		System.out.println(h1.contains(1));
//     To find the size of the HashSet using HashSet method
		System.out.println(h1.size());
//     To remove an element using remove
		h1.remove(1);
		System.out.println(h1);
//     Convert it into an Strin
		Object[] a1=h1.toArray();
		System.out.println(Arrays.toString(a1));
//     To iterate in an String
		Iterator<Integer> i1=h1.iterator();
		while(i1.hasNext())
		{
		    System.out.println(i1.next());
		}
		
	}
}
