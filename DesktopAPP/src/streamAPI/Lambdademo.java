package streamAPI;

import java.util.stream.Stream;

public class Lambdademo {
	public static void main(String[] args) {

//		generated stream create a infinite stream object
		Stream.generate(() -> "Hello generate").forEach(str -> System.out.println("Stream ==" + str));
	}
}
