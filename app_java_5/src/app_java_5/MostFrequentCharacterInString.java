package app_java_5;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacterInString {

	public static void main(String[] args) {
		System.out.println(frequent("swiss"));
		System.out.println(firstNonRepeatitiveCharacter("swiss"));
        System.out.println(firstRepeatitiveCharacter("programming"));
	}
	
	public static char frequent(String str) {
		 LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
         return collect.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);	
	}
	
	public static char firstNonRepeatitiveCharacter(String str) {
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
 	    return collect.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
	
	}
	
	public static char firstRepeatitiveCharacter(String str) {
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    return collect.entrySet().stream().filter(entry->entry.getValue()>1).map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
