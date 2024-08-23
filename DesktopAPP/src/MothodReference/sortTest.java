package MothodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortTest {
	public static void main(String[] args) {

		List<Integer> sl = Arrays.asList(1, 4, 2, 5, 6, 7, 3, 8, 2);
		System.out.println("Sorted Before => " + sl);

//		ISort isort = (list) -> {
//			Collections.sort(list);
//		};

//		by default provide sort method which help for method reference
		ISort isort = Collections::sort;

		isort.sortAList(sl);
		System.out.println("Sorted After => " + sl);

//		Single line lambda can be replaced to method reference
		/*
		 * 1) (no1,no2) -> Ineteger.sum(no1,no2);
		 * 2) Integer::sum;
		 * 3) list->Collections.sort(list)
		 * 4) Collections::sort;
		 */

	}

}
