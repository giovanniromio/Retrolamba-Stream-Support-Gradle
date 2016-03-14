package org.gradle;

import java.util.Set;
import java.util.stream.LongStream;

//import java8.util.stream.Collectors;
import java.util.stream.Collectors;
import java8.util.stream.LongStreams;
/**
 * 
 * @author Giovanni Romio
 * For making this code snippet works use Java 8 to compile; source code runs in Java 7
 *	This code snippet can be tested throught Eclipse IDE:
 *		1) Right click the Project folder
 *		2) Select gradle 
 *		3) Select Task Quick Launcher
 *		4) Type runApp and execute that command
 */
public class Main {

	public static void main(String [] args){
		/*
		Set<Object> mySet = LongStreams
				.iterate(1,x->x+1)
				.limit(10000)
				.mapToObj(Long::valueOf)								
				.collect(Collectors.toSet())
				;
		System.out.println(mySet);
		*/
		
		Set<Object> mySet = LongStream
				.iterate(1,x->x+1)
				.limit(10000)
				.mapToObj(Long::valueOf)
				.collect(Collectors.toSet());
		System.out.println(mySet);
	}
	
}
