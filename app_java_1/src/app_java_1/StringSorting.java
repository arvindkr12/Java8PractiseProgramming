package app_java_1;

import java.util.Arrays;
import java.util.Comparator;

public class StringSorting {

	public static void main(String[] args) {
		Character[] letters = {'a', 'B', 'c', 'A', 'D', 'e', 'f', 'C', 'b', 'd'};
		
		Comparator<Character> comparator=(c1,c2)->{
			int compare = Character.compare(Character.toLowerCase(c1),Character.toLowerCase(c2));
			if(compare!=0) {
				return compare;
			}
			return Character.compare(c1, c2);
		};
		Arrays.sort(letters, comparator);
		System.out.println(Arrays.toString(letters));
	}

}
