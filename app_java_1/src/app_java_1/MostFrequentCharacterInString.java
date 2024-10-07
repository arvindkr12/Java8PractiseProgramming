package app_java_1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharacterInString {

	public static void main(String[] args) {
		 String input = "swiss";
		 Character mostFrequentcharacter = mostFrequentcharacter(input);
		 System.out.println(mostFrequentcharacter);

	}
	
	public static Character mostFrequentcharacter(String str) {
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  return collect.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
	
	}

}
