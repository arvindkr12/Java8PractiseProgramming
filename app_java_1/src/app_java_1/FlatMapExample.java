package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
public static void main(String[] args) {
	List<List<String>> list = Arrays.asList(Arrays.asList("one","two"),Arrays.asList("threee","four","five"));
	System.out.println(list);
	List<String> collect = list.stream().flatMap(List::stream).collect(Collectors.toList());
	System.out.println(collect);
	
	List<Integer> list2 = Arrays.asList(1,2,3,4,5,5,6);
	int sum = list2.stream().mapToInt(Integer::intValue).sum();
	System.out.println(sum);
}
}
