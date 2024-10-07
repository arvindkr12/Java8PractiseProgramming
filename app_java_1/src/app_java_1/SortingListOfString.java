package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListOfString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "cherry", "fig", "pineapple");
		List<String> collect = strings.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println(collect);

	}

}
