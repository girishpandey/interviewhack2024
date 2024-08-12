package com.gcp.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public StreamTest(){}
	public void evenoddtest(){
		//int [] eoarr = {2,3,4,5,6,7,8,9};
		List<Integer> eolist = Arrays.asList(2,3,4,5,6,7,8,9);
		List<Integer> evlist = eolist.stream().filter(n -> n%2 != 0).collect(Collectors.toList());
		System.out.println(evlist);
	}
}