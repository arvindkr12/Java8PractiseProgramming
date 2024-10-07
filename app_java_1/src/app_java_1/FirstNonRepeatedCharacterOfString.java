package app_java_1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterOfString {

	public static void main(String[] args) {
		 String input = "swiss";
		 Character character = findFirstNonRepetitiveCharacter(input);
		 System.out.println(character);
	}
	
	public static Character findFirstNonRepetitiveCharacter(String str ) {
		
		LinkedHashMap<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
	    
		return collect.entrySet().stream().filter(entry->entry.getValue()==1).map(Map.Entry::getKey).findFirst().orElse(null);
	}

}
