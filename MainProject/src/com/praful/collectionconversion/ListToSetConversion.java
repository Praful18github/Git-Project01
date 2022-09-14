package com.praful.collectionconversion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ListToSetConversion {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(500);
		list.add(600);
		list.add(700);
		list.add(800);
		list.add(900);
		list.add(1000);
		
		HashSet<Integer> hset=new HashSet<Integer>(list);
		hset.addAll(list);
		Iterator<Integer> itr = hset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
