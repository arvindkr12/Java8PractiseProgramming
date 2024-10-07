package app_java_1;

public class Emp {
private String name;
@Override
public String toString() {
	return "Emp [name=" + name + ", salary=" + salary + "]";
}
public Emp(String name, int salary) {
	super();
	this.name = name;
	this.salary = salary;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
private int salary;

}
