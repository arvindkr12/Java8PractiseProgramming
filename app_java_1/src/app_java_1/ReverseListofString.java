package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseListofString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
		System.out.println(strings);
		List<String> collect = strings.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
       System.out.println(collect);
	}

}
