package com.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList();
		list.add("Sumeet");
		list.add("Sujeet");
		list.add(1,"Sujata");
		list.add(2,"Sarita");
		list.add(3,"Shweta");
		list.add(0,"Swati");
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		for(String s : list) {
			System.out.println(s);
			
		}
		ArrayList<String> list1 = new ArrayList();
		list1.add("Dhanbad");
		list1.add("Bokaro");
		System.out.println(list1);
		list1.addAll(list);
		System.out.println(list1);
		for(String s1 : list1) {
			System.out.println(s1);
		}
		
		ListIterator<String> it =list1.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		System.out.println("*****");
	
		
	}

}
