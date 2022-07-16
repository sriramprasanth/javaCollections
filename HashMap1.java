import java.util.*;
import java.util.Map.Entry;

public class Main
{
	public static void main(String[] args) {
	HashMap<Integer,Integer> h1=new HashMap<>();
	h1.put(1,1);
	h1.put(2,1);
// Printing the Hashmap
	System.out.println(h1);
// Used to get the values of the key
	System.out.println(h1.get(1));
// getOrDefault will find whether the key is present if so will print he value for or else prints the default value 
	System.out.println(h1.getOrDefault(1,"Not Found"));
	Iterator<Entry<Integer,Integer>> i1=h1.entrySet().iterator();
	while(i1.hasNext())
	{
	    Entry<Integer,Integer> e2=i1.next();
	    System.out.println(e2.getKey()+":"+e2.getValue());
	}
// Replace is used for checking if a value is present and iterating the "value" of the Key
	h1.replace(1,h1.get(1)+1);
	System.out.println(h1);
// To get size of the hashmap
	System.out.println(h1.size());
// To print all the values in a HashMap but we cannot put into array as collections cannot be converted to array 
	System.out.println(h1.values());
	
// 	if(!h1.containsValue(10)) we can also use containsValue to check whether a valu is present or not
	if(!h1.containsKey(3))
	{
	h1.put(3,1);
	}
// 	Removes all the key and value can specify if we want
	h1.remove(3)
	}
}
