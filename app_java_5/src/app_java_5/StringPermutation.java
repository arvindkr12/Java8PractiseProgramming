package app_java_5;

import java.util.ArrayList;
import java.util.List;

public class StringPermutation {

	public static void main(String[] args) {
		System.out.println(generatePermuation("ABC"));

	}
	
	public static List<String> generatePermuation(String str){
		List<String> list=new ArrayList<>();
		if(str==null || str.isEmpty()) {
			return list;
		}
		
		permute(str,"",list);
		return list;
	}

	private static void permute(String str, String prefix, List<String> list) {
	   if(str.isEmpty()) {
		   list.add(prefix);
	   }else {
		   for(int i=0;i<str.length();i++) {
			  char ch= str.charAt(i);
			  String remaining=str.substring(0, i)+str.substring(i+1);
			  permute(remaining,prefix+ch,list);
		   }
	   }
	}

	 

}
