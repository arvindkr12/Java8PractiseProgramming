package app_java_5;

import java.util.Arrays;
import java.util.Comparator;

public class CharacterSortingUsingJava8 {
public static void main(String[] args) {
	Character[] letters = {'a', 'B', 'c', 'A', 'D', 'e', 'f', 'C', 'b', 'd'};
	
	Arrays.stream(letters).sorted((i1,i2)->-i1.compareTo(i2)).forEach(System.out::print);// Case-sensitive sorting
	
	System.out.println();
	
	Arrays.stream(letters).sorted(Comparator.comparing(Character::toLowerCase)).forEach(System.out::print);//Case-insensitive sorting
	
	 
	
	  
}
}
