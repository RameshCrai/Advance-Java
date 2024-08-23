package MothodReference;

public class sumTest {

	public static void main(String[] args) {
//		Anonymous
//		Isum isum = new Isum() {			
//			@Override
//			public int sum(int x, int y) {
//	
//				return x+y;
//			}
//		};
//		int s = isum.sum(10, 20);
//		System.out.println("anonymous => "+s);

//  lambda
//		Isum isum = (x, y) -> x + y;
//		int s = isum.sum(10, 20);
//		System.out.println("lambda  => " + s);

//		method reference with static
//		Isum isum3 = sumTest::addition;
//		int s = isum3.sum(10, 40);
//		System.out.println("method reference =>"+s);

		
//		Integer::sum; take only two parameter (0,0) because this is inbuilt function
		Isum isum4 = sumTest::addition;
		/* (a,b) -> { return Integer.sum(a,b); */
		int s = isum4.sum(10, 40, 60);
		System.out.println("method reference =>" + s);

	}

	public static int addition(int v1, int v2, int v3) {
		return v1 + v2;
	}

}
