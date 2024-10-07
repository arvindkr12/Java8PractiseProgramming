package app_java_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionOfTwoList {
public static void main(String[] args) {
	List<String> list1 = Arrays.asList("apple", "banana", "cherry", "date");
    List<String> list2 = Arrays.asList("banana", "date", "fig", "grape");
    System.out.println("Union of two list with distinct elements :"+union(list1,list2));
    System.out.println("intersection of two list :"+getIntersection(list1,list2));
}

public static List<String> union(List<String>list1,List<String>list2){
	 return Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
}

public static List<String> getIntersection(List<String>list1,List<String>list2){
	 return list2.stream().filter(e->list1.contains(e)).toList();
}
}
