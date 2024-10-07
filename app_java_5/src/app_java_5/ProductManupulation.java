package app_java_5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 

public class ProductManupulation {

	 public static void main(String[] args) {
		 List<Product> list=List.of(new Product("car",4000), new Product("bus",10000), new Product("truck",500),new Product("train",40000) );
	
	    List<String> list2 = list.stream().filter(prod->prod.getPrice()>500).map(Product::getName).toList();
	    
	    System.out.println(list2);
	    
	    int secondHighest = list.stream().sorted(Comparator.comparingDouble(Product::getPrice).reversed()).skip(1).toList().get(0).getPrice();
	    
	   System.out.println(secondHighest);
	   
	   Double average = list.stream().collect(Collectors.averagingInt(Product::getPrice));
	   
	   System.out.println(average);
	   
	   Integer sum = list.stream().collect(Collectors.summingInt(Product::getPrice));
	   
	   System.out.println(sum);
	   
	   List<Product> collect = list.stream().sorted((p1,p2)->p1.getName().compareTo(p2.getName())).collect(Collectors.toList());
	   
	   System.out.println(collect);
	   
	   List<Product> list3 = list.stream().sorted(Comparator.comparingDouble(Product::getPrice)).toList();  
	   System.out.println(list3 );
	 }
}
