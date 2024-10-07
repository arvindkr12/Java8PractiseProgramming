package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertMethodReferenceToLemda2 {
public static void main(String[] args) {
	List<String> strings = Arrays.asList("1", "3", "5", "6");
   strings.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
}
}
