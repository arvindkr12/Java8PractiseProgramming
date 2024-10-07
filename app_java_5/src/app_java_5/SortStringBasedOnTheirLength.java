package app_java_5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringBasedOnTheirLength {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("shakti","rama","ashanyan","ty","p","shanmathimana");
        list.sort((s1,s2)->Integer.compare(s1.length(), s2.length()));
        list.forEach(System.out::println);
        
        List<String> collect = list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	    System.out.println(collect);
	}

}
