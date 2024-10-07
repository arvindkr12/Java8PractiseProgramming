package app_java_1;

import java.util.Optional;

public class OptionalExample {
public static void main(String[] args) {
	String value=getNullable();
	Optional<String> ofNullable = Optional.ofNullable(value);
	if(!ofNullable.isEmpty()) {
		System.out.println(ofNullable.get());
	}else {
		throw new NullPointerException();
	}
}

public static String getNullable() {
	return null;
}
}
