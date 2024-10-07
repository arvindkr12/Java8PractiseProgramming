package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DifferenceOfTwoList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");
        List<String> difference = getDifference(list1,list2);
        System.out.println(difference);
	}

	public static List<String> getDifference(List<String> list1,List<String> list2){
		return list1.stream().filter(element->!list2.contains(element)).collect(Collectors.toList());
//	Set<String> collect = list1.stream().collect(Collectors.toSet());
//	return list2.stream().filter(collect::contains).collect(Collectors.toList());
	
	}
}
