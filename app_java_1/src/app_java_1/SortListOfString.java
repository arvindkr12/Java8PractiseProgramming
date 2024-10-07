package app_java_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListOfString {
public static void main(String[] args) {
  	List<String> list=Arrays.asList("Arvind","HEtansh","Prityanshu","Sun","MuraliRadhakrishnan");
  	 list.sort((s1,s2)->-Integer.compare(s1.length(), s2.length()));
 	 list.forEach(System.out::println);
	 
// 	 List<Integer>list=new ArrayList<>();
// 	 list.add(3);
//  list.add(2);
// 	 list.add(4);
// 	 list.add(5);
// 	 list.add(34);
// 	 list.add(311);
// 	  List<Integer> list2 = list.stream().filter(i->i%2==0).toList();
// 	  System.out.println(list2);
 	  
}
}
