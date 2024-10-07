package app_java_1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer integer = numbers.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList()).get(1);
		System.out.println(integer);
		int sum = numbers.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	Integer collect = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
System.out.println(collect);
	}

}
