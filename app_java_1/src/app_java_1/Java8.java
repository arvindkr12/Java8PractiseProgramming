package app_java_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8 {
public static void main(String[] args) {
	String str = "abc"; 
			//Output: abb bab bba bab bba
	
	System.out.println(generatePermutation(str));
	  
	
	
	
}
public static List<String> generatePermutation(String str){
	List<String> list=new ArrayList<>();
	
	if(str==null || str.length()==0) {
		return list;
	}
	
	permute(str,"",list);
	return list;
}
private static void permute(String str, String prefix, List<String> list) {
	if(str.length()==0) {
		list.add(prefix);
	}else {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			String remaining=str.substring(0,i)+str.substring(i+1);
			permute(remaining,prefix+ch,list);
		}
	}
	
}
}
