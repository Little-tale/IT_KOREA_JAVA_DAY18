package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args)
	{			//제네릭
		ArrayList<Object> al= new ArrayList();
		al.add(3);
		al.add(5);
		al.add(7);
		al.add(5.5);
		
		al.add("String");
		//Arrays.sort(al.toArray());
		for(int i = 0; i<al.size();++i)
		{
			System.out.println(al.get(i));
		}
		
		
		for (Object data : al)
		{
			System.out.println(al);
		}
		System.out.println(al);
		
		ArrayList<List> ll = new ArrayList<>();
		ll.add(ll);
		System.out.println(ll);
		
		
		
	}
	
	

}
