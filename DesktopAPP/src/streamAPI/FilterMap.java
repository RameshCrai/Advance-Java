package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMap {
	public static void main(String[] args) {

		Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		map is intermediate operation  return stream or something (lazy in nature)
		Stream<Integer> integerStream = Arrays.stream(nums);
		Stream<Integer> filterIntegerStream = integerStream.filter(nm -> {
			System.out.println("filter: applying "+nm);
		return nm > 4;
				});
		Stream<String> mappedStream = filterIntegerStream.map(nmb -> {
			System.out.println("Map: mapping number "+nmb);
																		switch (nmb) {
																		case 1:
																			return "One";
																		case 2:
																			return "Two";
																		case 3:
																			return "Threee";
																		case 4:
																			return "Four";
																		case 5:
																			return "Five";
																		case 6:
																			return "Six";
																		case 7:
																			return "Seven";
																		case 8:
																			return "Eight";
																		}
																		return "number is word not available";
		});
		
		long count = mappedStream.count();
		System.out.println("inside mapped Stream ("+count +") elements are available: ");	
		
		
//		Terminal operation (used to trigger stream )		
//		Collect		
//		List<String> collect = mappedStream.collect(Collectors.toList());
//		System.out.println("collect ==="+collect);
		
		
//		foreEach
//		Terminal operation returning void (Grap the result)
//		mappedStream.forEach((n) -> {
//			System.out.println("foreach =" + n);
//		});
	}
}
