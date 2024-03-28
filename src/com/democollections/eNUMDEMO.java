package com.democollections;

import java.util.EnumMap;
import java.util.Map;

public class eNUMDEMO {
	public enum Days
	{
		Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
	}
	
	public static void main(String[] args) {
		
		Days s=Days.Friday;
		System.out.println(s.ordinal());
		EnumMap<Days,Integer> p=new EnumMap<>(Days.class);
		p.put(Days.Monday, 1);
		p.put(Days.Tuesday, 2);
		p.put(Days.Wednesday,3);
		p.put(Days.Thursday, 4);
		p.put(Days.Friday, 5);
		p.put(Days.Saturday, 6);
		p.put(Days.Sunday, 7);
		
		for(Map.Entry<Days, Integer> d:p.entrySet())
		{
			System.out.println(d.getKey()+" "+d.getValue());
		}
		
	}

}
