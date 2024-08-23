package streamAPI;

import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Iterate {
	public static void main(String[] args) {
//		Returns an infinite sequential ordered Stream produced by iterative application of a function
//		Stream<Integer> streamlist = Stream.iterate(0, new UnaryOperator<Integer>() {
//												@Override
//												public Integer apply(Integer in) {
//													return in+1;
//												}
//									    
//											});
////		streamlist.filter(intn -> intn <10)
//		streamlist.limit(13)
////		after complete the limit 13 then close the pipeline
//		.forEach(intnm->System.out.print(intnm+" "));
		
//		reverse order 
		Stream.iterate(0,i -> i+1)
		.limit(10)
		.sorted(Comparator.reverseOrder())
		.forEach(it ->System.out.print(it+" "));
		
		
		
		
	}
}
