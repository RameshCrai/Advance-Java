package streamAPI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FilterPeek {
  @SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	
	Integer[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	conventional method
//	for(int n :nums)
//		if(n>5)
//			System.out.println(n);
//}
//	Stream<Integer> numlist = Arrays.stream(nums);
//	predicate is used for condition checks as it returns a true/false value
	
//	Stream<Integer>numlist1 = numlist.filter(new Predicate<Integer>() {
//
//		@Override
//		public boolean test(Integer integer) {
//
//			return integer > 5;
//		}
//	});
//	numlist1.forEach(n -> System.out.println(n));
	
//	lambda
//	filter is a intermediate 	
//	{return n>5; }
//	Arrays.stream(nums).filter(n-> n>5).forEach(nm->System.out.print(nm+" "));
	
	
//	peek
	Arrays.stream(nums)
	.peek(
			nm-> {System.out.println("processing = "+nm);
			})
	.filter(n-> { 
		System.out.println("Applying for  filter "+n);
		return n>5;
		})
	.forEach(
			nm->System.out.println(nm+" "));
}
}
