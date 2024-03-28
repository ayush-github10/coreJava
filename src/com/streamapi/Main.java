package com.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<Product> plist=new ArrayList<>();
		plist.add(new Product(101,"Laptop",50000));
		plist.add(new Product(102,"Iphone",45000));
		plist.add(new Product(103,"Phone",20000));
		plist.add(new Product(104,"Desktop",18000));
		plist.add(new Product(105,"Mouse",500));
		plist.stream().filter(p->p.price>=20000).forEach(n->System.out.println(n));//to do it in one line
		plist.stream().map(s->s.price+100).forEach(s->System.out.println(s));
	//	Map<String, Long> ct=plist.stream().collect(Collectors.groupingBy(Product::getName,Collectors.counting()));
		//System.out.println(ct);
		//plist.stream().filter(p->p.
		//	getName().equals("Laptop")).forEach(System.out::println);
		
		//Optional<Product> maxPrice = plist.stream().collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)));
		//System.out.println(maxPrice);
		
		
		
		
		/*for(Product p:plist)//long method
		{
			if(p.price>20000)
			System.out.println(p);
		}*/
		
		
		
		
		
		
		
	}

}
