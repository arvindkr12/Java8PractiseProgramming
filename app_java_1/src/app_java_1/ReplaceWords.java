package app_java_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {

	public static void main(String[] args) {
		 List<String> dictionary1 = Arrays.asList("cat", "bat", "rat");
	        String sentence1 = "the cattle was rattled by the battery";
	        String result1 = replaceWords(dictionary1, sentence1);
	        System.out.println(result1); 

	}
	
	 public static String replaceWords(List<String> dictionary, String sentence) {
	        Set<String> rootSet = new HashSet<>(dictionary);
	        String[] words = sentence.split("\\s+");
	        StringBuilder sb = new StringBuilder();

	        for (String word : words) {
	            String prefix = "";
	            for (int i = 1; i <= word.length(); i++) {
	                prefix = word.substring(0, i);
	                if (rootSet.contains(prefix)) {
	                    break;
	                }
	            }
	            sb.append(prefix).append(" ");
	        }

	        return sb.toString().trim();
	    }

}
