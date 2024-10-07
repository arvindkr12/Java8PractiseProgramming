package app_java_1;

import java.util.Arrays;
import java.util.List;

public class ConvertMethodReferenceToLemda {
public static void main(String[] args) {
	List<String> strings = Arrays.asList("apple", "banana", "pear", "kiwi");
//	strings.forEach(System.out::println);//method reference
	strings.forEach(s->System.out.println(s));//lemda exp
}
}
