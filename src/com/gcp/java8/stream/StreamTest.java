package com.gcp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	public StreamTest(){}
	public void evenoddtest(){
		List<Integer> eolist = Arrays.asList(2,3,4,5,6,7,8,9);
		Predicate<Integer> p = (n -> n%2 != 0);
		List<Integer> evlist = eolist.stream().filter(p).collect(Collectors.toList());
		List<Integer> mevlist = evlist.stream().map(n -> n+1).collect(Collectors.toList());
		System.out.println(mevlist);
	}
	public void stringtest(){
		String str = "girish pandey";
		List<Character> strlist = str.chars().mapToObj(n->Character.toUpperCase((char)n)).collect(Collectors.toList());
		System.out.print(strlist);
	}
	public void sumofdigit(){
		int num = 12345;
		Integer number = String.valueOf(num).chars().map(n->Character.getNumericValue(n)).sum();
		System.out.println(number);
	}
	public void reduceExample(){
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		List<Integer> numbers2 = Arrays.asList(3, 5, 9, 1);
		int max = numbers2.stream().reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println(max);
	}
	public void flatmapexample(){
		List<List<String>> listOfLists = Arrays.asList(
			    Arrays.asList("a", "b", "c"),
			    Arrays.asList("d", "e"),
			    Arrays.asList("f", "g", "h")
			);

			List<String> flatList = listOfLists.stream()
			                                   .flatMap(List::stream)
			                                   .collect(Collectors.toList());
			System.out.println(flatList); // Output: [a, b, c, d, e, f, g, h]

			List<String> words = Arrays.asList("hello", "world");

			List<Character> characters = words.stream()
			                                  .flatMap(word -> word.chars().mapToObj(c -> (char) c))
			                                  .collect(Collectors.toList());

			System.out.println(characters); // Output: [h, e, l, l, o, w, o, r, l, d]
	}
}