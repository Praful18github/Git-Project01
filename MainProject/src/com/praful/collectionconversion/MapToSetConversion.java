package com.praful.collectionconversion;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapToSetConversion {

	public static void main(String[] args) {
		
		Map<Integer,String> map= getMap();
		
		//Convert map keys to set
		Set<Integer> KeySet=new HashSet<Integer>(map.keySet());
		KeySet.forEach(key->System.out.println(key));
		
		//conver map values to set
		Set<String> valueSet=new HashSet<String>(map.values());
		valueSet.forEach(value->System.out.println(value));
		

	}
	
	static Map<Integer,String> getMap(){
		
		Map<Integer,String> smap=new HashMap<Integer,String>();
		smap.put(1, "red");
		smap.put(2, "black");
		smap.put(3, "blue");
		smap.put(4, "purple");
		smap.put(5, "white");
		
		return smap;
		
		
	}

}
