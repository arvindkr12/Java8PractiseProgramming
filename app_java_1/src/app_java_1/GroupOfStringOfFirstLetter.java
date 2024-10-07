package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfStringOfFirstLetter {

	public static void main(String[] args) {
		 List<String> strings = Arrays.asList("apple", "banana", "apricot", "blueberry", "cherry", "avocado");
         Map<Character, List<String>> collect = strings.stream().collect(Collectors.groupingBy(s->s.charAt(0)));
         collect.forEach((key,value)->{
        	 System.out.println("letter :"+key);
        	 System.out.println("words: "+value);
        	 System.out.println();
         });
	}

}
