package MothodReference;

public class IPrintDevTest {
	
	public static void main(String[] args) {
		IPrintDev print = IPrintDevTest::display;
		print.printI("Ramesh");
		
	}
	
	public static String display(String s) {
		System.out.println(s);
		return s;
	}

}
