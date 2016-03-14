package org.gradle;

import java.util.ArrayList;
import java.util.List;

import java8.util.stream.Stream;

import static java8.util.stream.StreamSupport.stream;

public class CollectionStreamExample {
	
	public static void main(String [] args){
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		Stream<Integer> myStream = stream(myList);
		myStream.filter((arg0)-> arg0 % 2 == 0)
		.forEach((arg0)->System.out.println("Il valore:" + arg0 + " è pari"));
	}
}
