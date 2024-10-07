package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingOfString {

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi", "cherry", "fig", "pineapple");
		Map<Integer, List<String>> collect = strings.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(collect);
		
		collect.forEach((length,strList)->{
			System.out.println("length:"+length);
			strList.forEach(System.out::println);
			System.out.println();
		});

	}

}
