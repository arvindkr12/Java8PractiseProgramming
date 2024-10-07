package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoList {

	public static void main(String[] args) {
		 List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
	        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");
	        List<String> list = getintersection(list1, list2);
	        System.out.println(list);
	}
	
	public static List<String> getintersection(List<String> list1,List<String> list2){
		Set<String> set = list2.stream().collect(Collectors.toSet());
		return list1.stream().filter(set::contains).collect(Collectors.toList());
	}

}
