package app_java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfListOfInteger {
public static void main(String[] args) {
	List<Integer>list=new ArrayList<>();
	 list.add(3);
     list.add(2);
	 list.add(4);
	 list.add(5);
	 list.add(34);
	 list.add(311);
	 List<Integer> collect = list.stream().map(i->(i*i)).collect(Collectors.toList());
	 System.out.println(collect);
	 List<Integer> collect2 = list.stream().filter(i->i>10).collect(Collectors.toList());
	 System.out.println(collect2);
}
}
