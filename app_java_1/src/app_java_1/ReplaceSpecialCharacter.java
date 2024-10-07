package app_java_1;

public class ReplaceSpecialCharacter {

	public static void main(String[] args) {
		String str="shu$%$bh%am";
		String newstr=str.replaceAll("[^a-z A-Z 1-9]", "");
		System.out.println(newstr);

	}

}
