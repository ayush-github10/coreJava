package com.self;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<Project> plist=new ArrayList<>();
		plist.add(new Project(1,"Python","Noida"));
		plist.add(new Project(2,"Python","Noida"));
		plist.add(new Project(3,"Python","Banglore"));
		plist.add(new Project(4,"React","Chennai"));
		plist.add(new Project(5,"React","Noida"));
		plist.add(new Project(6,"SAP","Noida"));
		plist.add(new Project(7,"SAP","Chennai"));
		plist.add(new Project(8,"Java","Noida"));
		plist.add(new Project(9,"Java","Chennai"));
		plist.add(new Project(10,"Java","Banglore"));
		
		//plist.stream().filter(p->p.location=="Chennai").forEach(n->System.out.println(n));
		Map<String, Long> ct=plist.stream().collect(Collectors.groupingBy(Project::getlocation,Collectors.counting()));
		System.out.println(ct);
		
	}

}
