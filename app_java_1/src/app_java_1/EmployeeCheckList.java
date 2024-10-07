package app_java_1;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeCheckList {

	public static void main(String[] args) {
	List<Emp>list=List.of(new Emp("Arvind",5000), new Emp("Jayadeep",7000), new Emp("Gulati",12000), new Emp("Sarkar",16000), new Emp("Kiran",25000), new Emp("Surya",30000));
    System.out.println(list);
    
	List<String> list2 = list.stream().filter(i->i.getSalary()>7000).map(Emp::getName).toList();
    System.out.println(list2);
    
    int salary = list.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).toList().get(0).getSalary();
    System.out.println(salary);
    
    List<Emp> collect = list.stream().sorted(Comparator.comparingInt(Emp::getSalary).reversed()).collect(Collectors.toList());
    System.out.println(collect);
    
    double orElse = list.stream().mapToDouble(Emp::getSalary).average().orElse(0);
    System.out.println(orElse);
    
    int salary2 = list.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).toList().get(0).getSalary();
    System.out.println(salary2);
	}

}
