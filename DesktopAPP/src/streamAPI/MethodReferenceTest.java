package streamAPI;

public class MethodReferenceTest {
	public static void main(String[] args) {
//		abstract method (which does'n have any name
		MethodReference1 sobj = new MethodReference1() {
			@Override
			public int sum(int x, int y) {
				return x + y;
			}
		};
		int s = sobj.sum(10, 20);
		System.out.println("sum of =" + s);
		
		
		
		
//		java v-1.8 after (Lambda)  (int x, int y)->signeture
		MethodReference1 slambda = (int x, int y)->{
				return x + y;			
		};
		int sumofl = slambda.sum(25, 15);
		System.out.println("print lambda = "+sumofl);
		
		
		
		
		
		
		
		
//		method reference 
		MethodReference1 sum2 = MethodReferenceTest::addition;
		int sum3 = sum2.sum(20, 30);
		System.out.println("method reference = "+sum3);
		
		
		
	}
	
	public static int addition(int x, int y) {
		return x+y;
		
	}
}
