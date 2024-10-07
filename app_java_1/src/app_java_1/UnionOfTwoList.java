package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoList {

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");
        List<String> unoin = getUnoin( list1,list2);
        System.out.println(unoin);
	}
	
	public static List<String> getUnoin(List<String> list1,List<String> list2){
		return Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
	}

}
