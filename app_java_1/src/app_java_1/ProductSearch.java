package app_java_1;

import java.util.List;
import java.util.stream.Collectors;

public class ProductSearch {

	public static void main(String[] args) {
		List<Products> list = List.of(new Products(1,"electric",2000),new Products(2,"electronic",4000),new Products(3,"Micros",6000));
        List<Products> collect = list.stream().filter(e->e.getPrice()>2000).collect(Collectors.toList());
	System.out.println(collect);
	}

}
