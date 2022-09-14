package com.praful.collectionconversion;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Set;

public class SetToListConversion {

	public static void main(String[] args) {
		
		HashSet<String> hset=new HashSet<String>();
		hset.add("radha");
		hset.add("pruthvi");
		hset.add("shlok");
		hset.add("Ojaswi");
		hset.add("bhavi");
		
		ArrayList<String> alist=new ArrayList<String>(hset);
		hset.addAll(alist);
		for(String str:alist) {
			System.out.println(str);
		}
		

	}

}
