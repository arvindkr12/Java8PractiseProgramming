package app_java_1;

import java.util.Comparator;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<Employee>list=List.of(new Employee("Arvind",7000), new Employee("Subham",10000), new Employee("Kususm",8000), new Employee("Shivam",12000), new Employee("Vikash",15000), new Employee("Alok",23000), new Employee("John",50000));
	System.out.println(list);
	List<String> list2 = list.stream().filter(i->i.getSalary()>10000).map(Employee::getName).toList();
	System.out.println(list2);
	
	double salary = list.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).toList().get(0).getSalary();
	System.out.println(salary);
	
	double avg = list.stream().mapToDouble(Employee::getSalary).average().orElse(0);
	System.out.println(avg);
}
}
