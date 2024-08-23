package MothodReference;

import java.util.List;

@FunctionalInterface
public interface Isum {
//	flow first come here but not have implementation
	int sum(int x, int y, int z);

//	@FunctionalInterface It can only have one abstract method,
//	which is the method that can be implemented using a lambda expression or method reference.

}
