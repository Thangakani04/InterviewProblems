package com.practice.student.demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Handson1 {
	
	public static void main(String[] args) {
		String name="Yesu Raja";
		
		String clearedString=name.replace(" ", "").toLowerCase();
		
		System.out.println(clearedString);
		
		Map<Object, Long> result=clearedString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(result);
	}

}
