package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,3,4,5,6,7,8,9,2,3,4,5,6);
		List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);

	}

}
