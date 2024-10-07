package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartionOfEvenOdd {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println("Even"+collect.get(true));
        
        System.out.println("Odd"+collect.get(false));
        
       Double collect2 = numbers.stream().collect(Collectors.averagingInt(n->n));
       System.out.println(collect2);
       
       Integer collect3 = numbers.stream().collect(Collectors.summingInt(n->n));
       System.out.println(collect3);
	}

}
