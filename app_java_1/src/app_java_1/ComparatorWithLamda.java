package app_java_1;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparatorWithLamda {

	public static void main(String[] args) {
		List<Person> list = List.of(new Person("Abhi",12), new Person("Abhishek",2), new Person("sunny",5), new Person("vishal",22), new Person("Rahul",10));
        
		//sort by age using lemda expression
		 int age = list.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).skip(1).collect(Collectors.toList()).get(0).getAge();
	System.out.println(age);
	
	double orElse = list.stream().mapToInt(Person::getAge).average().orElse(0);
	System.out.println(orElse);
	
	Integer collect = list.stream().collect(Collectors.summingInt(Person::getAge));
	System.out.println(collect);
	
	Double collect2 = list.stream().collect(Collectors.averagingInt(Person::getAge));
	System.out.println(collect2);
	
	List<Person> collect3 = list.stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList());
	
	System.out.println(collect3);
	
	List<Person> collect4 = list.stream().sorted((s1,s2)->s1.getName().compareTo(s2.getName())).collect(Collectors.toList());
	System.out.println(collect4);
	
	List<Person> list2 = list.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).toList();
	System.out.println(list2);
	
	int second=list.stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).skip(1).collect(Collectors.toList()).get(0).getAge();
	System.out.println(second);
	}
	

}
