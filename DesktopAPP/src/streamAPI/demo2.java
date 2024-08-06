package streamAPI;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;


public class demo2 {
	public static void main(String[] args) {
		  Supplier<String> supplier = new Supplier() {
				
				@Override
				public String get() {
				       
					return "Hello stream data";
				}
			};
			Consumer<String> consumer = new Consumer<String>() {

				@Override
				public void accept(String t) {
					System.out.println("Stream =="+t);
					
				}
				
			};

//			generated stream create a infinite stream object
			Stream<String> streamOfString =  Stream.generate(supplier);
			streamOfString.forEach(consumer);
		

	}

}
