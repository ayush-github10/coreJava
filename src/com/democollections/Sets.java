package com.democollections;
import java.util.*;


public class Sets {
	public static void main(String[] args) {
		
		Map<String, Integer> mp=new HashMap<>();
		mp.put("AYUSH",23);
		mp.put("AYAY",56);
		System.out.println(mp);
		System.out.println(mp.entrySet());
		Set<Map.Entry<String,Integer>> s=mp.entrySet();
		

	}

}
