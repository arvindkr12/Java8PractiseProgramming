package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
public static void main(String[] args) {
	List<String> list = Arrays.asList("one","two","three");
	List<Integer> collect = list.stream().map(String::length).collect(Collectors.toList());
	System.out.println(collect);
}
}
