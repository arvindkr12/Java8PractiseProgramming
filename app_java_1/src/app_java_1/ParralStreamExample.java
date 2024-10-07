package app_java_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParralStreamExample {

	public static void main(String[] args) {
 List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);	
 List<Integer> squares = list.parallelStream().map(n->n*n).toList();
 
 System.out.println(list);
 System.out.println(squares);

}
}
