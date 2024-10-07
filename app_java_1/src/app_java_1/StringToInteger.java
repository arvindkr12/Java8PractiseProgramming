package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringToInteger {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("1","3","5","7","9","10","12");
		System.out.println(list);
		List<Integer> collect = list.stream().map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(collect);

	}

}
