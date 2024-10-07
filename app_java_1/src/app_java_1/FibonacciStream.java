package app_java_1;

import java.util.stream.Stream;

public class FibonacciStream {

	public static void main(String[] args) {
		long fibonacci = fibonacci(10);
		System.out.println(fibonacci);

	}
	
	public static long fibonacci(int n) {
		if(n<=0) {
			throw new IllegalArgumentException("Index must be positive number");
		}
		
		 return Stream.iterate(new long[]{0,1}, fib->new long[] {fib[1],fib[0]+fib[1]})
				.limit(n).reduce((a,b)->b).orElseThrow()[0];
	}

}
