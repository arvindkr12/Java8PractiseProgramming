package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEmptyString {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ARvind","","","","Shiva","Rama");
//		long count = list.stream().filter(s->s.equals("")).count();
		long count = list.stream().filter(String::isEmpty).count();
		System.out.println(count);
		
		List<String> list2 = Arrays.asList("shiva","manya","bittu","prity","pihu");
		List<String> collect = list2.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		String collect2 = list2.stream().collect(Collectors.joining("::"));
		System.out.println(collect2);
	}

}
