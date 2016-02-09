package org.gradle;



import java.util.Set;


import java8.util.stream.Collectors;
import java8.util.stream.LongStreams;

public class TestLambda {

	public static void main(String [] args){
		/*use java8 to compile; source code runs in java7*/
		Set<? extends Object> mySet = LongStreams
				.iterate(1,x->x+1)
				.limit(10000)
				.filter(n -> n % 2 != 0)	
				.mapToObj(Long::valueOf)								
				.collect(Collectors.toSet())
				;
		System.out.println(mySet);
		
	}
	
}
