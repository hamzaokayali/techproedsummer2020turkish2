package day33iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);

		ListIterator<String> li1 = list1.listIterator();
		
		while(li1.hasNext()) {
			Object el = li1.next();
			li1.remove();
		}
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("B");
		list2.add("C");
		System.out.println(list2);
ListIterator<String> li2 = list2.listIterator();
		
		while(li2.hasNext()) {
			String el = li2.next();
			li2.set(el.replace(el , "xxx"));
		}
		System.out.println(list2);
		
		
		
		
	}

}
