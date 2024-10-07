package app_java_1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Balanced {
	 
	public static void main(String[] args) {
		 
//		System.out.println(nonRepeating("swiss"));
		String str="swiss";
		 Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println(collect);
	}
	
//	public static char nonRepeating(String str) {
//		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
//	
//	System.out.println(collect);
//	
//	return collect.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
//	}

}
