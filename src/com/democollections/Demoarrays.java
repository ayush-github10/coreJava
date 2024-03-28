package com.democollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demoarrays {
	public static void main(String[] args) {
		
		List<Integer>num=new ArrayList<>();
		num.add(100);
		num.add(200);//duplicates are allowed too 
		List<Integer>num2=new ArrayList<>();
		num.addAll(Arrays.asList(20,40,676));
		num2.add(1000);
		num2.add(2000);
		num2.addAll(num);
		
		System.out.println(num);
		
		/*int[] arr= {3,1,6,9,4,8,2};
		Arrays.sort(arr);
		for(int i:arr)
		{
			System.out.println(i);
		}*/
		

}
}
