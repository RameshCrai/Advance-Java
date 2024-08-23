package streamAPI;

import java.util.List;
import java.util.stream.Stream;

public class Sorted {
	public static void main(String[] args) throws InterruptedException {
//          Stream.of(1,2,3,4,5,8,7,8,9).sorted().forEach(s->{
//        	  System.out.println(s);
//          });
//  Stream<Integer> streamlist = Stream.of(1,2,3,4,5,8,7,8,9);
//  Stream<Integer> sortedlist = streamlist.sorted().filter(n -> n>6);  
//  sortedlist.forEach(nm -> System.out.println(nm));

		/*
		 * Intermediate operation => 1)stateful->[distinct, sorted may incorporate state
		 * from previously seen elements when processing new elements. ]
		 * 
		 * that wait for another element to sort like (1,2,3,4) then print
		 * 
		 * 2)stateles->[filter,map retain no state from previously seen element when
		 * processing a new element, each element can be processed independently of
		 * operations on other element]
		 * 
		 * that don't wait for another element to filter  like(1 filter  goes to print, 2 filter  goes to print)
		 * 
		 * 
		 */

		Stream.of("Ramesh", "Binu", "Abhi", "Soniya", "ab")
//		1) stateles Does not retained
				.filter(namString -> {
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("filter => " + namString.toUpperCase());
					return namString.length() > 2;
				})
//		sorted method has kind of memory stateful(
				.sorted()
//		Thread.sleep(3000);
				.peek(pn -> System.out.println("sorted =>" + pn)).forEach(n -> System.out.println(n));

	}
}
