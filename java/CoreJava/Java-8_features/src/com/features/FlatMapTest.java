package com.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,4,5,7,96,74,99);
		List<Integer> list2 = Arrays.asList(10,14,75,67,96,74,99);
		List<Integer> list3 = Arrays.asList(11,47,50,79,9,4,99);
		List<Integer> list4 = Arrays.asList(19,47,54,74,69,7,99);
		
	List<List<Integer>> ll=	Arrays.asList(list1,list2,list3,list4);
List<Integer> list=	 ll.stream().flatMap(w-> w.stream()).collect(Collectors.toList());
	 
		list.stream().forEach(System.out::println);
	}
}
