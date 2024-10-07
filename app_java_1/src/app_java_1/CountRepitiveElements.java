package app_java_1;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountRepitiveElements {

	public static void main(String[] args) {
		int[] array = {4, 3, 2, 1, 1, 1, 2, 2, 2, 3};
        Map<Integer, Long> collect = Arrays.stream(array).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
        collect.forEach((key,value)->{
        	if(value>1) {
        		System.out.println("Elements"+key+"count :"+value);
        	}
        });
	}

}
