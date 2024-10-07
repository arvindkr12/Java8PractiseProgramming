package app_java_5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayManupulation {

	public static void main(String[] args) {
		Integer arr1 [] = {1,2,3,4,5};
		Integer	arr2 [] = {4,5,6,7,8};//[1, 2, 3, 6, 7, 8]
		
		List<Integer> list1 = Arrays.asList(arr1);
		List<Integer> list2 = Arrays.asList(arr2);
	 System.out.println(common(list1,list2));
	}
	
	public static List<Integer> common(List<Integer>list1,List<Integer>list2){
		return Stream.concat(list1.stream().filter(e->!list2.contains(e)), list2.stream().filter(e->!list1.contains(e))).distinct().collect(Collectors.toList());
	}

}
