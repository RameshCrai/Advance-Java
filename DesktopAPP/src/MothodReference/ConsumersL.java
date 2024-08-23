package MothodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConsumersL {
	public static void main(String[] args) {
//		Set interface not support duplicate elements 
//		Set<Integer> integerLi = Arrays.asList(1,4,2,3,5,8,7);
		
		List<Integer> integerLogic = Arrays.asList(1,4,2,3,5,8,7);
		System.out.println(integerLogic);
		Consumer<List<Integer>> sortingLogic  = Collections::sort;
		sortingLogic.accept(integerLogic);
		System.out.println(integerLogic);
		
		
		
		
		
		
		
//		biFunction it is a interface
		System.out.println("=========== sum +++ BiFunction");
		BiFunction<Integer, Integer, Integer> sumFeature  = ConsumersL::multiply;
		Integer sum = sumFeature.apply(40, 60);
		System.out.println(sum);
		
		
//		BiPredicate<String, String> e = Objects::equals;
		
		
		
//		Function		
		Function<Object, Integer> calculateHash = Objects::hashCode;
		int hash = calculateHash.apply(new sortTest());
		System.out.println(hash);
		System.out.println("============");
		
//		Consumer		
//		Consumer<Object> consu_calculateHash = Objects::hashCode;
//		consu_calculateHash.accept(new sortTest());
//		System.out.println(consu_calculateHash);
//		
		
		
		
		
	}
	
	public static int multiply(int a, int b) {
		return a*b;
	}

}
