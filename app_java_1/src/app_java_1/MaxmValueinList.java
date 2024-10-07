package app_java_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxmValueinList {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<>();
	list.add(2);
	list.add(5);
	list.add(7);
	list.add(0);
	list.add(30);
	list.add(321);
	Integer integer = list.stream().sorted((i1,i2)->(-i1.compareTo(i2))).collect(Collectors.toList()).get(0);
	System.out.println(integer);
	Integer integer2 = list.stream().filter(i->i%2==0).collect(Collectors.toList()).get(0);
	System.out.println(integer2);
	
	List<Integer> list2 = Arrays.asList(1,4,3,2,22,55,66,77);
	Optional<Integer> findFirst = list2.stream().filter(i->i%2==0).findFirst();
	if(!findFirst.isPresent()) {
		System.out.println("not found");
	}else {
		System.out.println(findFirst.get());
	}
	
}
}
